package com.prj.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CarSegment implements Serializable {

	private int id;

	private String name;

	public CarSegment( String name ) {

		this.name = name;
	}

	public CarSegment() {

	}

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

		this.name = name;
	}

}
