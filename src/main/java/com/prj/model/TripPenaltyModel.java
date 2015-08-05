package com.prj.model;

import java.io.Serializable;

public class TripPenaltyModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Double overSpeedCount;

	private Double reschedule;

	private Double delay;

	private Double delayWithExt;

	private Double refuelCharge;

	private Double towing;

	private Double others;

	private Double majorDamage;

	private Double minorDamage;

	private Double filthVomit;

	private Double keyLost;

	private Double documentLost;

	public Double getOverSpeedCount() {

		return overSpeedCount;
	}

	public void setOverSpeedCount( Double overSpeedCount ) {

		this.overSpeedCount = overSpeedCount;
	}

	public Double getReschedule() {

		return reschedule;
	}

	public void setReschedule( Double reschedule ) {

		this.reschedule = reschedule;
	}

	public Double getDelay() {

		return delay;
	}

	public void setDelay( Double delay ) {

		this.delay = delay;
	}

	public Double getDelayWithExt() {

		return delayWithExt;
	}

	public void setDelayWithExt( Double delayWithExt ) {

		this.delayWithExt = delayWithExt;
	}

	public Double getRefuelCharge() {

		return refuelCharge;
	}

	public void setRefuelCharge( Double refuelCharge ) {

		this.refuelCharge = refuelCharge;
	}

	public Double getTowing() {

		return towing;
	}

	public void setTowing( Double towing ) {

		this.towing = towing;
	}

	public Double getOthers() {

		return others;
	}

	public void setOthers( Double others ) {

		this.others = others;
	}

	public Double getMajorDamage() {

		return majorDamage;
	}

	public void setMajorDamage( Double majorDamage ) {

		this.majorDamage = majorDamage;
	}

	public Double getMinorDamage() {

		return minorDamage;
	}

	public void setMinorDamage( Double minorDamage ) {

		this.minorDamage = minorDamage;
	}

	public Double getFilthVomit() {

		return filthVomit;
	}

	public void setFilthVomit( Double filthVomit ) {

		this.filthVomit = filthVomit;
	}

	public Double getKeyLost() {

		return keyLost;
	}

	public void setKeyLost( Double keyLost ) {

		this.keyLost = keyLost;
	}

	public Double getDocumentLost() {

		return documentLost;
	}

	public void setDocumentLost( Double documentLost ) {

		this.documentLost = documentLost;
	}

}
