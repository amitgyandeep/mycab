package com.prj.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.prj.model.Booking;
import com.prj.model.BookingStatus;
import com.prj.model.CarHub;
import com.prj.model.User;

public interface IBookingDao extends GenericDao<Booking,Integer> {

	List<Booking> getAllBookingByHub( CarHub carHub , BookingStatus bookingStatus );

	List<Booking> getUpcomingTripForUser( User user );

	Booking getBookingWithInvoices( Integer bookingId );

	Booking getBookingByReference( final String bookingRef );

	List<Booking> getUppcomingTrip( BookingStatus status );

}
