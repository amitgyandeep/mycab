package com.t4u.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestAM {

	public static void main( String[] args ) {

		String tm = "16/07/2015 10:34 PM";

		SimpleDateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy hh:mm a" );
		try {
			Date convertedDate = formatter.parse( tm );
			System.out.println( "Date from dd/MM/yyyy String in Java : " + convertedDate );
		} catch ( ParseException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
