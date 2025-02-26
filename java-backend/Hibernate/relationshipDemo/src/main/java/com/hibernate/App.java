package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Laptop lap = new Laptop();
		lap.setLid(104);
		lap.setLname("Dell");
		
		Student stud = new Student();
		stud.setRollno(4);
		stud.setMarks(100);
		stud.setName("Ishu");
		stud.getLaptop().add(lap);
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.persist(lap); // To post into database
		session.persist(stud);
		
		tx.commit();
		
		
	}
}
