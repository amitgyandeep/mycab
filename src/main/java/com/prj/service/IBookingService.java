package com.prj.service;

import java.util.List;

import org.appfuse.service.GenericManager;
import org.joda.time.DateTime;

import com.prj.model.Booking;
import com.prj.model.BookingStatus;
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.InvoiceType;
import com.prj.model.Penalty;
import com.prj.model.TripClosingModel;
import com.prj.model.TripInvoice;
import com.prj.model.User;

public interface IBookingService extends GenericManager<Booking,Integer> {

	/**
	 * 
	 * @param cars
	 * @param user
	 * @param pickupDate
	 * @param dropOffDate
	 * @return TripInvoice
	 */
	public TripInvoice createInvoiceForPreview( List<Car> cars , User user , DateTime pickupDate , DateTime dropOffDate );

	public Booking createBookingAndFirstInvoice( Car car , User user , DateTime pickupDate , DateTime dropOffDate , TripInvoice invoice , CarHub carHub );

	public List<Booking> getAllBookingByHub( CarHub carHub , BookingStatus bookingStatus );

	public List<Booking> getUpcomingTripForUser( User user );

	public Booking getBookingWithInvoices( Integer parseInt );

	public void cancelBooking( String bookingRef );

	public double getCancellationAmount( String bookingRef );

	public Booking getBookingByReference( String bookingRef );

	public TripInvoice getEstimatedInvoiceByBooking( String bookingRef , InvoiceType invoiceType );

	public List<Penalty> getPenalties( TripClosingModel tripClosingModel );

	public List<Booking> getUppcomingTrip( BookingStatus upcoming );

}
