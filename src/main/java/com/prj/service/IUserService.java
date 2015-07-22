package com.prj.service;

import org.appfuse.service.GenericManager;

import com.prj.model.Customer;
import com.prj.model.User;

public interface IUserService extends GenericManager<User,Integer> {

	/**
	 * 
	 * @param user
	 * @return User
	 * 
	 * if user is valid else null
	 */
	User authenticateUser( User user );

	/**
	 * 
	 * @param user EmailId
	 * @return User
	 * 
	 * if EmailId is valid else null
	 */
	User getUserByEmailId( String email );

	public User createUser( Customer customer );

}
