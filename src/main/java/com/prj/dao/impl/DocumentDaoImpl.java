package com.prj.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.prj.dao.IDocumentDao;
import com.prj.model.Customer;
import com.prj.model.Document;

public class DocumentDaoImpl extends GenericDaoHibernate<Document,Integer> implements IDocumentDao {

	public DocumentDaoImpl() {

		super( Document.class );
	}

	@SuppressWarnings("unchecked")
	public List<Document> getDocumentsByCustomer( final Customer customer ) {

		return ( List<Document> ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( final Session session ) throws HibernateException, SQLException {

				Criteria criteria = getSession().createCriteria( Document.class );
				criteria.createAlias( "customer" , "customer" );
				criteria.add( Restrictions.eq( "customer.id" , customer.getId() ) );
				return criteria.list();
			}
		} );

	}
}