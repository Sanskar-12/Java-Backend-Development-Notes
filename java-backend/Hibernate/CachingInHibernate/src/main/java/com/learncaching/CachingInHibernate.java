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
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		a = (Alien) session.get(Alien.class, 101); // by default hibernate provides first level cache
		
		System.out.println(a);
		
		tx.commit();
		
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
