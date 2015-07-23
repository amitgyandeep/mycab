package com.prj.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CarModel implements Serializable {

	public CarModel( String name ) {

		this.name = name;
	}

	public CarModel() {

		// TODO Auto-generated constructor stub
	}

	private int id;

	private String name;

	public int getId() {

		return id;
	}

	public void setId( int id ) {

		this.id = id;
	}

	public String getName() {

		return name;
	}

	public void setName( String name ) {

		this.name = name.trim();
	}

}
