package com.prj.service.impl;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.prj.model.ApplicationConstants;
import com.prj.service.IMailService;

public class MailServiceImpl implements IMailService {

	RestTemplate restTemplate;

	public void sendEmail( String subject , String body , String emailList , Integer systemId , Integer registrationNo ) {

		try {
			body = body.replace( "\\" , "\\\\" );
			callEmailWebService( subject , body , emailList , systemId , registrationNo );
		} catch ( RestClientException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void callEmailWebService( final String subject , final String body , final String emailList , final Integer systemId , final Integer registrationNo ) {

		Runnable run = new Runnable() {

			public void run() {

				try {
					String response = restTemplate.getForObject( ApplicationConstants.EMAIL_URL , String.class , subject , body , emailList , systemId , registrationNo );
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
