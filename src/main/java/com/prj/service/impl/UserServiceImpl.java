package com.prj.service.impl;

import org.appfuse.service.impl.GenericManagerImpl;

import com.prj.dao.interfaces.IUserDao;
import com.prj.model.Customer;
import com.prj.model.Role;
import com.prj.model.User;
import com.prj.service.interfaces.IUserService;

public class UserServiceImpl extends GenericManagerImpl<User,Integer> implements IUserService {

	private IUserDao userDao;

	public UserServiceImpl( IUserDao userDao ) {

		super( userDao );
		this.userDao = userDao;
	}

	public User createUser( Customer customer ) {

		String password = getAlphaNumbericRandom();
		User user = new User();

		Role role = new Role();
		role.setId( Role.CUSTOMER );

		user.setEmailId( customer.getEmail() );
		user.setPassword( password );
		user.setRole( role );

		user = save( user );
		return user;

	}

	public static String getAlphaNumbericRandom() {

		String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
		int numberOfCodes = 0;//controls the length of alpha numberic string
		String code = "";
		while ( numberOfCodes < 6 ) {
			char c = chars.charAt( ( int ) ( Math.random() * chars.length() ) );
			code += c;
			numberOfCodes++;
		}
		System.out.println( "Code is :" + code );
		return code;
	}

	public User authenticateUser( User user ) {

		// TODO Auto-generated method stub
		return userDao.authenticateUser( user );
	}

	public User getUserByEmailId( String email ) {

		// TODO Auto-generated method stub
		return userDao.getUserByEmailId( email );
	}

}
