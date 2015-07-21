package com.prj.model;

import java.io.Serializable;

/**
 * 
 * @author
 * Class Model to handle customer Request from dashboard
 *
 */
public class CustomerRequestModel implements Serializable {

	private CarHub carHub;

	private String startDate;

	private String startTime;

	private String endDate;

	private String endTime;

	private CarModel carModel;

	public CarHub getCarHub() {

		return carHub;
	}

	public void setCarHub( CarHub carHub ) {

		this.carHub = carHub;
	}

	public String getStartDate() {

		return startDate;
	}

	public void setStartDate( String startDate ) {

		this.startDate = startDate;
	}

	public String getStartTime() {

		return startTime;
	}

	public void setStartTime( String startTime ) {

		this.startTime = startTime;
	}

	public String getEndDate() {

		return endDate;
	}

	public void setEndDate( String endDate ) {

		this.endDate = endDate;
	}

	public String getEndTime() {

		return endTime;
	}

	public void setEndTime( String endTime ) {

		this.endTime = endTime;
	}

	public CarModel getCarModel() {

		return carModel;
	}

	public void setCarModel( CarModel carModel ) {

		this.carModel = carModel;
	}

}
