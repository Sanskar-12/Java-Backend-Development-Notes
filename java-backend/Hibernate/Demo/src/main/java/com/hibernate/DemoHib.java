package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoHib {
	public static void main(String[] args) {
		AlienName an = new AlienName();
		an.setFname("firstname");
		an.setLname("lastname");
		an.setMname("middlename");
		
		Alien telusko = new Alien();
		telusko.setAid(5);
		telusko.setAname(an);
		telusko.setAcolor("red");
		telusko.setAemail("ishu@gmail.com");
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//telusko = (Alien) session.get(Alien.class, 1); // To get the value from database using aid
		
		session.persist(telusko); // To post into database
		
		tx.commit();
		
		System.out.println(telusko);
	}
	
}
