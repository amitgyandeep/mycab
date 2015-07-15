package com.prj.service.impl;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.interfaces.ISecurityDepositDao;
import com.prj.model.CarSegment;
import com.prj.model.SecurityDeposit;
import com.prj.service.interfaces.ISecurityDepositService;

public class SecurityDepositTariffService extends GenericManagerImpl<SecurityDeposit,Integer> implements ISecurityDepositService {

	ISecurityDepositDao securityDepositDao;

	public SecurityDepositTariffService( ISecurityDepositDao securityDepositDAO ) {

		super( securityDepositDAO );
		this.securityDepositDao = securityDepositDAO;
	}

	public double getPrice( CarSegment segment ) {

		// TODO Auto-generated method stub
		return securityDepositDao.getPrice( segment );
	}

	public void setSecurityDepositDAO( ISecurityDepositDao securityDepositDAO ) {

		this.securityDepositDao = securityDepositDAO;
	}

}
