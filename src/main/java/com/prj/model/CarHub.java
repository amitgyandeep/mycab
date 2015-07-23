package com.prj.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CarHub extends Car implements Serializable {

	private String name;

	private String address;

	private double latitude;

	private double longitude;

	public CarHub( String name ) {

		this.name = name;
	}

	public CarHub() {

	}

	public String getAddress() {

		return address;
	}

	public void setAddress( String address ) {

		this.address = address;
	}

	public double getLatitude() {

		return latitude;
	}

	public void setLatitude( double latitude ) {

		this.latitude = latitude;
	}

	public double getLongitude() {

		return longitude;
	}

	public void setLongitude( double longitude ) {

		this.longitude = longitude;
	}

	public String getName() {

		return name;
	}

	public void setName( String name ) {

		this.name = name;
	}

}
