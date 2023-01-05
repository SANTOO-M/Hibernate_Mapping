package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class TestCaching {

	public static void main(String[] args) {
		try{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
	//	Transaction tx=session.beginTransaction();
		Student s1=session.get(Student.class, 1);
		System.out.println(s1);
	//	tx.commit();
		
		Session session2=factory.openSession();
		Student s2=session2.get(Student.class, 1);
		System.out.println(s2);
		session.close();
		session2.close();
		
		session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
