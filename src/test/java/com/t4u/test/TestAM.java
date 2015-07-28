package com.t4u.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestAM {

	public static void main( String[] args ) {

		String datestring = "2015-07-23 15:23:32";

		SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		SimpleDateFormat dateFormat2 = new SimpleDateFormat( "dd-MM-yyyy hh:mm a" );
		try {
			Date date = dateFormat.parse( datestring );
			String date2 = dateFormat2.format( date );
			System.out.println( date2 );
		} catch ( Exception e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}