package com.prj.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.CarHub;
import com.prj.model.Customer;
import com.prj.model.Role;
import com.prj.model.User;
import com.prj.service.ICarHubService;
import com.prj.service.ICustomerService;
import com.prj.service.IUserService;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements SessionAware, RequestAware {

	private Map<String,Object> session;

	private Map<String,Object> request;

	private IUserService userService;

	private ICustomerService customerService;

	private ICarHubService carHubService;

	private User user;

	List<CarHub> carHubs;

	private static final Logger LOGGER = LoggerFactory.getLogger( CarBookingAction.class );

	public String authenticateUser() {

		if ( user != null ) {

			User userDb = userService.authenticateUser( user );

			if ( userDb != null ) {

				session.put( "loggedUser" , userDb );
				carHubs = carHubService.getCarHubs();

				session.put( "carHubs" , carHubs );

				if ( userDb.getRole().getId().equals( Role.ADMIN ) ) {

					return "adminDashboard";

				}
				if ( userDb.getRole().getId().equals( Role.HUB_USER ) ) {

					return "hubDashBoard";

				} else {

					Customer customer = customerService.getcustomerByEmailId( userDb.getEmailId() );
					session.put( "customerInSession" , customer );
					if ( session.get( "actionName" ) != null && session.get( "actionName" ).equals( "estimatedTripCost" ) ) {
						return "estimatedTripCost";
					}
					return SUCCESS;
				}

			} else {
				LOGGER.info( "INVALID USER" );
				request.put( "invalidUser" , "invalidUser" );
				request.put( "user" , user );
				return INPUT;
			}
		} else {
			return INPUT;
		}
	}

	public Map<String,Object> getSession() {

		return session;
	}

	public void setSession( Map<String,Object> session ) {

		this.session = session;
	}

	public User getUser() {

		return user;
	}

	public void setUser( User user ) {

		this.user = user;
	}

	public IUserService getUserService() {

		return userService;
	}

	public void setUserService( IUserService userService ) {

		this.userService = userService;
	}

	public Map<String,Object> getRequest() {

		return request;
	}

	public void setRequest( Map<String,Object> request ) {

		this.request = request;
	}

	public ICustomerService getCustomerService() {

		return customerService;
	}

	public void setCustomerService( ICustomerService customerService ) {

		this.customerService = customerService;
	}

	public ICarHubService getCarHubService() {

		return carHubService;
	}

	public void setCarHubService( ICarHubService carHubService ) {

		this.carHubService = carHubService;
	}

}
