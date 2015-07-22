package com.prj.service.impl;

import org.springframework.web.client.RestTemplate;

import com.prj.model.ApplicationConstants;
import com.prj.service.ISmsService;

public class SmsServiceImpl implements ISmsService {

	private RestTemplate restTemplate;

	public void sendSms( String smsBody , String phoneNumber , Integer clientId , Integer systemId , Integer vehicleNo ) {

		callSMSWebService( smsBody , phoneNumber , clientId , systemId , vehicleNo );

	}

	private void callSMSWebService( final String smsBody , final String phoneNumber , final Integer clientId , final Integer systemId , final Integer vehicleNo ) {

		Runnable run = new Runnable() {

			public void run() {

				try {
					String response = restTemplate

					.getForObject( ApplicationConstants.SMS_URL , String.class , phoneNumber , smsBody , clientId , systemId , vehicleNo );
					System.out.println( response );

				} catch ( Exception e ) {
					e.printStackTrace();
				}
			}
		};
		new Thread( run ).start();
	}

	public RestTemplate getRestTemplate() {

		return restTemplate;
	}

	public void setRestTemplate( RestTemplate restTemplate ) {

		this.restTemplate = restTemplate;
	}

}
