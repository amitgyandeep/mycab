package com.prj.service.impl;

import java.util.Date;
import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;
import org.joda.time.DateTime;
import org.joda.time.Duration;

import com.prj.dao.IBookingDao;
import com.prj.model.Booking;
import com.prj.model.BookingStatus;
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.InvoiceType;
import com.prj.model.Penalty;
import com.prj.model.TripClosingModel;
import com.prj.model.TripInvoice;
import com.prj.model.User;
import com.prj.service.IBookingService;
import com.prj.service.IInvoiceService;

public class BookingServiceImpl extends GenericManagerImpl<Booking,Integer> implements IBookingService {

	private IBookingDao bookingDao;

	private IInvoiceService invoiceService;

	private BookingServiceHelper bookingServiceHelper;

	public BookingServiceImpl( IBookingDao bookingDao ) {

		super( bookingDao );
		this.bookingDao = bookingDao;
	}

	public double getCancellationAmount( String bookingRef ) {

		Booking booking = bookingDao.getBookingByReference( bookingRef );
		Duration duration = new Duration( new DateTime( booking.getStartDateTime() ) , new DateTime() );

		double cancelAmount = booking.getEstimate().getTotal() - booking.getEstimate().getSecurityDeposit();

		if ( duration.getStandardHours() > 24 ) {
			cancelAmount = 0.15 * cancelAmount;
		} else {
			cancelAmount = 0.25 * cancelAmount;
		}

		return cancelAmount;
	}

	public void cancelBooking( String bookingRef ) {

		Booking booking = bookingDao.getBookingByReference( bookingRef );

		booking.setStatus( BookingStatus.CANCELLED );
		bookingDao.save( booking );

	}

	public TripInvoice createInvoiceForPreview( List<Car> cars , User user , DateTime pickupDate , DateTime dropOffDate ) {

		TripInvoice invoice = new TripInvoice();
		Car car = cars.get( 0 );

		Double beforeTotal = car.getSecurityDesposit() + car.getPrice();
		double afterTax = beforeTotal + ( beforeTotal * 14 / 100 );
		invoice.setPickupDate( pickupDate.toDate() );
		invoice.setDropOffDate( dropOffDate.toDate() );

		invoice.setSecurityDeposit( car.getSecurityDesposit() );
		invoice.setAdjustedFromWallet( 0.0 );
		invoice.setAdnlsecurityDeposit( 0.0 );
		invoice.setDiscount( 0.00 );
		invoice.setServiceTax( beforeTotal * 14 / 100 );
		invoice.setTripCost( car.getPrice() );

		invoice.setTotal( afterTax );

		invoice.setType( InvoiceType.ESTIMATE );

		return invoice;
	}

	public Booking createBookingAndFirstInvoice( Car car , User user , DateTime pickupDate , DateTime dropOffDate , TripInvoice invoice , CarHub carHub ) {

		Booking booking = new Booking();
		booking.setBookingRef( getInvoiceNO() );
		booking.setUser( user );
		booking.setStatus( BookingStatus.UPCOMING );
		booking.setStartDateTime( pickupDate.toDate() );
		booking.setEndDateTime( dropOffDate.toDate() );
		booking.setCreationTime( new Date() );
		booking.setLastUpdateTime( new Date() );
		booking.setCarModel( car.getModel().getName() );
		booking.setCarHub( carHub.getName() );
		booking = save( booking );

		invoice.setBooking( booking );

		invoiceService.save( invoice );
		return booking;
	}

	public TripInvoice getEstimatedInvoiceByBooking( String bookingRef , InvoiceType invoiceType ) {

		return invoiceService.getInvoiceByBooking( bookingRef , invoiceType );
	}

	public Booking getBookingWithInvoices( Integer bookingId ) {

		return bookingDao.getBookingWithInvoices( bookingId );
	}

	public Booking getBookingByReference( String bookingRef ) {

		return bookingDao.getBookingByReference( bookingRef );
	}

	private String getInvoiceNO() {

		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String ocrn = "OCRN-";// orange Cab reservation number start with
		int numberOfCodes = 0;// controls the length of alpha numeric string
		String code = "";
		while ( numberOfCodes < 8 ) {
			char c = chars.charAt( ( int ) ( Math.random() * chars.length() ) );
			code += c;
			numberOfCodes++;
		}
		code = ocrn + code;
		return code;
	}

	public List<Penalty> getPenalties( TripClosingModel tripClosingModel ) {

		return bookingServiceHelper.getPenalties( tripClosingModel );

	}

	public IInvoiceService getInvoiceService() {

		return invoiceService;
	}

	public void setInvoiceService( IInvoiceService invoiceService ) {

		this.invoiceService = invoiceService;
	}

	public List<Booking> getAllBookingByHub( CarHub carHub ) {

		return bookingDao.getAllBookingByHub( carHub );
	}

	public List<Booking> getUpcomingTripForUser( User user ) {

		return bookingDao.getUpcomingTripForUser( user );
	}

	public BookingServiceHelper getBookingServiceHelper() {

		return bookingServiceHelper;
	}

	public void setBookingServiceHelper( BookingServiceHelper bookingServiceHelper ) {

		this.bookingServiceHelper = bookingServiceHelper;
	}

}
