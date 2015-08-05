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

import com.prj.dao.ICarDao;
import com.prj.model.Car;
import com.prj.model.CarHub;
import com.prj.model.CarModel;
import com.prj.model.CarStatusEnum;

public class CarDaoImpl extends GenericDaoHibernate<Car,Integer> implements ICarDao {

	public CarDaoImpl() {

		super( Car.class );
	}

	@SuppressWarnings("unchecked")
	public List<Car> getAvailableCarsByModel( final CarModel model , CarHub hub , Date startDate , Date endDate ) {

		return ( List<Car> ) getHibernateTemplate().execute( new HibernateCallback() {

			public List<Car> doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Car.class );
				criteria.createAlias( "model" , "model" );
				if ( model != null ) {

					criteria.add( Restrictions.eq( "model.name" , model.getName() ) );
				}
				return criteria.list();
			}
		} );

	}

	@SuppressWarnings("unchecked")
	public List<Car> getAvailableCarsByModel( final CarModel model , final CarStatusEnum available ) {

		return ( List<Car> ) getHibernateTemplate().execute( new HibernateCallback() {

			public List<Car> doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Car.class );
				criteria.createAlias( "model" , "model" );
				if ( model != null ) {
					criteria.add( Restrictions.eq( "model.name" , model.getName() ) );
				}
				criteria.add( Restrictions.eq( "status" , available ) );
				return criteria.list();

			}
		} );
	}

	public Car getCarByRegNo( final String regNo ) {

		return ( Car ) getHibernateTemplate().execute( new HibernateCallback() {

			public Car doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Car.class );

				criteria.add( Restrictions.eq( "regNumber" , regNo ) );
				return ( Car ) criteria.uniqueResult();

			}
		} );

	}

}
