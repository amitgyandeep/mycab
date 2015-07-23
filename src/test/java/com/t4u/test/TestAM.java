package com.t4u.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Duration;

public class TestAM {

	public static void main( String[] args ) {

		String tm = "30/07/2015 12:00 AM";
		String tm2 = "01/08/2015 11:00 PM";

		SimpleDateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy hh:mm a" );
		try {
			Date convertedDate = formatter.parse( tm );
			Date convertedDate2 = formatter.parse( tm2 );

			DateTime d1 = new DateTime( convertedDate );
			DateTime d2 = new DateTime( convertedDate2 );

			Duration duration = new Duration( d1 , d2 );

			System.out.println( "Difference (hours): " + duration.getStandardHours() / 24 );
		} catch ( ParseException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
