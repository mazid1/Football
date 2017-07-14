package football.info;

public class TeamStanding {
	String Teamname;
	int established_year;
	String homeground;
	String league;
	int wins;
	int losses;
	int draws;
	int points;
	int gf;
	int ga;
	
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public String getTeamname() {
		return Teamname;
	}
	public void setTeamname(String teamname) {
		Teamname = teamname;
	}
	public int getEstablished_year() {
		return established_year;
	}
	public void setEstablished_year(int established_year) {
		this.established_year = established_year;
	}
	public String getHomeground() {
		return homeground;
	}
	public void setHomeground(String homeground) {
		this.homeground = homeground;
	}
	public String getLeague() {
		return league;
	}
	public void setLeague(String league) {
		this.league = league;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getGf() {
		return gf;
	}
	public void setGf(int gf) {
		this.gf = gf;
	}
	public int getGa() {
		return ga;
	}
	public void setGa(int ga) {
		this.ga = ga;
	}
}
