package com.test;

import java.util.ArrayList;
import java.util.Collection;

import com.dao.MobileDAO;
import com.model.App;
import com.model.Mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.setMobileName("Samsung Galaxy");
		m1.setMobileCompany("Samsung");
		m1.setMobilePrice(28800.50);
		
		Mobile m2=new Mobile();
		m2.setMobileName("Micromax IN 1b");
		m2.setMobileCompany("Micromax");
		m2.setMobilePrice(12000.50);
		
		App app1=new App();
		app1.setAppName("Twitter");
		app1.setAppSize("100mb");
		app1.setAppRating(4.3);
	
		App app2=new App();
		app2.setAppName("Naukri");
		app2.setAppSize("512mb");
		app2.setAppRating(4.4);
		
		Collection<App> cl1=new ArrayList<App>();
		cl1.add(app1);
		cl1.add(app2);
	
		m1.setApto(cl1);
		m2.setApto(cl1);
		MobileDAO mobileDAO=new MobileDAO();
		mobileDAO.saveDAO(m1);
		mobileDAO.saveDAO(m2);
	}
}
