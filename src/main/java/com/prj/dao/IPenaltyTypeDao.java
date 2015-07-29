package com.prj.dao;

import org.appfuse.dao.GenericDao;

import com.prj.model.PenaltyType;

public interface IPenaltyTypeDao extends GenericDao<PenaltyType,Integer> {

	public PenaltyType getPenality( final String penaltyName );
}
