package com.prj.dao.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.prj.dao.IBookingDao;
import com.prj.model.Booking;
import com.prj.model.BookingStatus;
import com.prj.model.CarHub;
import com.prj.model.User;

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

	@SuppressWarnings("unchecked")
	public List<Booking> getUpcomingTripForUser( User user ) {

		return ( List<Booking> ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Booking.class );
				criteria.add( Restrictions.ge( "startDateTime" , new Date() ) );
				criteria.add( Restrictions.eq( "status",BookingStatus.UPCOMING ) );
				return criteria.list();
			}
		} );

	}

	public Booking getBookingWithInvoices( final Integer bookingId ) {

		return ( Booking ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Booking.class );
				criteria.add( Restrictions.eq( "id" , bookingId ) );
				return criteria.uniqueResult();
			}
		} );

	}
	
	
	public Booking getBookingByReference( final String bookingRef ) {

		return ( Booking ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Booking.class );
				criteria.add( Restrictions.eq( "bookingRef" , bookingRef ) );
				return criteria.uniqueResult();
			}
		} );

	}

}