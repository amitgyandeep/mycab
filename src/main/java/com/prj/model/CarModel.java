package com.prj.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_car_model")
public class CarModel extends BaseEntity {

	public CarModel( String name ) {

		this.name = name;
	}

	public CarModel() {

		// TODO Auto-generated constructor stub
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

}
