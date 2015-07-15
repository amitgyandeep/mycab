package com.prj.model;

import java.io.Serializable;
import java.util.List;

public class Tariff implements Serializable {

	private int id;

	private TariffType type;

	private CarModel model;

	private TariffPlan plan;

	private List<DaysOfWeek> applicableDays;

	private double cost;

	private float cutOffHours;

	private float cutOffKMs;

	private float ratePerHour;

	private float ratePerKM;

	public int getId() {

		return id;
	}

	public void setId( int id ) {

		this.id = id;
	}

	public TariffType getType() {

		return type;
	}

	public void setType( TariffType type ) {

		this.type = type;
	}

	public List<DaysOfWeek> getApplicableDays() {

		return applicableDays;
	}

	public void setApplicableDays( List<DaysOfWeek> applicableDays ) {

		this.applicableDays = applicableDays;
	}

	public double getCost() {

		return cost;
	}

	public void setCost( double cost ) {

		this.cost = cost;
	}

	public float getCutOffHours() {

		return cutOffHours;
	}

	public void setCutOffHours( float cutOffHours ) {

		this.cutOffHours = cutOffHours;
	}

	public float getCutOffKMs() {

		return cutOffKMs;
	}

	public void setCutOffKMs( float cutOffKMs ) {

		this.cutOffKMs = cutOffKMs;
	}

	public float getRatePerHour() {

		return ratePerHour;
	}

	public void setRatePerHour( float ratePerHour ) {

		this.ratePerHour = ratePerHour;
	}

	public float getRatePerKM() {

		return ratePerKM;
	}

	public void setRatePerKM( float ratePerKM ) {

		this.ratePerKM = ratePerKM;
	}

	public CarModel getModel() {

		return model;
	}

	public void setModel( CarModel model ) {

		this.model = model;
	}

	public TariffPlan getPlan() {

		return plan;
	}

	public void setPlan( TariffPlan plan ) {

		this.plan = plan;
	}

}