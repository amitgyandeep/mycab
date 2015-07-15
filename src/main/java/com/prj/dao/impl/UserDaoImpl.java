package com.prj.dao.impl;

import java.sql.SQLException;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.prj.dao.interfaces.IUserDao;
import com.prj.model.User;

public class UserDaoImpl extends GenericDaoHibernate<User,Integer> implements IUserDao {

	public UserDaoImpl() {

		super( User.class );
	}

	public User authenticateUser( final User user ) {

		return ( User ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( User.class );
				criteria.add( Restrictions.eq( "emailId" , user.getEmailId() ) );
				criteria.add( Restrictions.eq( "password" , user.getPassword() ) );
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