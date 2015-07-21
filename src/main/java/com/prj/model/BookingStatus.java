package com.prj.model;

public enum BookingStatus  {

	INPROGRESS(0), OPEN(1),COMPLETED(2);
	
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
			return INPROGRESS;
		case 2:
			return COMPLETED;
		case 1:
			return OPEN;

			default:
				return OPEN;
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
			

		}
		return "GeneralStatusEnum.toString() in uknown state.. database value: " + this.databaseValue;
	}

}