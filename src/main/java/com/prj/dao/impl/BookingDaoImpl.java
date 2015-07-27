package com.prj.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.prj.dao.IBookingDao;
import com.prj.model.Booking;
import com.prj.model.CarHub;

public class BookingDaoImpl extends GenericDaoHibernate<Booking,Integer> implements IBookingDao {

	public BookingDaoImpl() {

		super( Booking.class );
	}

	@SuppressWarnings("unchecked")
	public List<Booking> getAllBookingByHub( final CarHub carHub ) {

		return ( List<Booking> ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Booking.class );
				criteria.add( Restrictions.eq( "carHub" , carHub.getName() ) );
				return criteria.list();
			}
		} );

	}

}