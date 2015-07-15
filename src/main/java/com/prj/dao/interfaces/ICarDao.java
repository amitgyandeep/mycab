package com.prj.dao.interfaces;

import java.util.Date;
import java.util.List;

import org.appfuse.dao.GenericDao;

import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CarModel;

public interface ICarDao extends GenericDao<Car,Integer> {

	public List<Car> getAvailableCarsByModel( CarModel model , CarHub hub , Date startDate , Date endDate );

}
