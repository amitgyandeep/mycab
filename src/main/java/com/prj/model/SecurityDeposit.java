package com.prj.model;

import java.io.Serializable;

public class SecurityDeposit implements Serializable {

	private int id;

	private CarSegment type;

	private double cost;

	public int getId() {

		return id;
	}

	public void setId( int id ) {

		this.id = id;
	}

	public CarSegment getType() {

		return type;
	}

	public void setType( CarSegment type ) {

		this.type = type;
	}

	public double getCost() {

		return cost;
	}

	public void setCost( double cost ) {

		this.cost = cost;
	}

}
