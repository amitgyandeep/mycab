package com.prj.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.model.Email;
import com.prj.service.ICustomerService;
import com.prj.service.IMailService;

@SuppressWarnings("serial")
public class MailAction extends ActionSupport implements RequestAware {

	private IMailService mailService;

	private ICustomerService customerService;

	Map<String,Object> request;

	private Email email;

	private Integer customerId;

	private static final Logger LOGGER = LoggerFactory.getLogger( MailAction.class );

	public void sendMail() {

		Integer systemId = 123;
		Integer registrationId = 678;
		LOGGER.info( "INSIDE sendMail() OF MailAction" );
		mailService.sendEmail( email.getSubject() , email.getBody() , email.getEmailList() , systemId , registrationId );
	}

	public Email getEmail() {

		return email;
	}

	public void setEmail( Email email ) {

		this.email = email;
	}

	public void setRequest( Map<String,Object> request ) {

		this.request = request;
	}

	public IMailService getMailService() {

		return mailService;
	}

	public void setMailService( IMailService mailService ) {

		this.mailService = mailService;
	}

	public ICustomerService getCustomerService() {

		return customerService;
	}

	public void setCustomerService( ICustomerService customerService ) {

		this.customerService = customerService;
	}

	public Integer getCustomerId() {

		return customerId;
	}

	public void setCustomerId( Integer customerId ) {

		this.customerId = customerId;
	}

}
