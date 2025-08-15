package repository;

import entity.Team;

public class TeamRepository {
	
	//should return MI team details

	public static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		team.setShortName("MI");
		return team;
	}
	
	
	// add similar methods for remaining 9 teams
	
	public static Team getRCBTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Royal Challengers Bengaluru");
		team.setCaptainName("Virat Kohli");
		team.setCoachName("abc");
		team.setQualified(false);
		team.setnRR(4.3f);
		team.setShortName("RCB");
		return team;
	}
	
	public static Team getCSKTeamDetails() {
		Team team = new Team();
		team.setId(103);
		team.setTeamName("Chennai Superking");
		team.setCaptainName("M S Dhoni");
		team.setCoachName("sdf");
		team.setQualified(false);
		team.setnRR(5.2f);
		return team;

	}	
	
	public static Team getSRHTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Sunrisers Hyderabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("sdf");
		team.setQualified(false);
		team.setnRR(3.2f);
		return team;

	}	
	
	public static Team getTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Sunrisers Hyderabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("sdf");
		team.setQualified(false);
		team.setnRR(3.2f);
		return team;

	}	

}
	
	
	
	
	
	
	
	
		

