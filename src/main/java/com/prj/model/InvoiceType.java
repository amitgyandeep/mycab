package com.prj.model;

public enum InvoiceType {

	ESTIMATE(1), INVOICE(2);

	private int databaseValue;

	private InvoiceType( int value ) {

		this.databaseValue = value;
	}

	// the identifierMethod
	public int toInt() {

		return this.databaseValue;
	}

	// the valueOfMethod
	public static InvoiceType fromInt( int value ) {

		switch ( value ) {

			case 1:
				return ESTIMATE;
			case 2:
				return INVOICE;

			default:
				return ESTIMATE;
		}
	}

	public static InvoiceType getByDescription( String value ) {

		InvoiceType sc = null;
		for ( InvoiceType statusEnum : InvoiceType.values() ) {
			if ( statusEnum.toString().equalsIgnoreCase( value ) ) {
				sc = statusEnum;
				break;
			}
		}
		return sc;
	}

	@Override
	public String toString() {

		switch ( this ) {
			case ESTIMATE:
				return "ESTIMATE";
			case INVOICE:
				return "INVOICE";

		}
		return "GeneralStatusEnum.toString() in uknown state.. database value: " + this.databaseValue;
	}

}
