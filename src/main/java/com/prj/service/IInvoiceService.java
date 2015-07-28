package com.prj.service;

import org.appfuse.service.GenericManager;

import com.prj.model.InvoiceType;
import com.prj.model.TripInvoice;

public interface IInvoiceService extends GenericManager<TripInvoice,Integer> {
	
	public TripInvoice getInvoiceByBooking( final String bookingRef, final InvoiceType invoiceType );

}
