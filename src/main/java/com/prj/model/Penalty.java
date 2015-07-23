package com.prj.model;

public class Penalty extends CabsBaseModel {

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
