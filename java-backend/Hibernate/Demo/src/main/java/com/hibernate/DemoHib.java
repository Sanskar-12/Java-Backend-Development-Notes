package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoHib {
	public static void main(String[] args) {
		Alien telusko = new Alien();
//		telusko.setAid(4);
//		telusko.setAname("Ishu");
//		telusko.setAcolor("red");
//		telusko.setAemail("ishu@gmail.com");
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		telusko = (Alien) session.get(Alien.class, 1); // To get the value from database using aid
		
//		session.persist(telusko); // To post into database
		
		tx.commit();
		
		System.out.println(telusko);
	}
	
}
