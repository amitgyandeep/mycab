package com.prj.dao;

import org.appfuse.dao.GenericDao;

import com.prj.model.CarModel;
import com.prj.model.SecurityDeposit;

public interface ISecurityDepositDao extends GenericDao<SecurityDeposit,Integer> {

	public double getPrice( CarModel model );

}
