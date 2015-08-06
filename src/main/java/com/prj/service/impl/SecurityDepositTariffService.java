package com.prj.service.impl;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.ISecurityDepositDao;
import com.prj.model.CarModel;
import com.prj.model.SecurityDeposit;
import com.prj.service.ISecurityDepositService;

public class SecurityDepositTariffService extends GenericManagerImpl<SecurityDeposit,Integer> implements ISecurityDepositService {

	ISecurityDepositDao securityDepositDao;

	public SecurityDepositTariffService( ISecurityDepositDao securityDepositDAO ) {

		super( securityDepositDAO );
		this.securityDepositDao = securityDepositDAO;
	}

	public double getPrice( CarModel model ) {

		// TODO Auto-generated method stub
		return securityDepositDao.getPrice( model );
	}

	public void setSecurityDepositDAO( ISecurityDepositDao securityDepositDAO ) {

		this.securityDepositDao = securityDepositDAO;
	}

}
