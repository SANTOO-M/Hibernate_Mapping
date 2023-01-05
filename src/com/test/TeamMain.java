package com.test;

import com.dao.TeamDAO;
import com.model.Captain;
import com.model.Team;

public class TeamMain { 

	public static void main(String[] args) {
		Team teamObj=new Team();
		teamObj.setTeamLogo("Eagle");
		teamObj.setTeamSize(7);
		teamObj.setTeamType("Action");
		
		Captain capObj=new Captain();
		capObj.setCaptName("Dhoni");
		capObj.setCaptAge(40);
		capObj.setCaptPlace("Jarkant");
		
		teamObj.setCapObj(capObj);
		capObj.setTeamObj(teamObj);
		
		TeamDAO teamdao=new TeamDAO();
		teamdao.saveDAO(teamObj);
	}

}
