package com.learn;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		Student a = em.find(Student.class, 1);
		
		System.out.println(a);
	}
}

// JPA

//JPA (Java Persistence API) is a Java specification for object-relational mapping (ORM), allowing Java developers to interact with relational databases using Java objects instead of SQL queries.
