package com.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "App_Table")
public class App implements Serializable{

	@Id
	@GenericGenerator(name = "ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int appId;
	private String appName;
	private double appRating;
	private String appSize;
	
	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public double getAppRating() {
		return appRating;
	}

	public void setAppRating(double appRating) {
		this.appRating = appRating;
	}

	public String getAppSize() {
		return appSize;
	}

	public void setAppSize(String appSize) {
		this.appSize = appSize;
	}

	public App() {
	}

}
