package com.prj.service.interfaces;

public interface ISmsService {

	public void sendSms( String smsBody , String numberList , Integer clientId , Integer systemId , Integer vehicleId );
}
