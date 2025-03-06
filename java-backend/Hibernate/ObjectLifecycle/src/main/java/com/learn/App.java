package com.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Laptop l = new Laptop(); // --> Transient State
		l.setId(1);
		l.setBrand("Dell");
		l.setPrice(2000);
		
		session.persist(l); // --> Persistent state
		// If i change the value of the object after this, it will be reflected inside database also
		l.setPrice(1000); // because the object is in persistent state right now
		
		tx.commit();
		
		session.evict(l); // --> Detached State
		l.setPrice(300);
	}
}

// Object Lifecycle in Hibernate has three main states:

// 1. Transient State - When a new object is created it is in transient state and it has no relation with database

// 2. Persistent State - When you once save the object it goes into persistent state means if you change the value inside object it will be changed inside database also, means the object values and database will be synced with each other

// 3. Detached State - If you have to unsync the database with the object then you have to close the session, so the object is no longer synced with database, means if you change the value of the object it will not be changed inside database the object will be in transient state
