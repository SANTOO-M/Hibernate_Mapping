package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Team;

public class TeamDAO {

	public void saveDAO(Team teamObj) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Team.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(teamObj);
		tx.commit();
		session.close();
	}
}
