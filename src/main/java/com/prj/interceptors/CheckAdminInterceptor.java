package com.prj.interceptors;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.prj.model.Role;
import com.prj.model.User;

public class CheckAdminInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	public String intercept( ActionInvocation invocation ) throws Exception {

		ActionContext ac = invocation.getInvocationContext();
		HttpServletRequest request = ( HttpServletRequest ) ac.get( StrutsStatics.HTTP_REQUEST );
		Map session = ac.getSession();
		User user = ( User ) session.get( "loggedUser" );
		if ( user != null && user.getRole().getId().equals( Role.ADMIN ) ) {
			return invocation.invoke();
		} else {
			return "adminNotInSession";
		}

	}

	public void destroy() {

	}

	public void init() {

	}
}
