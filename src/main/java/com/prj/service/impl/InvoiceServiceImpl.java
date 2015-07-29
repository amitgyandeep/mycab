package com.prj.service.impl;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.IInvoiceDao;
import com.prj.model.InvoiceType;
import com.prj.model.TripInvoice;
import com.prj.service.IInvoiceService;

public class InvoiceServiceImpl extends GenericManagerImpl<TripInvoice,Integer> implements IInvoiceService {

	private IInvoiceDao invoiceDao;

	public InvoiceServiceImpl( IInvoiceDao invoiceDao ) {

		super( invoiceDao );
		this.invoiceDao = invoiceDao;
	}

	public TripInvoice getInvoiceByBooking( final String bookingRef , final InvoiceType invoiceType ) {

		return invoiceDao.getInvoiceByBooking( bookingRef , invoiceType );
	}

}
