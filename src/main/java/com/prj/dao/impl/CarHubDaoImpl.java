package com.prj.dao.impl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.prj.dao.interfaces.ICarHubDao;
import com.prj.model.CarHub;

public class CarHubDaoImpl extends GenericDaoHibernate<CarHub,Integer> implements ICarHubDao {

	public CarHubDaoImpl() {

		super( CarHub.class );
	}

	public List<CarHub> getCarHubs() {

		// TODO Auto-generated method stub
		return null;
	}

}
