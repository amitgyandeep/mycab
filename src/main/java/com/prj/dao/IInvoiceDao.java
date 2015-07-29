package com.prj.dao;

import org.appfuse.dao.GenericDao;

import com.prj.model.InvoiceType;
import com.prj.model.TripInvoice;

public interface IInvoiceDao extends GenericDao<TripInvoice,Integer> {
	
	public TripInvoice getInvoiceByBooking( final String bookingRef, final InvoiceType invoiceType );

}
