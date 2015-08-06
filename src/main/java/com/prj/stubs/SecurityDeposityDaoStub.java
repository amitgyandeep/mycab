/*package com.prj.stubs;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.prj.dao.ISecurityDepositDao;
import com.prj.model.CarSegment;
import com.prj.model.SecurityDeposit;

public class SecurityDeposityDaoStub extends
		GenericDaoHibernate<SecurityDeposit, Integer> implements
		ISecurityDepositDao {

	public SecurityDeposityDaoStub() {

		super(SecurityDeposit.class);
	}

	public double getPrice(CarSegment segment) {

		if (CarSegmentStub.suv.getName().equals(segment.getName())) {
			return 8000;
		}

		if (CarSegmentStub.crossover.getName().equals(segment.getName())) {
			return 6000;
		}

		if (CarSegmentStub.luxury.getName().equals(segment.getName())) {
			return 10000;

		}

		if (CarSegmentStub.sedan.getName().equals(segment.getName())) {
			return 4000;
		}
		if (CarSegmentStub.hatchback.getName().equals(segment.getName())) {
			return 4000;
		}

		return 0;
	}

	public boolean exists(Integer arg0) {

		// TODO Auto-generated method stub
		return false;
	}

	public SecurityDeposit get(Integer arg0) {

		// TODO Auto-generated method stub
		return null;
	}

	public List<SecurityDeposit> getAll() {

		// TODO Auto-generated method stub
		return null;
	}

	public void remove(Integer arg0) {

		// TODO Auto-generated method stub

	}

	public SecurityDeposit save(SecurityDeposit arg0) {

		// TODO Auto-generated method stub
		return null;
	}
}
*/