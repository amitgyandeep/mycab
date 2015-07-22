package com.prj.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.prj.model.CarHub;

public interface ICarHubDao extends GenericDao<CarHub,Integer> {

	List<CarHub> getCarHubs();

}
