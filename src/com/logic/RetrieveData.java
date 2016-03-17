package com.logic;

import java.util.Iterator;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.User;

public class RetrieveData {
	Session session;
	public RetrieveData(){
		session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
	}
		public boolean retrieve(String name,String password){
			Transaction t=session.beginTransaction();
			System.out.println(name + " "+password );
			String strQuery = "from User where name =:username AND pword =:password";
			Query query = session.createQuery(strQuery);
			query.setParameter("username", name);
			query.setParameter("password", password);
			List<User> list = query.list();
			session.close();
			if(list == null || list.size()==0)
				return false;
			else 
				return true;
		}
}
