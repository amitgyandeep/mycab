package com.prj.model;


@SuppressWarnings("serial")
public class Email extends BaseEntity {

	private String subject;

	private String body;

	private String emailList;

	public String getSubject() {

		return subject;
	}

	public void setSubject( String subject ) {

		this.subject = subject;
	}

	public String getBody() {

		return body;
	}

	public void setBody( String body ) {

		this.body = body;
	}

	public String getEmailList() {

		return emailList;
	}

	public void setEmailList( String emailList ) {

		this.emailList = emailList;
	}

}
