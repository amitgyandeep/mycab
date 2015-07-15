package com.prj.dao.impl;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.prj.dao.interfaces.ISecurityDepositDao;
import com.prj.model.CarModel;
import com.prj.model.CarSegment;
import com.prj.model.SecurityDeposit;

public class SecurityDeposityDao extends GenericDaoHibernate<SecurityDeposit,Integer> implements ISecurityDepositDao {

	public SecurityDeposityDao() {

		super( SecurityDeposit.class );
	}

	public double getPrice( CarSegment segment ) {

		final CarModel fordEcosport = new CarModel();
		fordEcosport.setName( "Ford Ecosport" );

		final CarModel hondaCity = new CarModel();
		hondaCity.setName( "Honda City" );

		final CarModel alto = new CarModel();
		alto.setName( "Alto" );

		final CarModel fortuner = new CarModel();
		fortuner.setName( "Fortuner" );

		final CarSegment suv = new CarSegment();
		suv.setName( "SUV" );

		final CarSegment compact = new CarSegment();
		compact.setName( "Compact" );

		final CarSegment hatchback = new CarSegment();
		hatchback.setName( "Hatchback" );

		final CarSegment sedan = new CarSegment();
		sedan.setName( "Sedan" );

		if ( suv.getName().equals( segment.getName() ) ) {
			return 6000;
		}

		if ( hatchback.getName().equals( segment.getName() ) ) {
			return 5000;
		}

		if ( sedan.getName().equals( segment.getName() ) ) {
			return 4000;

		}

		if ( compact.getName().equals( segment.getName() ) ) {
			return 3000;

		}
		return 0;
	}

	public boolean exists( Integer arg0 ) {

		// TODO Auto-generated method stub
		return false;
	}

	public SecurityDeposit get( Integer arg0 ) {

		// TODO Auto-generated method stub
		return null;
	}

	public List<SecurityDeposit> getAll() {

		// TODO Auto-generated method stub
		return null;
	}

	public void remove( Integer arg0 ) {

		// TODO Auto-generated method stub

	}

	public SecurityDeposit save( SecurityDeposit arg0 ) {

		// TODO Auto-generated method stub
		return null;
	}
}
