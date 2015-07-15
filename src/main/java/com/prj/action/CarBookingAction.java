package com.prj.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.service.impl.CarBookingService;

public class CarBookingAction extends ActionSupport implements SessionAware, RequestAware {

	private Map<String,Object> request;

	private Map<String,Object> session;

	private CarBookingService carBookingService;

	private static final Logger LOGGER = LoggerFactory.getLogger( CarBookingAction.class );

	public String tripBooking() {

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

}
