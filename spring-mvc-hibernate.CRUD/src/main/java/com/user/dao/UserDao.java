package com.user.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.user.model.User;

public class UserDao {
	
	private Configuration con;
	private SessionFactory factory;
	private  Session session;
	private Transaction ts;
	

	public void saveData(User user1) {
		
		con= new Configuration().configure("hibernate.cfg.xml");
		factory=con.buildSessionFactory();
		session=factory.openSession();
		ts=session.beginTransaction();
		session.save(user1);
		ts.commit();
		
		
		
	}

	
}
