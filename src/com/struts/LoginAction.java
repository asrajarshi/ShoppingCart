/**
 * 
 */
package com.struts;

import com.logic.RetrieveData;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author asrajarshi
 *
 */
public class LoginAction extends ActionSupport {
		private String name;
		private String pword;
		
		public String execute(){
			RetrieveData retrieve = new RetrieveData();
			boolean result = retrieve.retrieve(name, pword);
			if(result)
				return SUCCESS;
			else
				return ERROR;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPword() {
			return pword;
		}

		public void setPword(String pword) {
			this.pword = pword;
		}
		
}
