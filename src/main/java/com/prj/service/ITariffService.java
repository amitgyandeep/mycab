package com.prj.service;

import java.util.Date;

import org.appfuse.service.GenericManager;

import com.prj.model.CarModel;
import com.prj.model.Tariff;

public interface ITariffService extends GenericManager<Tariff,Integer> {

	Tariff getTariff( CarModel model , Date startDate , Date endDate );

}
