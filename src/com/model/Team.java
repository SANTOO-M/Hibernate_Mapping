package com.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Team")
public class Team implements Serializable {
	
	@Id
	@GenericGenerator(name = "ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int teamId;
	private String teamLogo;
	private int teamSize;
	private String teamType;
	
	public int getTeamId() {
		return teamId;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Captain capObj;
	
	
	public Captain getCapObj() {
		return capObj;
	}
	public void setCapObj(Captain capObj) {
		this.capObj = capObj;
	}
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamLogo() {
		return teamLogo;
	}

	public void setTeamLogo(String teamLogo) {
		this.teamLogo = teamLogo;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getTeamType() {
		return teamType;
	}

	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}

	
}
