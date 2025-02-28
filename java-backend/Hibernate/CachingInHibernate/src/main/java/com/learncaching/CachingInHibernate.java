package com.learncaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CachingInHibernate {
	public static void main(String[] args) {
		
		Alien a = new Alien();
//		a.setAid(103);
//		a.setAname("Sanskar2");
//		a.setAcolor("Green");
		
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
		
		SessionFactory sf = config.buildSessionFactory();
		
		Session session1 = sf.openSession();
		
		Transaction tx = session1.beginTransaction();
		
		a = (Alien) session1.get(Alien.class, 101); // by default hibernate provides first level cache
		
		System.out.println(a);
		
		tx.commit();
		
		Session session2 = sf.openSession();
		
		Transaction tx2 = session2.beginTransaction();
		
		a = (Alien) session2.get(Alien.class, 101); // by default hibernate provides first level cache
		
		System.out.println(a);
		
		tx2.commit();
		
	}
}

//First-Level Cache
//
//Enabled by default.
//Works at the Session level.
//Objects are cached within a single session.
//Cleared when the session is closed.

//Second-Level Cache
//
//Disabled by default; needs to be configured.
//Works at the SessionFactory level.
//Shared across multiple sessions.
//Requires third-party providers like Ehcache, Infinispan.

// Configuration for Second level cache
// 1. Add ehcache and hibernate-ehcache dependencies inside pom.xml
// 2. Add properties inside hibernate.cfg.xml
// 3. Make Entity Cacheable and Cache
