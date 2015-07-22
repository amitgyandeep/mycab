package com.prj.service;

import org.appfuse.service.GenericManager;

import com.prj.model.CarSegment;
import com.prj.model.SecurityDeposit;

public interface ISecurityDepositService extends GenericManager<SecurityDeposit,Integer> {

	double getPrice( CarSegment segment );

}
