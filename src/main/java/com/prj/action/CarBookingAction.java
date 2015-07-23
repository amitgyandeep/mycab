package com.prj.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.CarHub;
import com.prj.model.CustomerRequestModel;
import com.prj.model.TripInvoice;
import com.prj.model.User;
import com.prj.service.impl.CarBookingService;

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
		if ( user != null ) {
			dropOffDate = ( DateTime ) session.get( "dropOffDate" );
			pickupDate = ( DateTime ) session.get( "pickupDate" );
			CarHub carHub = ( CarHub ) session.get( "carHub" );

			//customerRequestObject.setCarHub( carHub );
			//need to calculate invoice 
			/* Dummy values  for testing*/
			TripInvoice invoice = new TripInvoice();
			invoice.setSecurityDeposit( 5000.00 );
			invoice.setAdjustedFromWallet( 1000.00 );
			invoice.setAdnlsecurityDeposit( 1000.00 );
			invoice.setDiscount( 0.00 );
			invoice.setServiceTax( 650.00 );
			invoice.setTripCost( Double.parseDouble( tripCost ) );
			invoice.setTotal( 1000.00 + 5000.00 + 0.00 + 650.00 + Double.parseDouble( tripCost ) );

			request.put( "tripInvoice" , invoice );
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

}
