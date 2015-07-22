package com.prj.stubs;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.prj.dao.ICarHubDao;
import com.prj.model.CarHub;

public class CarHubStub extends GenericDaoHibernate<CarHub, Integer> implements
		ICarHubDao {

	public CarHubStub() {

		super(CarHub.class);
	}

	public final static CarHub delhi = new CarHub("Delhi");

	public List<CarHub> getCarHubs() {
		List<CarHub> carHubs = new ArrayList<CarHub>();

		carHubs.add(CarHubStub.delhi);

		return carHubs;

	}
}
