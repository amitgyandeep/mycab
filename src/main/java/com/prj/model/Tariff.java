package com.prj.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@Table(name = "car_tariff")
@TypeDef(name = "tariffTypeEnum", typeClass = GenericEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "com.prj.model.TariffType") ,
	@Parameter(name = "identifierMethod", value = "toInt") , @Parameter(name = "valueOfMethod", value = "fromInt") })
public class Tariff extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "tariff_type")
	@Type(type = "tariffTypeEnum")
	private TariffType type;

	@ManyToOne
	@JoinColumn(name = "car_model", referencedColumnName = "id")
	private CarModel model;

	@Transient
	private List<DaysOfWeek> applicableDays;

	private Double cost;

	private Float cutOffHours;

	private Float cutOffKMs;

	private Float ratePerHour;

	private Float ratePerKM;

	public TariffType getType() {

		return type;
	}

	public void setType( TariffType type ) {

		this.type = type;
	}

	public List<DaysOfWeek> getApplicableDays() {

		return applicableDays;
	}

	public void setApplicableDays( List<DaysOfWeek> applicableDays ) {

		this.applicableDays = applicableDays;
	}

	public Double getCost() {

		return cost;
	}

	public void setCost( Double cost ) {

		this.cost = cost;
	}

	public Float getCutOffHours() {

		return cutOffHours;
	}

	public void setCutOffHours( Float cutOffHours ) {

		this.cutOffHours = cutOffHours;
	}

	public Float getCutOffKMs() {

		return cutOffKMs;
	}

	public void setCutOffKMs( Float cutOffKMs ) {

		this.cutOffKMs = cutOffKMs;
	}

	public Float getRatePerHour() {

		return ratePerHour;
	}

	public void setRatePerHour( Float ratePerHour ) {

		this.ratePerHour = ratePerHour;
	}

	public Float getRatePerKM() {

		return ratePerKM;
	}

	public void setRatePerKM( Float ratePerKM ) {

		this.ratePerKM = ratePerKM;
	}

	public CarModel getModel() {

		return model;
	}

	public void setModel( CarModel model ) {

		this.model = model;
	}

}
