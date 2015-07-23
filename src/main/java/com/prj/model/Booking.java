package com.prj.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

/*@Entity
@Table(name = "car_booking")
@TypeDef(name = "bookingStatusEnum", typeClass = GenericEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "com.prj.model.BookingStatus") ,
	@Parameter(name = "identifierMethod", value = "toInt") , @Parameter(name = "valueOfMethod", value = "fromInt") })*/
public class Booking extends CabsBaseModel {

	private String bookingRef;

	@ManyToOne
	@JoinColumn(name = "id", referencedColumnName = "id")
	private User user;

	@Column(name = "vehicle_reg_num")
	private String vehicleRegNum;

	@Column(name = "start_date_time")
	private Date startDateTime;

	@Column(name = "end_date_time")
	private Date endDateTime;

	@Column(name = "actual_end_date_time")
	private Date actualEndDateTime;

	@Transient
	private BillingInformation estimate;

	@Transient
	private BillingInformation invoice;

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

	public BillingInformation getEstimate() {

		return estimate;
	}

	public void setEstimate( BillingInformation estimate ) {

		this.estimate = estimate;
	}

	public BillingInformation getInvoice() {

		return invoice;
	}

	public void setInvoice( BillingInformation invoice ) {

		this.invoice = invoice;
	}

	public BookingStatus getStatus() {

		return status;
	}

	public void setStatus( BookingStatus status ) {

		this.status = status;
	}

}
