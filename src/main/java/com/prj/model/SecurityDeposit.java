package com.prj.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car_security_deposite")
public class SecurityDeposit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;

	@Column(name = "car_segment")
	private CarSegment type;

	private double cost;

	public Integer getId() {

		return id;
	}

	public void setId( Integer id ) {

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
