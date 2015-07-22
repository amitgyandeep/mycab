package com.prj.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.ICarDao;
import com.prj.model.Car;
import com.prj.model.CarModel;
import com.prj.model.Tariff;
import com.prj.service.ICarPricingService;
import com.prj.service.ITariffService;

public class CarPricingService extends GenericManagerImpl<Car,Integer> implements ICarPricingService {

	List<ITariffService> tariffServiceList;

	ICarDao carDAO;

	public CarPricingService( ICarDao carDAO ) {

		super( carDAO );
		this.carDAO = carDAO;
	}

	public List<Tariff> getCarPrice( CarModel model , Date startDate , Date endDate ) {

		List<Tariff> tariffs = new ArrayList<Tariff>();

		for ( ITariffService tariffService : tariffServiceList ) {
			Tariff tariff = tariffService.getTariff( model , startDate , endDate );

			if ( tariff != null ) {
				tariffs.add( tariff );
			}
		}

		return tariffs;
	}

	public void setTariffServiceList( List<ITariffService> tariffServiceList ) {

		this.tariffServiceList = tariffServiceList;
	}

}
