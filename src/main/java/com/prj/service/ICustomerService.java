package com.prj.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.prj.model.Customer;
import com.prj.model.StatusEnum;

public interface ICustomerService extends GenericManager<Customer,Integer> {

	public List<Customer> getAllCustomers( StatusEnum status );

	public boolean isCustomerByEmailId( String inputText );

	public Customer getCustomerByMobileNumber( String mobileNumber );

	public Customer getcustomerByEmailId( String emailId );
}
