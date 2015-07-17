package com.prj.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.CustomerRequestObject;
import com.prj.model.User;
import com.prj.service.impl.CarBookingService;
import com.prj.util.DateTimeUtility;

public class CarBookingAction extends ActionSupport implements SessionAware, RequestAware {

	private Map<String,Object> request;

	private Map<String,Object> session;

	private CarBookingService carBookingService;

	CustomerRequestObject customerRequestObject;

	private DateTime dropOffDate;

	private DateTime pickupDate;

	private static final Logger LOGGER = LoggerFactory.getLogger( CarBookingAction.class );

	public String tripBooking() {

		User user = ( User ) session.get( "loggedUser" );
		if ( user != null ) {
			customerRequestObject = ( CustomerRequestObject ) request.get( "customerRequest" );

			pickupDate = DateTimeUtility.getDateInitialized( customerRequestObject.getStartDate() , customerRequestObject.getStartTime() );
			dropOffDate = DateTimeUtility.getDateInitialized( customerRequestObject.getEndDate() , customerRequestObject.getEndTime() );

		} else {
			return INPUT;
		}
		return null;

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

	public CustomerRequestObject getCustomerRequestObject() {

		return customerRequestObject;
	}

	public void setCustomerRequestObject( CustomerRequestObject customerRequestObject ) {

		this.customerRequestObject = customerRequestObject;
	}

}
