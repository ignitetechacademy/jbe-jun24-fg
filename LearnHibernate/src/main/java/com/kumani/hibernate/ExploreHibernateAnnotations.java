package com.kumani.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

https://www.javatpoint.com/hibernate-with-annotation
https://www.geeksforgeeks.org/hibernate-annotations/	
public class ExploreHibernateAnnotations {

	public static void main(String[] args) {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		Account acc = new Account();
		acc.setAccHolderName("Jaganmohna");
		acc.setAccHolderNumber(((int) (Math.random() * 100000)));
		acc.setAccBalance(10500);

		// save this class
		session.save(acc);
		t.commit();
		System.out.println("successfully saved");
		factory.close();
		session.close();
	}
}
