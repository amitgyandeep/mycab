package com.prj.service.serviceHelper;

public class SMSMessageHelper {

	private static String REGISTER = "Dear $fullname$, your request for membership is accepted. We will be getting back shortly with the confirmation";

	private static String ACTIVATE = "Dear $fullname$, Welcome to Orange Self Drive. Your membership is activated. Aao Trip Karen";

	private static String ACCEPT = "Dear $fullname$, your booking has been accepted. Your booking ID is $bookingID$.";

	private static String ALLOT = "Dear $fullname$, your booking ID $bookingID$ has been allotted $carname$ with regno $carregno$ will be available for pick up at $hubname$ at $pickuptime$.";

	private static String END_TRIP = "Dear $fullname$, Hope you had a nice trip. You’re invoice will be generated within the next 24 hours.";

	private static String INVOICE = "Dear $fullname$, your final invoice amount is $amount$. Details are updated in your account and mail.";

	public static String getRegisterMessage( String username ) {

		return REGISTER.replace( "$fullname$" , username );
	}

	public static String getActivateMessage( String username ) {

		return ACTIVATE.replace( "$fullname$" , username );
	}

	public static String getAcceptedMessage( String username , String bookingId ) {

		return ACCEPT.replace( "$fullname$" , username ).replace( "$bookingID$" , bookingId );
	}

	public static String getTripEndMessage( String username ) {

		return END_TRIP.replace( "$fullname$" , username );
	}

	public static String getInvoiceMessage( String username , String amount ) {

		return INVOICE.replace( "$fullname$" , username ).replace( "$amount$" , amount );
	}

	public static String getAllotMessage( String username , String bookingId , String carname , String carregno , String hubname , String pickuptime ) {

		return ALLOT.replace( "$fullname$" , username ).replace( "$bookingID$ " , bookingId ).replace( "$carname$" , carname ).replace( "$carregno$" , carregno )
			.replace( "$hubname$" , hubname ).replace( "pickuptime" , pickuptime );
	}

}