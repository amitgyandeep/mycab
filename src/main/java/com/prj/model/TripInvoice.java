package com.prj.model;

import java.io.Serializable;

public class TripInvoice implements Serializable {

	private Double securityDeposit;

	private Double adnlsecurityDeposit;

	private Double tripCost;

	private Double adjustedFromWallet;

	private Double discount;

	private Double serviceTax;

	private Double total;

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

}
