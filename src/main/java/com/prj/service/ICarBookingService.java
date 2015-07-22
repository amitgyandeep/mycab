package com.prj.service;

import java.util.Date;
import java.util.List;

import org.appfuse.service.GenericManager;

import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CarModel;

public interface ICarBookingService extends GenericManager<Car,Integer> {

	List<Car> getAvailableCars( CarHub hub , Date startDate , Date endDate );

	List<Car> getAvailableCars( Date startDate , Date endDate );

	/**
	 * @param model
	 * @param hub
	 * @param startDate
	 * @param endDate
	 * @return
	 * 
	 * 
	 */
	List<Car> getAvailableCarsByModel( CarModel model , CarHub hub , Date startDate , Date endDate );

}
