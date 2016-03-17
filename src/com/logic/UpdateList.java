package com.logic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.User;

public class UpdateList {
	Session session;
	User u;
	public UpdateList(){
	}
	
	public boolean update(String name,String product){
		session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		String strQuery = "from User where name =:username";
		Query query = session.createQuery(strQuery);
		query.setParameter("username", name);
		List<User> list = query.list();
		if(list == null  || list.size()==0)
			return false;
		
		u= list.get(0);
		List<String> productList = u.getBought();
		/*write lik this
		 * List<String> list2=q.getAnswers();
		Iterator<String> itr2=list2.iterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}*/
		if(productList == null || productList.size()==0)
			productList = new ArrayList<>();
		productList.add(product);
		u.setBought(productList);
		System.out.println(productList.toString());
		session.update(u);
		t.commit();
		session.close();
		return true;
	}

	/*private void update(User u) {
		// TODO Auto-generated method stub
		String strQuery = "from User set bought =:bought where name =:username";
		Query query = session.createQuery(strQuery);
		
		query.setParameter("username", u.getName());
		query.setParameter("bought", u.getBought());
		Transaction t = session.beginTransaction();
		t.commit();
	}*/
}
