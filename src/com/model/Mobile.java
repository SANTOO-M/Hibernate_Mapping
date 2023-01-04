package com.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Mobile_Table")
public class Mobile implements Serializable{
	
	@Id
	@GenericGenerator(name = "ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int mobileId;
	private String mobileCompany;
	private String mobileName;
	private double mobilePrice;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "app")
	private Collection<App> apto;
	
	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getMobileCompany() {
		return mobileCompany;
	}

	public void setMobileCompany(String mobileCompany) {
		this.mobileCompany = mobileCompany;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public double getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	public Mobile() {
		
	}

}
