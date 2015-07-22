package com.prj.dao;

import org.appfuse.dao.GenericDao;

import com.prj.model.User;

public interface IUserDao extends GenericDao<User,Integer> {

	/**
	 * user authentication by email and password
	 */
	User authenticateUser( User user );

	User getUserByEmailId( String email );

}
