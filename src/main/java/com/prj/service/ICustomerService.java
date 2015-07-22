package com.prj.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.prj.model.Customer;

public interface ICustomerService extends GenericManager<Customer,Integer> {

	public List<Customer> getAllCustomers();

	public boolean isCustomerByEmailId( String inputText );

	public Customer getCustomerByMobileNumber( String mobileNumber );

	public Customer getcustomerByEmailId( String emailId );
}
