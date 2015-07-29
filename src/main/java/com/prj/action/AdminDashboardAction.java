package com.prj.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.Booking;
import com.prj.model.Customer;
import com.prj.model.StatusEnum;
import com.prj.service.IBookingService;
import com.prj.service.ICustomerService;

public class AdminDashboardAction extends ActionSupport implements RequestAware, SessionAware {

	Map<String,Object> session;

	Map<String,Object> request;

	private IBookingService bookingService;

	private ICustomerService customerService;

	private static final Logger LOGGER = LoggerFactory.getLogger( AdminDashboardAction.class );

	@Override
	public String execute() throws Exception {

		List<Booking> bookings = bookingService.getAll();
		request.put( "bookings" , bookings );
		return SUCCESS;

	}

	public String getCustomerList() {

		List<Customer> customerList = customerService.getAllCustomers( StatusEnum.NEW );
		request.put( "customerList" , customerList );

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

	public ICustomerService getCustomerService() {

		return customerService;
	}

	public void setCustomerService( ICustomerService customerService ) {

		this.customerService = customerService;
	}

}