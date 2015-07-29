package com.prj.dao.impl;

import java.sql.SQLException;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.prj.dao.IPenaltyTypeDao;
import com.prj.model.PenaltyType;
import com.prj.model.User;

public class PenaltyTypeDaoImpl extends GenericDaoHibernate<PenaltyType,Integer> implements IPenaltyTypeDao {

	public PenaltyTypeDaoImpl() {

		super( PenaltyType.class );
	}

	public PenaltyType getPenality( final String penaltyName ) {

		return ( PenaltyType ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( PenaltyType.class );
				criteria.add( Restrictions.eq( "name" , penaltyName ) );
				return criteria.uniqueResult();
			}
		} );
	}

	public User getUserByEmailId( final String email ) {

		return ( User ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( User.class );
				criteria.add( Restrictions.eq( "emailId" , email ) );
				return criteria.uniqueResult();
			}
		} );

	}
}