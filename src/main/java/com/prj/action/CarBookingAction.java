package com.prj.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.ApplicationConstants;
import com.prj.model.Booking;
import com.prj.model.BookingStatus;
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CarModel;
import com.prj.model.CarStatusEnum;
import com.prj.model.CustomerRequestModel;
import com.prj.model.InvoiceType;
import com.prj.model.Penalty;
import com.prj.model.TripPenaltyModel;
import com.prj.model.TripInvoice;
import com.prj.model.User;
import com.prj.service.IBookingService;
import com.prj.service.ICarHubService;
import com.prj.service.IInvoiceService;
import com.prj.service.IMailService;
import com.prj.service.impl.CarBookingService;
import com.prj.util.DateTimeUtility;

@SuppressWarnings("serial")
public class CarBookingAction extends ActionSupport implements SessionAware, RequestAware {

	private Map<String,Object> request;

	private Map<String,Object> session;

	private CarBookingService carBookingService;

	private IBookingService bookingService;

	private CustomerRequestModel customerRequestModel;

	private TripPenaltyModel tripPenaltyModel;

	private DateTime dropOffDate;

	private DateTime pickupDate;

	private String tripCost;

	private String bookingId;

	private String regNo;

	private String modelName;

	private ICarHubService carHubService;

	private IMailService mailService;

	private IInvoiceService invoiceService;

	private static final Logger LOGGER = LoggerFactory.getLogger( CarBookingAction.class );

	public String estimatedTripCost() {

		User user = ( User ) session.get( "loggedUser" );
		session.remove( "actionName" );
		if ( user != null ) {
			dropOffDate = ( DateTime ) session.get( "dropOffDate" );
			pickupDate = ( DateTime ) session.get( "pickupDate" );
			CarHub carHub = ( CarHub ) session.get( "carHub" );

			CarModel carModel = new CarModel();

			if ( customerRequestModel != null && customerRequestModel.getCarModel() != null ) {
				carModel = customerRequestModel.getCarModel();
			} else {
				carModel.setName( ( String ) session.get( "carModelName" ) );
				session.remove( "carModelName" );
			}

			List<Car> cars = carBookingService.getAvailableCarsByModel( carModel , carHub , pickupDate.toDate() , dropOffDate.toDate() );
			session.put( "car" , cars.get( 0 ) );
            TripInvoice prvInvoice = ( TripInvoice ) session.get( "previousInvoice" );

			TripInvoice invoice = bookingService.createInvoiceForPreview( cars , user , pickupDate , dropOffDate , prvInvoice != null , prvInvoice );

			session.put( "tripInvoice" , invoice );

			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	public String tripBooking() {

		//payment gateway has to come 
		User user = ( User ) session.get( "loggedUser" );
		dropOffDate = ( DateTime ) session.get( "dropOffDate" );
		pickupDate = ( DateTime ) session.get( "pickupDate" );
		CarHub carHub = ( CarHub ) session.get( "carHub" );
		TripInvoice invoice = ( TripInvoice ) session.get( "tripInvoice" );
		Booking booking = bookingService.createBookingAndFirstInvoice( ( Car ) session.get( "car" ) , user , pickupDate , dropOffDate , invoice , carHub );
		mailService.sendEmail( "Your OSD Booking" ,
			"Your booking has been done.<br/>Your Booking ID :" + booking.getBookingRef() + "<br/>Paid Total Amount :" + invoice.getTotal() , user.getEmailId() ,
			ApplicationConstants.SYSTEM_ID , ApplicationConstants.CLIENT_ID );
		session.remove( "previousInvoice" );
		request.put( "booking" , booking );
		return SUCCESS;
	}

	public String getUsersUpcomingTrip() {

		User user = ( User ) session.get( "loggedUser" );
		List<Booking> userBookigs = bookingService.getUpcomingTripForUser( user );
		request.put( "userBooking" , userBookigs );
		return SUCCESS;
	}

	//populate upcoming trip which is not having reg. number
	public String carAllotment() {

		List<Booking> userBookigs = bookingService.getUpcomingTripForUser( null );

		request.put( "userBooking" , userBookigs );
		return SUCCESS;
	}

	public String getPreferedCar() {

		Booking userBookig = bookingService.getBookingByReference( bookingId );
		CarModel model = new CarModel();
		model.setName( modelName );
		List<Car> preferedcars = carBookingService.getAvailableCarsByModel( model , CarStatusEnum.AVAILABLE );
		if ( preferedcars == null && preferedcars.size() < 0 ) {
			preferedcars = carBookingService.getAll();
		}
		request.put( "preferedcars" , preferedcars );
		request.put( "userBookig" , userBookig );
		return SUCCESS;
	}

	public String assignCarToBooking() {

		Booking userBookig = bookingService.getBookingByReference( bookingId );
		userBookig.setVehicleRegNum( regNo );
		userBookig.setStatus( BookingStatus.INPROGRESS );
		bookingService.save( userBookig );
		Car car = carBookingService.getCarByRegNo( regNo );
		car.setStatus( CarStatusEnum.NOTAVAILABLE.toInt() );
		car = carBookingService.save( car );
		addActionMessage( "CAR GOT ASSIGN TO BOOKING NO : " + bookingId );
		return SUCCESS;

	}

	/**
	 * Trip Closing is in process 
	 * @return
	 */
	public String tripClosing() {

		TripInvoice estimatedInvoice = bookingService.getEstimatedInvoiceByBooking( bookingId , InvoiceType.ESTIMATE );

		request.put( "estimatedInvoice" , estimatedInvoice );
		return SUCCESS;

	}

	/**
	 * Finaly after assesment trip closing 
	 * @return
	 */
	public String closeBooking() {

		Double sumtotal = 0.0;

		TripInvoice estimatedInvoice = bookingService.getEstimatedInvoiceByBooking( bookingId , InvoiceType.ESTIMATE );

		Booking booking = bookingService.getBookingByReference( bookingId );
		booking.setStatus( BookingStatus.COMPLETED );
		bookingService.save( booking );
		Car car = carBookingService.getCarByRegNo( booking.getVehicleRegNum() );
		car.setStatus( CarStatusEnum.AVAILABLE.toInt() );
		carBookingService.save( car );
		List<Penalty> penalties = bookingService.getPenalties( tripPenaltyModel );

		for ( Penalty penalty : penalties ) {
			sumtotal += penalty.getCost();
		}

		estimatedInvoice.setId( null );
		estimatedInvoice.setType( InvoiceType.INVOICE );
		estimatedInvoice = invoiceService.save( estimatedInvoice );
		estimatedInvoice.setPenalties( penalties );

		invoiceService.save( estimatedInvoice );
		mailService.sendEmail( "Your OSD Booking" , "Your booking has been Completed.<br/>Your Booking ID :" + bookingId + "<br/>You will get final invoice in 24 hours" ,
			booking.getUser().getEmailId() , ApplicationConstants.SYSTEM_ID , ApplicationConstants.CLIENT_ID );

		addActionMessage( "Trip Closed for  Boking ID :" + bookingId );
		return SUCCESS;

	}

	public String confirmCancellation() {

		request.put( "booking" , bookingService.getBookingByReference( bookingId ) );
		request.put( "cancelAmount" , bookingService.getCancellationAmount( bookingId ) );

		return SUCCESS;

	}

	public String cancelBooking() {

		bookingService.cancelBooking( bookingId );

		return SUCCESS;

	}

	public String reschedule() {

		TripInvoice invoice = invoiceService.getInvoiceByBooking( bookingId , InvoiceType.ESTIMATE );

		session.put( "previousInvoice" , invoice );

		return SUCCESS;

	}

	public String getAvailableCars() {

		if ( customerRequestModel != null ) {
			request.put( "startDate" , customerRequestModel.getStartDate() );
			request.put( "startTime" , customerRequestModel.getStartTime() );
			request.put( "endDate" , customerRequestModel.getEndDate() );
			request.put( "endTime" , customerRequestModel.getEndTime() );
			session.put( "carHub" , customerRequestModel.getCarHub() );
			session.put( "carModel" , customerRequestModel.getCarModel() );

			pickupDate = DateTimeUtility.getDateInitialized( customerRequestModel.getStartDate() , customerRequestModel.getStartTime() );
			dropOffDate = DateTimeUtility.getDateInitialized( customerRequestModel.getEndDate() , customerRequestModel.getEndTime() );

			Duration duration = new Duration( pickupDate , dropOffDate );

			if ( duration.getStandardHours() < 0 || duration.getStandardHours() == 0 ) {
				addActionError( "Invalid Date / Time selection" );
				return INPUT;
			}

			session.put( "pickupDate" , pickupDate );
			session.put( "dropOffDate" , dropOffDate );

			LOGGER.info( "StartDate and EndDtae cunstructed" );

			List<Car> cars = carBookingService.getAvailableCarsByModel( customerRequestModel.getCarModel() , customerRequestModel.getCarHub() , pickupDate.toDate() ,
				dropOffDate.toDate() );

			request.put( "durationDays" , new Duration( pickupDate , dropOffDate ).getStandardDays() );
			request.put( "durationHours" , new Duration( pickupDate , dropOffDate ).getStandardHours() % 24 );

			request.put( "availableCars" , cars );
			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	public Map<String,Object> getRequest() {

		return request;
	}

	public void setRequest( Map<String,Object> request ) {

		this.request = request;
	}

	public Map<String,Object> getSession() {

		return session;
	}

	public void setSession( Map<String,Object> session ) {

		this.session = session;
	}

	public CarBookingService getCarBookingService() {

		return carBookingService;
	}

	public void setCarBookingService( CarBookingService carBookingService ) {

		this.carBookingService = carBookingService;
	}

	public CustomerRequestModel getCustomerRequestModel() {

		return customerRequestModel;
	}

	public void setCustomerRequestModel( CustomerRequestModel customerRequestModel ) {

		this.customerRequestModel = customerRequestModel;
	}

	public String getTripCost() {

		return tripCost;
	}

	public void setTripCost( String tripCost ) {

		this.tripCost = tripCost;
	}

	public IBookingService getBookingService() {

		return bookingService;
	}

	public void setBookingService( IBookingService bookingService ) {

		this.bookingService = bookingService;
	}

	public String getBookingId() {

		return bookingId;
	}

	public void setBookingId( String bookingId ) {

		this.bookingId = bookingId;
	}

	public TripPenaltyModel getTripClosingModel() {

		return tripPenaltyModel;
	}

	public void setTripClosingModel( TripPenaltyModel tripClosingModel ) {

		this.tripPenaltyModel = tripClosingModel;
	}

	public IInvoiceService getInvoiceService() {

		return invoiceService;
	}

	public void setInvoiceService( IInvoiceService invoiceService ) {

		this.invoiceService = invoiceService;
	}

	public String getModelName() {

		return modelName;
	}

	public void setModelName( String modelName ) {

		this.modelName = modelName;
	}

	public String getRegNo() {

		return regNo;
	}

	public void setRegNo( String regNo ) {

		this.regNo = regNo;
	}

	public ICarHubService getCarHubService() {

		return carHubService;
	}

	public void setCarHubService( ICarHubService carHubService ) {

		this.carHubService = carHubService;
	}

	public IMailService getMailService() {

		return mailService;
	}

	public void setMailService( IMailService mailService ) {

		this.mailService = mailService;
	}

}
