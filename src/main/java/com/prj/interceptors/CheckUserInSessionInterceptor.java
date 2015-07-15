package com.prj.interceptors;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.prj.model.User;

public class CheckUserInSessionInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public String intercept( ActionInvocation invocation ) throws Exception {

		ActionContext ac = invocation.getInvocationContext();
		HttpServletRequest request = ( HttpServletRequest ) ac.get( StrutsStatics.HTTP_REQUEST );

		Map<String,Object> session = ac.getSession();
		User user = ( User ) session.get( "loggedUser" );
		if ( user == null ) {
			return "userNotInSession";
		}

		return invocation.invoke();
	}

	public void destroy() {

	}

	public void init() {

	}

}
