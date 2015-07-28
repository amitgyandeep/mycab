package com.prj.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.Booking;
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CarModel;
import com.prj.model.CustomerRequestModel;
import com.prj.model.TripInvoice;
import com.prj.model.User;
import com.prj.service.IBookingService;
import com.prj.service.impl.CarBookingService;

@SuppressWarnings("serial")
public class CarBookingAction extends ActionSupport implements SessionAware, RequestAware {

	private Map<String,Object> request;

	private Map<String,Object> session;

	private CarBookingService carBookingService;

	private IBookingService bookingService;

	CustomerRequestModel customerRequestModel;

	private DateTime dropOffDate;

	private DateTime pickupDate;

	private String tripCost;

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
			TripInvoice invoice = bookingService.createInvoiceForPreview( cars , user , pickupDate , dropOffDate );

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
		request.put( "booking" , booking );
		return SUCCESS;
	}

	public String getUsersUpcomingTrip() {

		User user = ( User ) session.get( "loggedUser" );
		List<Booking> userBookigs = bookingService.getUpcomingTripForUser( user );
		request.put( "userBooking" , userBookigs );
		return SUCCESS;
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

}
