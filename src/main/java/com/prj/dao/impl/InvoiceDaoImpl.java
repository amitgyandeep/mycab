package com.prj.dao.impl;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.prj.dao.IInvoiceDao;
import com.prj.model.TripInvoice;

public class InvoiceDaoImpl extends GenericDaoHibernate<TripInvoice,Integer> implements IInvoiceDao {

	public InvoiceDaoImpl() {

		super( TripInvoice.class );
	}

}