package com.prj.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "car_penalty")
public class Penalty extends CabsBaseModel {

	@OneToOne
	@JoinColumn(name = "penlity_type", referencedColumnName = "id")
	private PenaltyType type;

	private int count;

	private double cost;

	public PenaltyType getType() {

		return type;
	}

	public void setType( PenaltyType type ) {

		this.type = type;
	}

	public int getCount() {

		return count;
	}

	public void setCount( int count ) {

		this.count = count;
	}

	public double getCost() {

		return cost;
	}

	public void setCost( double cost ) {

		this.cost = cost;
	}

}
