package com.prj.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.prj.model.Customer;
import com.prj.model.StatusEnum;

public interface ICustomerDao extends GenericDao<Customer,Integer> {

	Boolean isCustomerByEmailId( String inputText );

	Customer getCustomerByMobileNumber( String mobileNumber );

	Customer getcustomerByEmailId( String emailId );

	List<Customer> getAllCustomers( StatusEnum status );

}
