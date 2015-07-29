package com.prj.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.prj.model.Booking;
import com.prj.model.CarHub;
import com.prj.model.TripInvoice;
import com.prj.model.User;

public interface IBookingDao extends GenericDao<Booking,Integer> {

	List<Booking> getAllBookingByHub( CarHub carHub );

	List<Booking> getUpcomingTripForUser( User user );

	TripInvoice getEstimatedInvoiceByBooking( Integer bookingId );

}
