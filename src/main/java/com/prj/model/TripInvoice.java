package com.prj.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

@SuppressWarnings("serial")
@Entity
@Table(name = "car_invoice")
@TypeDef(name = "invoiceType", typeClass = GenericEnumUserType.class, parameters = { @Parameter(name = "enumClassName", value = "com.prj.model.InvoiceType") ,
	@Parameter(name = "identifierMethod", value = "toInt") , @Parameter(name = "valueOfMethod", value = "fromInt") })
public class TripInvoice extends CabsBaseModel implements Serializable {

	@ManyToOne
	@JoinColumn(name = "booking_id", referencedColumnName = "id")
	private Booking booking;

	@Column(name = "security_deposit")
	private Double securityDeposit;

	@Column(name = "adnl_security_deposit")
	private Double adnlsecurityDeposit;

	@Column(name = "trip_cost")
	private Double tripCost;

	@Column(name = "adjusted_from_wallet")
	private Double adjustedFromWallet;

	private Double discount;

	@Column(name = "service_tax")
	private Double serviceTax;

	private Double total;

	@Column(name = "pickup_date")
	private Date pickupDate;

	@Column(name = "drop_off_date")
	private Date dropOffDate;

	@Type(type = "invoiceType")
	private InvoiceType type;

	@OneToMany
	@JoinTable(name = "car_invoice_penalty", joinColumns = @JoinColumn(name = "invoice_id"), inverseJoinColumns = @JoinColumn(name = "penalty_id"))
	public List<Penalty> penalities;

	public Double getSecurityDeposit() {

		return securityDeposit;
	}

	public void setSecurityDeposit( Double securityDeposit ) {

		this.securityDeposit = securityDeposit;
	}

	public Double getAdnlsecurityDeposit() {

		return adnlsecurityDeposit;
	}

	public void setAdnlsecurityDeposit( Double adnlsecurityDeposit ) {

		this.adnlsecurityDeposit = adnlsecurityDeposit;
	}

	public Double getTripCost() {

		return tripCost;
	}

	public void setTripCost( Double tripCost ) {

		this.tripCost = tripCost;
	}

	public Double getAdjustedFromWallet() {

		return adjustedFromWallet;
	}

	public void setAdjustedFromWallet( Double adjustedFromWallet ) {

		this.adjustedFromWallet = adjustedFromWallet;
	}

	public Double getDiscount() {

		return discount;
	}

	public void setDiscount( Double discount ) {

		this.discount = discount;
	}

	public Double getServiceTax() {

		return serviceTax;
	}

	public void setServiceTax( Double serviceTax ) {

		this.serviceTax = serviceTax;
	}

	public Double getTotal() {

		return total;
	}

	public void setTotal( Double total ) {

		this.total = total;
	}

	public Date getPickupDate() {

		return pickupDate;
	}

	public void setPickupDate( Date pickupDate ) {

		this.pickupDate = pickupDate;
	}

	public Date getDropOffDate() {

		return dropOffDate;
	}

	public void setDropOffDate( Date dropOffDate ) {

		this.dropOffDate = dropOffDate;
	}

	public InvoiceType getType() {

		return type;
	}

	public void setType( InvoiceType type ) {

		this.type = type;
	}

	public Booking getBooking() {

		return booking;
	}

	public void setBooking( Booking booking ) {

		this.booking = booking;
	}

}
