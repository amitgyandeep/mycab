package com.prj.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "car_segment")
public class CarSegment extends BaseEntity {

	private String name;

	public CarSegment( String name ) {

		this.name = name;
	}

	public CarSegment() {

	}

	public String getName() {

		return name;
	}

	public void setName( String name ) {

		this.name = name;
	}

}
