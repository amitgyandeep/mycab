package com.t4u.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prj.model.Role;
import com.prj.model.User;
import com.prj.service.interfaces.IUserService;

public class TestUser {

	private ApplicationContext ctx;

	IUserService userService;

	User user = new User();

	@Test
	public void test() {

		userService.save( user );

	}

	@Before
	public void setup() {

		this.ctx = new ClassPathXmlApplicationContext( "applicationContext.xml" );
		userService = ( IUserService ) ctx.getBean( "userService" );

		user.setEmailId( "amit@gmail.com" );
		user.setPassword( "password" );
		Role role = new Role();
		role.setId( 2 );
		user.setRole( role );

	}

	@After
	public void showUsers() {

		List<User> users = userService.getAll();

		for ( User user : users )
			System.out.println( user.getEmailId() );
	}
}