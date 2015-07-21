package com.prj.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateTimeUtility {

	private static final Logger LOGGER = LoggerFactory.getLogger( DateTimeUtility.class );

	public static DateTime getDateInitialized( String selectedDate , String selectedTime ) {

		String selectedDateTime = selectedDate + " " + selectedTime;
		DateTime buildDateTime = null;
		SimpleDateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy hh:mm a" );
		try {
			buildDateTime = new DateTime( formatter.parse( selectedDateTime ) );
			return buildDateTime;

		} catch ( ParseException e ) {
			LOGGER.info( "problem in date conversion in  DateTimeUtility" );

		}
		return buildDateTime;

	}
}
