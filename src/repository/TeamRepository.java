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
		return team;
	}
	
	
	// add similar methods for remaining 9 teams
	
}
