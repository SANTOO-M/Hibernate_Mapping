package com.test;

import com.dao.TeamDAO;
import com.model.Captain;
import com.model.Team;

public class TeamMain {

	public static void main(String[] args) {
		Team teamObj=new Team();
		teamObj.setTeamLogo("Chakra");
		teamObj.setTeamSize(11);
		teamObj.setTeamType("Cricket");
		
		Captain capObj=new Captain();
		capObj.setCaptName("Pandya");
		capObj.setCaptAge(28);
		capObj.setCaptPlace("Mumbai");
		
		teamObj.setCapObj(capObj);
		capObj.setTeamObj(teamObj);
		
		TeamDAO teamdao=new TeamDAO();
		teamdao.save(teamObj);
	}

}
