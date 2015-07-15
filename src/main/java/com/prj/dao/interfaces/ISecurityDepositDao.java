package com.prj.dao.interfaces;

import org.appfuse.dao.GenericDao;

import com.prj.model.CarSegment;
import com.prj.model.SecurityDeposit;

public interface ISecurityDepositDao extends GenericDao<SecurityDeposit,Integer> {

	public double getPrice( CarSegment segment );

}
