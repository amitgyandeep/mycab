package com.prj.dao;

import org.appfuse.dao.GenericDao;

import com.prj.model.Customer;

public interface ICustomerDao extends GenericDao<Customer,Integer> {

	Boolean isCustomerByEmailId( String inputText );

	Customer getCustomerByMobileNumber( String mobileNumber );

	Customer getcustomerByEmailId( String emailId );

}
