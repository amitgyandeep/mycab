package com.prj.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.joda.time.DateTime;

@SuppressWarnings("serial")
@Entity
@Table(name = "car_invoice")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "ESTIMATED")
public class TripEstInvoice extends BillingInformation implements Serializable {

	private Double securityDeposit;

	private Double adnlsecurityDeposit;

	private Double tripCost;

	private Double adjustedFromWallet;

	private Double discount;

	private Double serviceTax;

	private Double total;

	private DateTime pickupDate;

	private DateTime dropOffDate;

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

	public DateTime getPickupDate() {

		return pickupDate;
	}

	public void setPickupDate( DateTime pickupDate ) {

		this.pickupDate = pickupDate;
	}

	public DateTime getDropOffDate() {

		return dropOffDate;
	}

	public void setDropOffDate( DateTime dropOffDate ) {

		this.dropOffDate = dropOffDate;
	}

}
