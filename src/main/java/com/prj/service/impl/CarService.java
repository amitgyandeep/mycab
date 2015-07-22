package com.prj.service.impl;

import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.ICarDao;
import com.prj.model.Car;
import com.prj.service.ICarService;

public class CarService extends GenericManagerImpl<Car,Integer> implements ICarService {

	private ICarDao carDAO;

	public CarService( ICarDao carDAO ) {

		super( carDAO );
		this.carDAO = carDAO;
	}

	public List<Car> getAllCars() {

		// TODO Auto-generated method stub
		return carDAO.getAvailableCarsByModel( null , null , null , null );
	}

}
