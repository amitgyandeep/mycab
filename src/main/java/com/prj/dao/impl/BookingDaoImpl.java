package com.prj.dao.impl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Disjunction;
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
	public List<Booking> getAllBookingByHub( final CarHub carHub , final BookingStatus status ) {

		return ( List<Booking> ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Booking.class );
				criteria.add( Restrictions.eq( "carHub" , carHub.getName() ) );
				criteria.add( Restrictions.eq( "status" , BookingStatus.INPROGRESS ) );
				return criteria.list();
			}
		} );

	}

	@SuppressWarnings("unchecked")
	public List<Booking> getUpcomingTripForUser( final User user ) {

		return ( List<Booking> ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Booking.class );
				if ( user != null ) {
					criteria.createAlias( "user" , "user" );
					criteria.add( Restrictions.ge( "user.id" , user.getId() ) );
				}
				criteria.add( Restrictions.ge( "startDateTime" , new Date() ) );

				Disjunction disjunction = Restrictions.disjunction();
				disjunction.add( Restrictions.eq( "status" , BookingStatus.UPCOMING ) );
				disjunction.add( Restrictions.eq( "status" , BookingStatus.INPROGRESS ) );

				criteria.add( disjunction );

				return criteria.list();
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

	public Booking getBookingWithInvoices( Integer bookingId ) {

		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Booking> getUppcomingTrip( BookingStatus status ) {

		return ( List<Booking> ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Booking.class );
				criteria.add( Restrictions.eq( "status" , BookingStatus.UPCOMING ) );
				criteria.add( Restrictions.eq( "vehicleRegNum" , null ) );
				return criteria.list();
			}
		} );

	}
}