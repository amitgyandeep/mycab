package com.prj.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "car_penalty_type")
public class PenaltyType extends CabsBaseModel {

	private String name;

	private Double cost;

	public String getName() {

		return name;
	}

	public void setName( String name ) {

		this.name = name;
	}

	public Double getCost() {

		return cost;
	}

	public void setCost( Double cost ) {

		this.cost = cost;
	}

}
