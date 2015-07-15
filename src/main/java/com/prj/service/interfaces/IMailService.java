package com.prj.service.interfaces;


public interface IMailService {

	public void sendEmail( String subject , String body , String emailList , Integer systemId , Integer registrationNo );
}
