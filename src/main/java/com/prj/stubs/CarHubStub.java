package com.prj.stubs;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.prj.dao.interfaces.ICarHubDao;
import com.prj.model.CarHub;

public class CarHubStub extends GenericDaoHibernate<CarHub,Integer> implements ICarHubDao {

	public CarHubStub() {

		super( CarHub.class );
	}

	public final static CarHub hebbal = new CarHub( "HEBBAL" );

	public final static CarHub newbelroad = new CarHub( "NEW BEL ROAD" );

	public final static CarHub mekaricircle = new CarHub( "MEKARI CIRCLE" );

	public final static CarHub sanjaynagar = new CarHub( "SANJAY NAGAR" );

	public List<CarHub> getCarHubs() {

		List<CarHub> carHubs = new ArrayList<CarHub>();

		carHubs.add( CarHubStub.hebbal );
		carHubs.add( CarHubStub.newbelroad );
		carHubs.add( CarHubStub.mekaricircle );
		carHubs.add( CarHubStub.sanjaynagar );
		return carHubs;

	}
}
