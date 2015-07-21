package com.prj.service.impl;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.Duration;

import com.prj.dao.interfaces.ITariffDao;
import com.prj.model.CarModel;
import com.prj.model.DaysOfWeek;
import com.prj.model.Tariff;
import com.prj.model.TariffType;
import com.prj.service.interfaces.ITariffService;

public class StandardWeekendTariffService implements ITariffService {

	private ITariffDao tariffDao;

	public StandardWeekendTariffService( ITariffDao tariffDao ) {

		this.tariffDao = tariffDao;
	}

	public StandardWeekendTariffService() {

	}

	public Tariff getTariff( CarModel model , Date start , Date end ) {

		Tariff calculatedTariff = null;

		DateTime startDate = new DateTime( start );

		DateTime endDate = new DateTime( end );

		Tariff tariff = tariffDao.getTariffplanByType( TariffType.StandardWeekendTariff , model );

		double totalCost = 0;
		Duration duration = new Duration( startDate , endDate );

		if ( startDate.getDayOfMonth()==endDate.getDayOfMonth()) {
			if ( !isWeekend( startDate , tariff.getApplicableDays() ) ) {
				return null;
			}
			totalCost = duration.getStandardHours() * tariff.getRatePerHour();
		} else {

			List<DaysOfWeek> days = tariff.getApplicableDays();

			int startDateHours = 24 - startDate.getHourOfDay();

			int endDateHours = ( int ) endDate.getHourOfDay() % 24;

			int remainingHours = getBillableHours( startDate.plusDays( 1 ) , endDate.minusDays( 1 ) , days ) * 24;

			int totalHours = remainingHours;

			if ( isWeekend( startDate , days ) ) {
				totalHours += startDateHours;
			}

			if ( isWeekend( endDate , days ) ) {
				totalHours += endDateHours;
			}

			totalCost += tariff.getRatePerHour() * totalHours;

		}

		if ( totalCost != 0 ) {

			calculatedTariff = new Tariff();

			calculatedTariff.setType( TariffType.StandardWeekendTariff );
			calculatedTariff.setCost( totalCost );
			calculatedTariff.setRatePerHour( tariff.getRatePerHour() );
		}
		return calculatedTariff;
	}

	private int getBillableHours( DateTime startDate , DateTime endDate , List<DaysOfWeek> days ) {

		int billableDays = 0;

		for ( DateTime date = startDate ; date.getMillisOfDay()>endDate.getMillisOfDay() ; date = date.plusDays( 1 ) ) {

			if ( isWeekend( date , days ) )
				billableDays++;

		}
		return billableDays;
	}

	private boolean isWeekend( DateTime date , List<DaysOfWeek> days ) {

		for ( DaysOfWeek day : days ) {

			if ( day.ordinal() + 1 == date.getDayOfWeek() ) {
				return true;
			}
		}

		return false;
	}

	public void setTariffDao( ITariffDao tariffDao ) {

		this.tariffDao = tariffDao;
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