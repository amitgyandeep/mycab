package com.prj.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_car_hub")
public class CarHub extends BaseEntity implements Serializable {

	private String name;

	private String address;

	private Double latitude;

	private Double longitude;

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

	public Double getLatitude() {

		return latitude;
	}

	public void setLatitude( Double latitude ) {

		this.latitude = latitude;
	}

	public Double getLongitude() {

		return longitude;
	}

	public void setLongitude( Double longitude ) {

		this.longitude = longitude;
	}

	public String getName() {

		return name;
	}

	public void setName( String name ) {

		this.name = name;
	}

}
