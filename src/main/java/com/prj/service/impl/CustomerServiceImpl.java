package com.prj.service.impl;

import java.util.List;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.ICustomerDao;
import com.prj.model.Customer;
import com.prj.model.Document;
import com.prj.model.StatusEnum;
import com.prj.service.ICustomerService;
import com.prj.service.IDocumentService;

public class CustomerServiceImpl extends GenericManagerImpl<Customer,Integer> implements ICustomerService {

	private ICustomerDao customerDao;

	private IDocumentService documentService;

	public CustomerServiceImpl( ICustomerDao customerDao ) {

		super( customerDao );
		this.customerDao = customerDao;
	}

	public List<Customer> getAllCustomers( StatusEnum status ) {

		List<Customer> customerList = customerDao.getAllCustomers( status );
		if ( customerList != null && customerList.size() > 0 ) {
			for ( Customer customer : customerList ) {
				List<Document> docs = documentService.getDocumentsByCustomer( customer );
				if ( docs != null )
					customer.setDocs( docs );
			}
		}
		return customerList;
	}

	public boolean isCustomerByEmailId( String inputText ) {

		return customerDao.isCustomerByEmailId( inputText );
	}

	public Customer getCustomerByMobileNumber( String mobileNumber ) {

		return customerDao.getCustomerByMobileNumber( mobileNumber );
	}

	public Customer getcustomerByEmailId( String emailId ) {

		return customerDao.getcustomerByEmailId( emailId );
	}

	public IDocumentService getDocumentService() {

		return documentService;
	}

	public void setDocumentService( IDocumentService documentService ) {

		this.documentService = documentService;
	}

}
