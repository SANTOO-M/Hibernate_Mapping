package com.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Captain")
public class Captain implements Serializable{
	@Id
	@GenericGenerator(name = "ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int capId;
	private String captName;
	private int captAge;
	private String captPlace;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Team")
	private Team teamObj;
	
	
	public Team getTeamObj() {
		return teamObj;
	}

	public void setTeamObj(Team teamObj) {
		this.teamObj = teamObj;
	}

	public Captain() {
		// TODO Auto-generated constructor stub
	}
	
	public int getCapId() {
		return capId;
	}

	public void setCapId(int capId) {
		this.capId = capId;
	}

	public String getCaptName() {
		return captName;
	}

	public void setCaptName(String captName) {
		this.captName = captName;
	}

	public int getCaptAge() {
		return captAge;
	}

	public void setCaptAge(int captAge) {
		this.captAge = captAge;
	}

	public String getCaptPlace() {
		return captPlace;
	}

	public void setCaptPlace(String captPlace) {
		this.captPlace = captPlace;
	}

	
}
