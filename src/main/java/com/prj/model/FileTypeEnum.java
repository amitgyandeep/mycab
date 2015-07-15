package com.prj.model;

public enum FileTypeEnum {

	ADHAR(1), PASSPORT(2), DRIVING_LICENCE(3);

	private int databaseValue;

	private FileTypeEnum( int value ) {

		this.databaseValue = value;
	}

	// the identifierMethod
	public int toInt() {

		return this.databaseValue;
	}

	// the valueOfMethod
	public static FileTypeEnum fromInt( int value ) {

		switch ( value ) {
			case 1:
				return ADHAR;
			case 2:
				return PASSPORT;
			case 3:
				return DRIVING_LICENCE;

			default:
				return ADHAR;
		}
	}

	public static FileTypeEnum getByDescription( String value ) {

		FileTypeEnum sc = null;
		for ( FileTypeEnum statusEnum : FileTypeEnum.values() ) {
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
			case ADHAR:
				return "ADHAR";
			case PASSPORT:
				return "PASSPORT";
			case DRIVING_LICENCE:
				return "DRIVING_LICENCE";

		}
		return "GeneralStatusEnum.toString() in uknown state.. database value: " + this.databaseValue;
	}

}
