package com.t4u.test;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class TestAM {

	public static void main( String[] args ) {

		String tm = "10:53 PM";
		DateTimeFormatter builder = DateTimeFormat.forPattern( "hh:mm a" );
		DateTime dateTime = builder.parseDateTime( tm );

		System.out.println( dateTime.getHourOfDay() + ":" + dateTime.getMinuteOfHour() );
	}
}
