package com.prj.model;

public enum BookingStatus {

	UPCOMING(0), INPROGRESS(1), OPEN(2), COMPLETED(3);

	private int databaseValue;

	private BookingStatus( int value ) {

		this.databaseValue = value;
	}

	// the identifierMethod
	public int toInt() {

		return this.databaseValue;
	}

	// the valueOfMethod
	public static BookingStatus fromInt( int value ) {

		switch ( value ) {
			case 0:
				return UPCOMING;
			case 1:
				return INPROGRESS;

			case 2:
				return OPEN;
			case 3:
				return COMPLETED;
			default:
				return UPCOMING;
		}
	}

	public static StatusEnum getByDescription( String value ) {

		StatusEnum sc = null;
		for ( StatusEnum statusEnum : StatusEnum.values() ) {
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
			case INPROGRESS:
				return "INPROGRESS";
			case COMPLETED:
				return "COMPLETED";
			case OPEN:
				return "OPEN";
			case UPCOMING:
				return "UPCOMING";

		}
		return "GeneralStatusEnum.toString() in uknown state.. database value: " + this.databaseValue;
	}

}