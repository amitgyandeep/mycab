package com.prj.service.interfaces;

import java.util.Date;
import java.util.List;

import org.appfuse.service.GenericManager;

import com.prj.model.Car;
import com.prj.model.CarModel;
import com.prj.model.Tariff;

public interface ICarPricingService extends GenericManager<Car,Integer> {

	List<Tariff> getCarPrice( CarModel model , Date startDate , Date endDate );

}
