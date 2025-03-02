package com.learn;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		// To Post some values inside database
//		Random r = new Random();
		
//		for(int i=1;i<=50;i++) {
//			Student s = new Student();
//			s.setRollno(i);
//			s.setName("Name " + i);
//			s.setMarks(r.nextInt(100));
//			
//			session.persist(s);;
//		}
		
		// To fetch all the values from the database using HQL
//		Query<Student> q = session.createQuery("from Student",Student.class); --> HQL Query to fetch all the students
//		Query<Student> q = session.createQuery("from Student where marks > 50",Student.class); --> HQL Query to fetch students with marks > 50
		Query<Student> q = session.createQuery("from Student where rollno = 3",Student.class); //--> HQL Query to fetch single student with rollno = 3
		
//		List<Student> student = q.list();
		
//		for(Student s : student) {
//			System.out.println(s);
//		}
		
		Student student = q.uniqueResult(); // TO get single result
		System.out.println(student);
		
		tx.commit();
	}
}

// HQL (Hibernate Query Language) is an object-oriented query language used in Hibernate, a Java-based ORM (Object-Relational Mapping) framework. It is similar to SQL but operates on Hibernate entities (Java objects) instead of directly on database tables.
