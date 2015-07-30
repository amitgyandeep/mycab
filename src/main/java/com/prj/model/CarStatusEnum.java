package com.prj.model;

public enum CarStatusEnum {

	AVAILABLE(0), INPROGRESS(1), NOTAVAILABLE(2);

	private int databaseValue;

	private CarStatusEnum( int value ) {

		this.databaseValue = value;
	}

	// the identifierMethod
	public int toInt() {

		return this.databaseValue;
	}

	// the valueOfMethod
	public static CarStatusEnum fromInt( int value ) {

		switch ( value ) {
			case 0:
				return AVAILABLE;
			case 1:
				return INPROGRESS;
			case 2:
				return NOTAVAILABLE;

			default:
				return AVAILABLE;
		}
	}

	public static CarStatusEnum getByDescription( String value ) {

		CarStatusEnum sc = null;
		for ( CarStatusEnum statusEnum : CarStatusEnum.values() ) {
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
			case AVAILABLE:
				return "AVAILABLE";
			case INPROGRESS:
				return "INPROGRESS";
			case NOTAVAILABLE:
				return "NOTAVAILABLE";

		}
		return "GeneralStatusEnum.toString() in uknown state.. database value: " + this.databaseValue;
	}

}
