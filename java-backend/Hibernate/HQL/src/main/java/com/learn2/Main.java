package com.learn2;

import java.util.Arrays;
import java.util.List;

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
		
//		Query<Student> q = session.createNativeQuery("Select * from Student where marks > 30", Student.class); --> SQl query to fetch all the columns
		
		Query <Object[]> q = session.createNativeQuery("Select name, marks from Student where marks > 30", Object[].class); // --> Sql query to fetch only specific columns
		List<Object[]> student = q.getResultList();
		
		for(Object[] s : student) {
			System.out.println("Name " + s[0] + ": Marks " + s[1]);
		}
		
		tx.commit();
	}
}

// Using Sql query in Hibernate