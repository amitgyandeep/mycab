package com.prj.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.prj.model.Booking;
import com.prj.model.CarHub;

public interface IBookingDao extends GenericDao<Booking,Integer> {

	List<Booking> getAllBookingByHub( CarHub carHub );

}
