package com.prj.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CarModel;
import com.prj.model.CustomerRequestModel;
import com.prj.model.TripInvoice;
import com.prj.model.User;
import com.prj.service.impl.CarBookingService;

@SuppressWarnings("serial")
public class CarBookingAction extends ActionSupport implements SessionAware, RequestAware {

	private Map<String,Object> request;

	private Map<String,Object> session;

	private CarBookingService carBookingService;

	CustomerRequestModel customerRequestModel;

	private DateTime dropOffDate;

	private DateTime pickupDate;

	private String tripCost;

	private static final Logger LOGGER = LoggerFactory.getLogger( CarBookingAction.class );

	public String tripBooking() {

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
			//dummy values
			TripInvoice invoice = new TripInvoice();
			invoice.setPickupDate( pickupDate );
			invoice.setDropOffDate( dropOffDate );
			Car car = cars.get( 0 );
			invoice.setSecurityDeposit( car.getSecurityDesposit() );
			invoice.setAdjustedFromWallet( 1000.00 );
			invoice.setAdnlsecurityDeposit( 1000.00 );
			invoice.setDiscount( 0.00 );
			invoice.setServiceTax( 14.0 );
			invoice.setTripCost( car.getPrice() );
			invoice.setTotal( 1000.00 + 5000.00 + 0.00 + car.getPrice() );

			request.put( "tripInvoice" , invoice );
			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	public static String getInvoiceNO() {

		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String ocrn = "OCRN-";//orange Cab reservation number
		int numberOfCodes = 0;//controls the length of alpha numeric string
		String code = "";
		while ( numberOfCodes < 8 ) {
			char c = chars.charAt( ( int ) ( Math.random() * chars.length() ) );
			code += c;
			numberOfCodes++;
		}
		code = ocrn + code;
		return code;
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

}
