package com.prj.service.interfaces;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.prj.model.Car;

public interface ICarService extends GenericManager<Car,Integer> {

	List<Car> getAllCars();

}
