/**
 * 
 */
package com.struts;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.logic.UpdateList;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author asrajarshi
 *
 */
public class SubmitAction extends ActionSupport implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	private SessionMap<String,Object> sessionMap;
	
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		sessionMap = (SessionMap)arg0;
	}

	public String cart(){
		String product = (String) sessionMap.get("choice");
		System.out.println(product+ " is chosen");
		String name = (String)sessionMap.get("name");
		UpdateList updatelist = new UpdateList();
		boolean result = updatelist.update(name, product);
		if(result)
			return SUCCESS;
		else 
			return ERROR;
	}
	
	public String wish(){
		String a = null;
		//a = request.getParameter("a");
		System.out.println(a);
		return ERROR;
	}
	

	
}
