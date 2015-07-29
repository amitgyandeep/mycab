package com.prj.service.impl;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.IPenaltyTypeDao;
import com.prj.model.PenaltyType;
import com.prj.service.IPenaltyTypeService;

public class PenaltyTypeServiceImpl extends GenericManagerImpl<PenaltyType,Integer> implements IPenaltyTypeService {

	private IPenaltyTypeDao penaltyTypeDao;

	public PenaltyTypeServiceImpl( IPenaltyTypeDao penaltyTypeDao ) {

		super( penaltyTypeDao );
		this.penaltyTypeDao = penaltyTypeDao;
	}

	public PenaltyType getPenaltyByName( String penaltyName ) {

		// TODO Auto-generated method stub
		return penaltyTypeDao.getPenality( penaltyName );
	}

}
