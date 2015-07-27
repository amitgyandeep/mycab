package com.prj.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.Booking;
import com.prj.model.CarHub;
import com.prj.model.User;
import com.prj.service.IBookingService;

public class HubDashboardAction extends ActionSupport implements RequestAware, SessionAware {

	Map<String,Object> session;

	Map<String,Object> request;

	private IBookingService bookingService;

	private static final Logger LOGGER = LoggerFactory.getLogger( HubDashboardAction.class );

	@Override
	public String execute() throws Exception {

		CarHub carHub = new CarHub();
		User user = ( User ) session.get( "loggedUser" );
		carHub.setName( user.getHubName() );
		List<Booking> bookings = bookingService.getAllBookingByHub( carHub );
		request.put( "bookings" , bookings );
		return SUCCESS;

	}

	public Map<String,Object> getSession() {

		return session;
	}

	public void setSession( Map<String,Object> session ) {

		this.session = session;
	}

	public Map<String,Object> getRequest() {

		return request;
	}

	public void setRequest( Map<String,Object> request ) {

		this.request = request;
	}

	public IBookingService getBookingService() {

		return bookingService;
	}

	public void setBookingService( IBookingService bookingService ) {

		this.bookingService = bookingService;
	}

}