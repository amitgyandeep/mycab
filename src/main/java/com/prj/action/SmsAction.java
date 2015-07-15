package com.prj.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.prj.service.interfaces.ICustomerService;
import com.prj.service.interfaces.ISmsService;

@SuppressWarnings("serial")
public class SmsAction extends ActionSupport implements RequestAware {

	private ISmsService smsService;

	private ICustomerService customerService;

	Map<String,Object> request;

	private String numberList;

	String smsBody;

	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}

	public void sendSms() {

		Integer systemId = 246;
		Integer clientId = 4318;
		Integer VehicleNo = 12;
		smsService.sendSms( smsBody , numberList , clientId , systemId , VehicleNo );
	}

	public void setRequest( Map<String,Object> request ) {

		this.request = request;
	}

	public ISmsService getSmsService() {

		return smsService;
	}

	public void setSmsService( ISmsService smsService ) {

		this.smsService = smsService;
	}

	public ICustomerService getCustomerService() {

		return customerService;
	}

	public void setCustomerService( ICustomerService customerService ) {

		this.customerService = customerService;
	}

	public String getNumberList() {

		return numberList;
	}

	public void setNumberList( String numberList ) {

		this.numberList = numberList;
	}

	public String getSmsBody() {

		return smsBody;
	}

	public void setSmsBody( String smsBody ) {

		this.smsBody = smsBody;
	}

}
