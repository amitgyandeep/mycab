package com.prj.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.prj.dao.ICustomerDao;
import com.prj.model.Customer;
import com.prj.model.StatusEnum;

public class CustomerDaoImpl extends GenericDaoHibernate<Customer,Integer> implements ICustomerDao {

	public CustomerDaoImpl() {

		super( Customer.class );
	}

	public Boolean isCustomerByEmailId( final String inputText ) {

		return ( Boolean ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Customer.class );
				criteria.add( Restrictions.eq( "email" , inputText ) );
				if ( criteria.uniqueResult() != null ) {
					return false;
				} else {
					return true;
				}
			}
		} );

	}

	public Customer getCustomerByMobileNumber( final String mobileNumber ) {

		return ( Customer ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Customer.class );
				criteria.add( Restrictions.eq( "mobileNumber" , mobileNumber ) );
				return criteria.uniqueResult();
			}
		} );

	}

	public Customer getcustomerByEmailId( final String emailId ) {

		return ( Customer ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Customer.class );
				criteria.add( Restrictions.eq( "email" , emailId ) );
				return criteria.uniqueResult();
			}
		} );

	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers( final StatusEnum status ) {

		return ( List<Customer> ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Customer.class );
				criteria.add( Restrictions.eq( "status" , status ) );
				return criteria.list();
			}
		} );

	}
}
