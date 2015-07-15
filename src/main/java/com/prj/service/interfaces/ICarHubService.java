package com.prj.service.interfaces;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.prj.model.CarHub;

public interface ICarHubService extends GenericManager<CarHub,Integer> {

	List<CarHub> getCarHubs();

}
