package com.prj.dao.impl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.prj.dao.ICarHubDao;
import com.prj.model.CarHub;

public class CarHubDao extends GenericDaoHibernate<CarHub,Integer> implements ICarHubDao {

	public CarHubDao() {

		super( CarHub.class );
	}

	public List<CarHub> getCarHubs() {

		// TODO Auto-generated method stub
		return null;
	}

}
