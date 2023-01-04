package com.test;

import java.util.ArrayList;
import java.util.Collection;

import com.dao.MobileDAO;
import com.model.App;
import com.model.Mobile;

public class MobileTest {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		m.setMobileName("Realmi Note 8");
		m.setMobileCompany("RealMe");
		m.setMobilePrice(26000.50);
		
		App app1=new App();
		app1.setAppName("LinkIn");
		app1.setAppSize("4GB");
		app1.setAppRating(4.2);
	
		App app2=new App();
		app2.setAppName("WhatsApp");
		app2.setAppSize("1GB");
		app2.setAppRating(4.8);
		
		Collection<App> cl1=new ArrayList<App>();
		cl1.add(app1);
		cl1.add(app2);
	
		m.setApto(cl1);
		MobileDAO mobileDAO=new MobileDAO();
		mobileDAO.save(m);
	}
}
