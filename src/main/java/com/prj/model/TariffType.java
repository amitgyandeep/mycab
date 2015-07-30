package com.prj.model;

public enum TariffType {

	StandardWeekdayTariff(1), StandardWeekendTariff(2);

	private int databaseValue;

	private TariffType( int value ) {

		this.databaseValue = value;
	}

	// the identifierMethod
	public int toInt() {

		return this.databaseValue;
	}

	// the valueOfMethod
	public static TariffType fromInt( int value ) {

		switch ( value ) {

			case 1:
				return StandardWeekdayTariff;
			case 2:
				return StandardWeekendTariff;

			default:
				return StandardWeekdayTariff;
		}
	}

	public static TariffType getByDescription( String value ) {

		TariffType sc = null;
		for ( TariffType statusEnum : TariffType.values() ) {
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
			case StandardWeekdayTariff:
				return "StandardWeekdayTariff";
			case StandardWeekendTariff:
				return "StandardWeekendTariff";

		}
		return "GeneralStatusEnum.toString() in uknown state.. database value: " + this.databaseValue;
	}
}