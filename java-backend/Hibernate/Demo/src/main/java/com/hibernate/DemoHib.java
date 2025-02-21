package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoHib {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Alien telusko = new Alien();
		telusko.setAid(1);
		telusko.setAname("Sanskar");
		telusko.setAcolor("Green");
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(telusko);
		
		tx.commit();
	}
	
}
