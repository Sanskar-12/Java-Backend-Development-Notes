package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoHib {
	public static void main(String[] args) {
		Alien telusko = new Alien();
		telusko.setAid(3);
		telusko.setAname("Anjali");
		telusko.setAcolor("red");
		telusko.setAemail("anjali@gmail.com");
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.persist(telusko);
		
		tx.commit();
	}
	
}
