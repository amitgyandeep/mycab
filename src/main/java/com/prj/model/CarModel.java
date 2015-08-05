package com.prj.model;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
public class CarModel extends BaseEntity {

	private String imageURL;

	public CarModel( String name ) {

		this.name = name;
	}

	public CarModel() {

	}

	@OneToMany(mappedBy = "model", fetch = FetchType.LAZY)
	private List<Tariff> tariffs;

	private String name;

	public String getName() {

		return name;
	}

	public void setName( String name ) {

		this.name = name.trim();
	}

	public String getImageURL() {

		return imageURL;
	}

	public void setImageURL( String imageURL ) {

		this.imageURL = imageURL;
	}

}
