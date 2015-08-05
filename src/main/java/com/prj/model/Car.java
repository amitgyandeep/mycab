package com.prj.model;

import java.util.List;

public class Car extends CabsBaseModel {

	private static final long serialVersionUID = 1L;

	private String regNumber;

	private String imageURL;

	private CarSegment segment;

	private CarModel model;

	private CarHub hub;

	private List<Tariff> tariffs;

	private double securityDesposit;

	private Integer status;

	public String getRegNumber() {

		return regNumber;
	}

	public void setRegNumber( String regNumber ) {

		this.regNumber = regNumber;
	}

	public CarHub getHub() {

		return hub;
	}

	public void setHub( CarHub hub ) {

		this.hub = hub;
	}

	public CarSegment getSegment() {

		return segment;
	}

	public void setSegment( CarSegment segment ) {

		this.segment = segment;
	}

	public CarModel getModel() {

		return model;
	}

	public void setModel( CarModel model ) {

		this.model = model;
	}

	public double getPrice() {

		double price = 0.00;
		for ( Tariff tariff : tariffs ) {
			price += tariff.getCost();
		}

		return price;
	}

	public double getSecurityDesposit() {

		return securityDesposit;
	}

	public void setSecurityDesposit( double securityDesposit ) {

		this.securityDesposit = securityDesposit;
	}

	public List<Tariff> getTariffs() {

		return tariffs;
	}

	public void setTariffs( List<Tariff> tariffs ) {

		this.tariffs = tariffs;
	}

	public String getImageURL() {

		return imageURL;
	}

	public void setImageURL( String imageURL ) {

		this.imageURL = imageURL;
	}

	public Integer getStatus() {

		return status;
	}

	public void setStatus( Integer status ) {

		this.status = status;
	}

}
