package com.prj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@Table(name = "tbl_car")
@TypeDef(name = "bookingStatusEnum", typeClass = GenericEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "com.prj.model.CarStatusEnum") ,
	@Parameter(name = "identifierMethod", value = "toInt") , @Parameter(name = "valueOfMethod", value = "fromInt") })
public class Car extends CabsBaseModel {

	private static final long serialVersionUID = 1L;

	private String regNumber;

	private String imageURL;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "segment_id", referencedColumnName = "id")
	private CarSegment segment;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "model_id", referencedColumnName = "id")
	private CarModel model;

	/*	@ManyToMany
		@JoinTable(name = "tbl_car_hub_join", joinColumns = @JoinColumn(name = "car_id"), inverseJoinColumns = @JoinColumn(name = "hub_id"))
		*/
	@Transient
	private CarHub hub;

	@Transient
	private List<Tariff> tariffs;

	private double securityDesposit;

	@Column(name = "status")
	@Type(type = "bookingStatusEnum")
	private CarStatusEnum status;

	public String getRegNumber() {

		return regNumber;
	}

	public void setRegNumber( String regNumber ) {

		this.regNumber = regNumber;
	}

	public CarHub getHub() {

		return hub;
	}

	public void setHub( CarHub hub ) {

		this.hub = hub;
	}

	public CarSegment getSegment() {

		return segment;
	}

	public void setSegment( CarSegment segment ) {

		this.segment = segment;
	}

	public CarModel getModel() {

		return model;
	}

	public void setModel( CarModel model ) {

		this.model = model;
	}

	public double getPrice() {

		double price = 0.00;
		for ( Tariff tariff : tariffs ) {
			price += tariff.getCost();
		}

		return price;
	}

	public double getSecurityDesposit() {

		return securityDesposit;
	}

	public void setSecurityDesposit( double securityDesposit ) {

		this.securityDesposit = securityDesposit;
	}

	public List<Tariff> getTariffs() {

		return tariffs;
	}

	public void setTariffs( List<Tariff> tariffs ) {

		this.tariffs = tariffs;
	}

	public CarStatusEnum getStatus() {

		return status;
	}

	public void setStatus( CarStatusEnum status ) {

		this.status = status;
	}

	public String getImageURL() {

		return imageURL;
	}

	public void setImageURL( String imageURL ) {

		this.imageURL = imageURL;
	}

}
