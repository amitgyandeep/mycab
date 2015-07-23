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
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CustomerRequestModel;
import com.prj.model.Role;
import com.prj.model.User;
import com.prj.service.ICarBookingService;
import com.prj.service.ICarHubService;
import com.prj.service.ICarService;
import com.prj.util.DateTimeUtility;

public class DashboardAction extends ActionSupport implements RequestAware, SessionAware {

	private Map<String,Object> request;

	private Map<String,Object> session;

	private ICarHubService carHubService;

	private ICarBookingService carBookingService;

	private ICarService carService;

	private CustomerRequestModel customerRequestModel;

	private Car car;

	private DateTime dropOffDate;

	private DateTime pickupDate;

	private static final Logger LOGGER = LoggerFactory.getLogger( CarBookingAction.class );

	@Override
	public String execute() throws Exception {

		List<Car> cars = carBookingService.getAvailableCarsByModel( null , null , null , null );
		List<CarHub> carHubs = carHubService.getCarHubs();
		session.put( "cars" , cars );
		session.put( "carHubs" , carHubs );
		User user = ( User ) session.get( "loggedUser" );
		if ( user != null ) {

			if ( user.getRole().getId().equals( Role.ADMIN ) )
				return "adminDashboard";

			if ( user.getRole().getId().equals( Role.CUSTOMER ) )
				return "userDashBoard";
		}

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

			session.put( "standardDays" , duration.getStandardDays() );
			session.put( "standardHours" , duration.getStandardHours() );
			session.put( "pickupDate" , pickupDate );
			session.put( "dropOffDate" , dropOffDate );

			LOGGER.info( "StartDate and EndDtae cunstructed" );

			List<Car> cars = carBookingService.getAvailableCarsByModel( customerRequestModel.getCarModel() , customerRequestModel.getCarHub() , pickupDate.toDate() ,
				dropOffDate.toDate() );

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

	public ICarHubService getCarHubService() {

		return carHubService;
	}

	public void setCarHubService( ICarHubService carHubService ) {

		this.carHubService = carHubService;
	}

	public ICarService getCarService() {

		return carService;
	}

	public void setCarService( ICarService carService ) {

		this.carService = carService;
	}

	public ICarBookingService getCarBookingService() {

		return carBookingService;
	}

	public void setCarBookingService( ICarBookingService carBookingService ) {

		this.carBookingService = carBookingService;
	}

	public CustomerRequestModel getCustomerRequestModel() {

		return customerRequestModel;
	}

	public void setCustomerRequestModel( CustomerRequestModel customerRequestModel ) {

		this.customerRequestModel = customerRequestModel;
	}

	public Map<String,Object> getSession() {

		return session;
	}

	public void setSession( Map<String,Object> session ) {

		this.session = session;
	}

}
