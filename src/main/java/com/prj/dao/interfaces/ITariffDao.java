package com.prj.dao.interfaces;

import org.appfuse.dao.GenericDao;

import com.prj.model.CarModel;
import com.prj.model.Tariff;
import com.prj.model.TariffType;

public interface ITariffDao extends GenericDao<Tariff,Integer> {

	public Tariff getTariffplanByType( TariffType type , CarModel model );

}
