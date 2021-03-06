package com.prj.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.ApplicationConstants;
import com.prj.model.Customer;
import com.prj.model.User;
import com.prj.service.ICustomerService;
import com.prj.service.IMailService;
import com.prj.service.ISmsService;
import com.prj.service.IUserService;
import com.prj.service.serviceHelper.SMSMessageHelper;

public class AccountAction extends ActionSupport implements SessionAware, RequestAware {

	private User user;

	Map<String,Object> session;

	Map<String,Object> request;

	private IUserService userService;

	private ICustomerService customerService;

	private IMailService mailService;

	private ISmsService smsService;

	private Customer customer;

	private String newPassword;

	Properties props = new Properties();

	private static final Logger LOGGER = LoggerFactory.getLogger( AccountAction.class );

	@Override
	public String execute() throws Exception {

		return super.execute();
	}

	public String changePassword() {

		initializeProperties();

		LOGGER.info( "properties file loading done in AccountAction" );

		User loggedUser = ( ( User ) session.get( "loggedUser" ) );

		if ( user.getPassword().equals( loggedUser.getPassword() ) ) {

			loggedUser.setPassword( newPassword );

			userService.save( loggedUser );

			mailService.sendEmail( props.getProperty( "changed.password.subject" ) , props.getProperty( "changed.password.body" ) + newPassword ,
				loggedUser.getEmailId() , ApplicationConstants.SYSTEM_ID , ApplicationConstants.VEHICLE_ID );

			Customer customer = customerService.getcustomerByEmailId( loggedUser.getEmailId() );

			//String smsText = "Dear Customer, your password has been changed to " + newPassword;

			//smsService.sendSms( smsText , customer.getMobileNumber() , ApplicationConstants.CLIENT_ID , ApplicationConstants.SYSTEM_ID , ApplicationConstants.VEHICLE_ID );

			return SUCCESS;
		} else {
			LOGGER.info( "OLD PASSWORD DOES NOT MATCHED" );
			request.put( "newPassword" , newPassword );
			request.put( "passwordIncorrect" , "passwordIncorrect" );
			return INPUT;
		}
	}

	public String forgetPassword() {

		initializeProperties();

		LOGGER.info( "properties file loaded" );

		Customer customer = customerService.getCustomerByMobileNumber( this.customer.getMobileNumber() );

		LOGGER.info( "customer found for given mobile number is " + customer );

		if ( customer != null ) {
			User user = userService.getUserByEmailId( customer.getEmail() );
			if ( user != null ) {
				String smsText = SMSMessageHelper.getForgotPasswordMessage( customer.getCustomerName() , user.getPassword() );

				mailService.sendEmail( props.getProperty( "forgot.password.subject" ) , smsText + ": " + user.getPassword() , user.getEmailId() ,
					ApplicationConstants.SYSTEM_ID , ApplicationConstants.VEHICLE_ID );

				LOGGER.info( "Mail sent for forgot password" );

				//smsService.sendSms( smsText , customer.getMobileNumber() , ApplicationConstants.CLIENT_ID , ApplicationConstants.SYSTEM_ID , ApplicationConstants.VEHICLE_ID );

				request.put( "passwordSent" , "passwordSent" );
				LOGGER.info( "sms sent for forgot password" );

				return SUCCESS;
			} else {
				request.put( "notAUser" , "notAUser" );
				LOGGER.info( "No User Associated with provided registered number " );
				return INPUT;
			}
		} else {
			request.put( "wrongNumber" , "wrongNumber" );
			LOGGER.info( "CUSTOMER NOT FOUND FOR PROVIDED MOBILE NUMBER FOR FORGOT PASSWORD" );
			return INPUT;
		}

	}

	public void initializeProperties() {

		String resourceName = "message.properties"; // could also be a constant
		ClassLoader loader = Thread.currentThread().getContextClassLoader();

		InputStream resourceStream = loader.getResourceAsStream( resourceName );
		try {
			props.load( resourceStream );

		} catch ( IOException e ) {
			LOGGER.info( "problem in loading applicationSetup properties file" + e.getMessage() );
		}
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

	public IMailService getMailService() {

		return mailService;
	}

	public void setMailService( IMailService mailService ) {

		this.mailService = mailService;
	}

	public ISmsService getSmsService() {

		return smsService;
	}

	public void setSmsService( ISmsService smsService ) {

		this.smsService = smsService;
	}

	public void setCustomerService( ICustomerService customerService ) {

		this.customerService = customerService;
	}

	public Customer getCustomer() {

		return customer;
	}

	public void setCustomer( Customer customer ) {

		this.customer = customer;
	}

	public String getNewPassword() {

		return newPassword;
	}

	public void setNewPassword( String newPassword ) {

		this.newPassword = newPassword;
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

}
