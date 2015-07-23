package com.prj.model;

import java.util.List;

public class BillingInformation extends CabsBaseModel {

	private Booking booking;

	private List<Tariff> tariff;

	private List<Penalty> penalties;

	public Booking getBooking() {

		return booking;
	}

	public void setBooking( Booking booking ) {

		this.booking = booking;
	}

	public List<Tariff> getTariff() {

		return tariff;
	}

	public void setTariff( List<Tariff> tariff ) {

		this.tariff = tariff;
	}

	public List<Penalty> getPenalties() {

		return penalties;
	}

	public void setPenalties( List<Penalty> penalties ) {

		this.penalties = penalties;
	}

}
