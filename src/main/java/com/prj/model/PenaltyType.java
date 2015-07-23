package com.prj.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_penalty_type")
public class PenaltyType extends CabsBaseModel {

	private String name;

	private double cost;

	public String getName() {

		return name;
	}

	public void setName( String name ) {

		this.name = name;
	}

	public double getCost() {

		return cost;
	}

	public void setCost( double cost ) {

		this.cost = cost;
	}

}