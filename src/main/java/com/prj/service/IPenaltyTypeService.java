package com.prj.service;

import org.appfuse.service.GenericManager;

import com.prj.model.PenaltyType;

public interface IPenaltyTypeService extends GenericManager<PenaltyType,Integer> {

	public PenaltyType getPenaltyByName( String penaltyName );

}
