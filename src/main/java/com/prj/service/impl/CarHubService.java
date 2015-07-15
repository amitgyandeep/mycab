package com.prj.service.impl;

import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.interfaces.ICarHubDao;
import com.prj.model.CarHub;
import com.prj.service.interfaces.ICarHubService;

public class CarHubService extends GenericManagerImpl<CarHub,Integer> implements ICarHubService {

	private ICarHubDao carHubDAO;

	public CarHubService( ICarHubDao carHubDAO ) {

		super( carHubDAO );
		this.carHubDAO = carHubDAO;
	}

	public List<CarHub> getCarHubs() {

		// TODO Auto-generated method stub
		return carHubDAO.getCarHubs();
	}

}
