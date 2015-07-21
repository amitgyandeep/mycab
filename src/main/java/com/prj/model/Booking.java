package com.prj.model;

import java.util.Date;

public class Booking extends CabsBaseModel{
	
	private String bookingRef;
	
	private User user;
	
	private String vehicleRegNum;
	
	private Date startDateTime;
	
	private Date endDateTime;
	
	private Date actualEndDateTime;
	
	private BillingInformation estimate;
	
	private BillingInformation invoice;
	
	private BookingStatus status;

	public String getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(String bookingRef) {
		this.bookingRef = bookingRef;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getVehicleRegNum() {
		return vehicleRegNum;
	}

	public void setVehicleRegNum(String vehicleRegNum) {
		this.vehicleRegNum = vehicleRegNum;
	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Date getActualEndDateTime() {
		return actualEndDateTime;
	}

	public void setActualEndDateTime(Date actualEndDateTime) {
		this.actualEndDateTime = actualEndDateTime;
	}

	public BillingInformation getEstimate() {
		return estimate;
	}

	public void setEstimate(BillingInformation estimate) {
		this.estimate = estimate;
	}

	public BillingInformation getInvoice() {
		return invoice;
	}

	public void setInvoice(BillingInformation invoice) {
		this.invoice = invoice;
	}

	public BookingStatus getStatus() {
		return status;
	}

	public void setStatus(BookingStatus status) {
		this.status = status;
	}
	
	

}
