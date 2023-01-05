package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class AddStudent {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Student s1=new Student();
		s1.setStudentName("John");
		s1.setAge(21);
		s1.setGender("Male");
		session.save(s1);
		tx.commit();
		System.out.println("Record inserted...");
		session.close();
	}

}
