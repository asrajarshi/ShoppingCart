/**
 * 
 */
package com.logic;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.User;

/**
 * @author asrajarshi
 *
 */

// to store customer information
public class storeData {
	User e;
	
	public storeData(User e){
		this.e = e;
	}
	
	public boolean store(){
		try{
			Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			session.save(e);
			t.commit();
			session.close();
			return true;
		}catch(Exception e){
				e.printStackTrace();
			}
		return false;
	}
}
