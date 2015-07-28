package com.prj.service.impl;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.LocalDate;

import com.prj.dao.ITariffDao;
import com.prj.model.CarModel;
import com.prj.model.DaysOfWeek;
import com.prj.model.Tariff;
import com.prj.model.TariffType;
import com.prj.service.ITariffService;

public class StandardWeekdayTariffService implements ITariffService {

	private ITariffDao tariffDao;

	public StandardWeekdayTariffService( ITariffDao tariffDao ) {

		this.tariffDao = tariffDao;
	}

	public StandardWeekdayTariffService() {

	}

	public Tariff getTariff( CarModel model , Date start , Date end ) {

		Tariff calculatedTariff = null;

		DateTime startDate = new DateTime( start );

		DateTime endDate = new DateTime( end );

		Tariff tariff = tariffDao.getTariffplanByType( TariffType.StandardWeekdayTariff , model );

		double totalCost = 0;
		Duration duration = new Duration( startDate , endDate );

		if ( startDate.getDayOfMonth() == endDate.getDayOfMonth() ) {
			if ( !isWeekday( new LocalDate( startDate ) , tariff.getApplicableDays() ) ) {
				return null;
			}
			totalCost = duration.getStandardHours() * tariff.getRatePerHour();
		} else {

			List<DaysOfWeek> days = tariff.getApplicableDays();

			int startDateHours = 24 - startDate.getHourOfDay();

			int endDateHours = ( int ) endDate.getHourOfDay() % 24;

			int remainingHours = getBillableHours( startDate.plusDays( 1 ) , endDate.minusDays( 1 ) , days ) * 24;

			int totalHours = remainingHours;

			if ( isWeekday( new LocalDate( startDate ) , days ) ) {
				totalHours += startDateHours;
			}

			if ( isWeekday( new LocalDate( endDate ) , days ) ) {
				totalHours += endDateHours;
			}

			totalCost += tariff.getRatePerHour() * totalHours;

		}

		if ( totalCost != 0 ) {

			calculatedTariff = new Tariff();

			calculatedTariff.setType( TariffType.StandardWeekdayTariff );
			calculatedTariff.setCost( totalCost );
			calculatedTariff.setRatePerHour( tariff.getRatePerHour() );
		}
		return calculatedTariff;
	}

	private int getBillableHours( DateTime startDate , DateTime endDate , List<DaysOfWeek> days ) {

		int billableDays = 0;

		LocalDate start = new LocalDate( startDate );
		LocalDate end = new LocalDate( startDate );

		for ( LocalDate date = start ; date.isBefore( end ) || date.isEqual( end ) ; date = date.plusDays( 1 ) ) {

			if ( isWeekday( date , days ) )
				billableDays++;

		}

		return billableDays;
	}

	private boolean isWeekday( LocalDate date , List<DaysOfWeek> days ) {

		for ( DaysOfWeek day : days ) {

			if ( day.ordinal() + 1 == date.getDayOfWeek() ) {
				return true;
			}
		}

		return false;
	}

	public boolean exists( Integer arg0 ) {

		// TODO Auto-generated method stub
		return false;
	}

	public Tariff get( Integer arg0 ) {

		// TODO Auto-generated method stub
		return null;
	}

	public List<Tariff> getAll() {

		// TODO Auto-generated method stub
		return null;
	}

	public void remove( Integer arg0 ) {

		// TODO Auto-generated method stub

	}

	public Tariff save( Tariff arg0 ) {

		// TODO Auto-generated method stub
		return null;
	}

}