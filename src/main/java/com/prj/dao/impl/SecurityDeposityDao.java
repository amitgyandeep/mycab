package com.prj.dao.impl;

import java.sql.SQLException;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.prj.dao.ISecurityDepositDao;
import com.prj.model.CarModel;
import com.prj.model.SecurityDeposit;

public class SecurityDeposityDao extends GenericDaoHibernate<SecurityDeposit,Integer> implements ISecurityDepositDao {

	public SecurityDeposityDao() {

		super( SecurityDeposit.class );
	}

	public double getPrice( final CarModel model ) {

		return ( Double ) getHibernateTemplate().execute( new HibernateCallback() {

			public Double doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( SecurityDeposit.class );
				criteria.add( Restrictions.eq( "modelId" , model.getId() ) );
				SecurityDeposit securityDeposit = ( SecurityDeposit ) criteria.uniqueResult();
				if ( securityDeposit != null ) {
					return securityDeposit.getCost();
				} else {
					return 0.0;
				}
			}
		} );

	}
}
