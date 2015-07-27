package com.prj.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@Entity
@Table(name = "car_booking")
@TypeDef(name = "bookingStatusEnum", typeClass = GenericEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "com.prj.model.BookingStatus") ,
	@Parameter(name = "identifierMethod", value = "toInt") , @Parameter(name = "valueOfMethod", value = "fromInt") })
public class Booking extends CabsBaseModel {

	@Column(name = "booking_ref")
	private String bookingRef;

	@Column(name = "car_model")
	private String carModel;

	@Column(name = "car_hub")
	private String carHub;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private User user;

	@Column(name = "vehicle_reg_num")
	private String vehicleRegNum;

	@Column(name = "start_date_time")
	private Date startDateTime;

	@Column(name = "end_date_time")
	private Date endDateTime;

	@Column(name = "actual_end_date_time")
	private Date actualEndDateTime;

	@OneToMany(mappedBy = "booking", fetch = FetchType.LAZY)
	private List<TripInvoice> invoices;

	@Column(name = "booking_status")
	@Type(type = "bookingStatusEnum")
	private BookingStatus status;

	public String getBookingRef() {

		return bookingRef;
	}

	public void setBookingRef( String bookingRef ) {

		this.bookingRef = bookingRef;
	}

	public User getUser() {

		return user;
	}

	public void setUser( User user ) {

		this.user = user;
	}

	public String getVehicleRegNum() {

		return vehicleRegNum;
	}

	public void setVehicleRegNum( String vehicleRegNum ) {

		this.vehicleRegNum = vehicleRegNum;
	}

	public Date getStartDateTime() {

		return startDateTime;
	}

	public void setStartDateTime( Date startDateTime ) {

		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {

		return endDateTime;
	}

	public void setEndDateTime( Date endDateTime ) {

		this.endDateTime = endDateTime;
	}

	public Date getActualEndDateTime() {

		return actualEndDateTime;
	}

	public void setActualEndDateTime( Date actualEndDateTime ) {

		this.actualEndDateTime = actualEndDateTime;
	}

	public BookingStatus getStatus() {

		return status;
	}

	public void setStatus( BookingStatus status ) {

		this.status = status;
	}

	public List<TripInvoice> getInvoices() {

		return invoices;
	}

	public void setInvoices( List<TripInvoice> invoices ) {

		this.invoices = invoices;
	}

	public String getCarModel() {

		return carModel;
	}

	public void setCarModel( String carModel ) {

		this.carModel = carModel;
	}

	public String getCarHub() {

		return carHub;
	}

	public void setCarHub( String carHub ) {

		this.carHub = carHub;
	}

}
