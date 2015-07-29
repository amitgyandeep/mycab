package com.prj.dao.impl;

import java.sql.SQLException;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.prj.dao.IInvoiceDao;
import com.prj.model.InvoiceType;
import com.prj.model.TripInvoice;

public class InvoiceDaoImpl extends GenericDaoHibernate<TripInvoice,Integer> implements IInvoiceDao {

	public InvoiceDaoImpl() {

		super( TripInvoice.class );
	}

	public TripInvoice getInvoiceByBooking( final String bookingRef , final InvoiceType invoiceType ) {

		return ( TripInvoice ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( TripInvoice.class );
				criteria.createAlias( "booking" , "booking" );
				criteria.add( Restrictions.eq( "booking.bookingRef" , bookingRef ) );
				criteria.add( Restrictions.eq( "type" , invoiceType ) );
				return criteria.uniqueResult();
			}
		} );

	}

}