package com.learn;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("Sanskar");
		s.setMarks(20);
		s.setRollno(60);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
//		Student a = em.find(Student.class, 1); // get the value from the database
		
		
		// To save the value inside database we have to start the transaction and then commit it
		em.getTransaction().begin();
		
		em.persist(s); // Save the value to the database
		
		em.getTransaction().commit();
		
		System.out.println(s);
	}
}

// JPA

//JPA (Java Persistence API) is a Java specification for object-relational mapping (ORM), allowing Java developers to interact with relational databases using Java objects instead of SQL queries.
