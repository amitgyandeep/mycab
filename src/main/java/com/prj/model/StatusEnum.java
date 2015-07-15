package com.prj.model;

public enum StatusEnum {

	NEW(0), APPROVED(1), HOLD(2), REJECTED(3);

	private int databaseValue;

	private StatusEnum( int value ) {

		this.databaseValue = value;
	}

	// the identifierMethod
	public int toInt() {

		return this.databaseValue;
	}

	// the valueOfMethod
	public static StatusEnum fromInt( int value ) {

		switch ( value ) {
			case 0:
				return NEW;
			case 1:
				return APPROVED;
			case 2:
				return HOLD;
			case 3:
				return REJECTED;

			default:
				return NEW;
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
			case NEW:
				return "NEW";
			case APPROVED:
				return "APPROVED";
			case HOLD:
				return "HOLD";
			case REJECTED:
				return "REJECTED";

		}
		return "GeneralStatusEnum.toString() in uknown state.. database value: " + this.databaseValue;
	}

}
