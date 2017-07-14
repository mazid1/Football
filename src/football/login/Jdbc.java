package football.login;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import football.info.Match;
import football.info.Player;
import football.info.TeamStanding;
public class Jdbc {
	private Connection connect=null;
	private Statement statement=null;
	private ResultSet result=null;
	private String DB_URL="jdbc:mysql://localhost/football";
	private String user="root";
	private String password="";
	private String driver="com.mysql.jdbc.Driver";
	private String sql=null;

	public Jdbc()
	{
		try{
		Class.forName(driver);
		System.out.println("Connecting to database...");
		connect=DriverManager.getConnection(DB_URL, user, password);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void newUsersRow(String username,String passwd,String email,int security_q_id,String security_q_ans,String my_team)
	{
		try{
		sql="INSERT INTO users (username,passwd,email,security_q_id,security_q_ans,my_team) VALUES ('"+username+"','"+passwd+"','"+email+"','"+security_q_id+"','"+security_q_ans+"','"+my_team+"')";
		statement=connect.createStatement();
		statement.executeUpdate(sql);
		}catch(Exception e){
		System.out.println(e);
		}
	}
	
	public void setValue(String table,String p_key,String p_key_val,String attribute,String value)
	{
		try{
		sql="UPDATE "+table+" SET "+attribute+" = \'"+value+"\' where "+p_key+" = \'"+p_key_val+"\' ";
		statement=connect.createStatement();
		statement.executeUpdate(sql);
		}catch(Exception e){
		System.out.println(e);
		}
	}
	
	public ArrayList<TeamStanding> fetchStanding()
	{
		ArrayList<TeamStanding> data = new ArrayList<TeamStanding>();
		try{
		sql="select *  from football.teams order by (points) desc";
		statement=connect.createStatement();
		result=statement.executeQuery(sql);
		while(result.next())
		{
			TeamStanding temp = new TeamStanding();
			temp.setTeamname(result.getString("Teamname"));
			temp.setEstablished_year(Integer.parseInt(result.getString("established_year")));
			temp.setHomeground(result.getString("homeground"));
			temp.setLeague(result.getString("league"));
			temp.setWins(Integer.parseInt(result.getString("wins")));
			temp.setLosses(Integer.parseInt(result.getString("losses")));
			temp.setDraws(Integer.parseInt(result.getString("draws")));
			temp.setPoints(Integer.parseInt(result.getString("points")));
			temp.setGf(Integer.parseInt(result.getString("gf")));
			temp.setGa(Integer.parseInt(result.getString("ga")));
			data.add(temp);
		}
		}catch(Exception e){
		System.out.println(e);
		}finally{
			return data;
		}
	}
	
	public ArrayList<Player> fetchScorer()
	{
		ArrayList<Player> data = new ArrayList<Player>();
		try{
		sql="select Name,Teamname,Age,Nationality,Position,Goals from football.players order by (Goals) desc";
		statement=connect.createStatement();
		result=statement.executeQuery(sql);
		while(result.next())
		{
			Player temp = new Player();
			temp.setAge(Integer.parseInt(result.getString("Age")));
			temp.setGoals(Integer.parseInt(result.getString("Goals")));
			temp.setName(result.getString("Name"));
			temp.setNationality(result.getString("Nationality"));
			temp.setPosition(result.getString("Position"));
			temp.setTeamname(result.getString("Teamname"));
			data.add(temp);
		}
		}catch(Exception e){
		System.out.println(e);
		}finally{
			return data;
		}
	}
	
	public ArrayList<Player> fetchAssists()
	{
		ArrayList<Player> data = new ArrayList<Player>();
		try{
		sql="select Name,Teamname,Age,Nationality,Position,Assists from football.players order by (Assists) desc";
		statement=connect.createStatement();
		result=statement.executeQuery(sql);
		while(result.next())
		{
			Player temp = new Player();
			temp.setAge(Integer.parseInt(result.getString("Age")));
			temp.setAssists(Integer.parseInt(result.getString("Assists")));
			temp.setName(result.getString("Name"));
			temp.setNationality(result.getString("Nationality"));
			temp.setPosition(result.getString("Position"));
			temp.setTeamname(result.getString("Teamname"));
			data.add(temp);
		}
		}catch(Exception e){
		System.out.println(e);
		}finally{
			return data;
		}
	}
	
	public ArrayList<Player> fetchSaves()
	{
		ArrayList<Player> data = new ArrayList<Player>();
		try{
		sql="select Name,Teamname,Age,Nationality,Position,Saves from football.players where (Position = 'GK') order by (Saves) desc";
		statement=connect.createStatement();
		result=statement.executeQuery(sql);
		while(result.next())
		{
			Player temp = new Player();
			temp.setAge(Integer.parseInt(result.getString("Age")));
			temp.setSaves(Integer.parseInt(result.getString("Saves")));
			temp.setName(result.getString("Name"));
			temp.setNationality(result.getString("Nationality"));
			temp.setPosition(result.getString("Position"));
			temp.setTeamname(result.getString("Teamname"));
			data.add(temp);
		}
		}catch(Exception e){
		System.out.println(e);
		}finally{
			return data;
		}
	}
	
	public ArrayList<Player> fetchCS()
	{
		ArrayList<Player> data = new ArrayList<Player>();
		try{
		sql="select Name,Teamname,Age,Nationality,Position,Cleansheets from football.players where ( Position = 'DF' or Position = 'GK') order by (Cleansheets) desc";
		statement=connect.createStatement();
		result=statement.executeQuery(sql);
		while(result.next())
		{
			Player temp = new Player();
			temp.setAge(Integer.parseInt(result.getString("Age")));
			temp.setCleansheets(Integer.parseInt(result.getString("Cleansheets")));
			temp.setName(result.getString("Name"));
			temp.setNationality(result.getString("Nationality"));
			temp.setPosition(result.getString("Position"));
			temp.setTeamname(result.getString("Teamname"));
			data.add(temp);
		}
		}catch(Exception e){
		System.out.println(e);
		}finally{
			return data;
		}
	}
	
	public ArrayList<Match> fetchSchedule()
	{
		ArrayList<Match> data = new ArrayList<Match>();
		try{
		sql="Select Match_date, Match_time, Home_team, Away_team, Ground from football.schedule";
		statement=connect.createStatement();
		result=statement.executeQuery(sql);
		while(result.next())
		{
			Match temp = new Match();
			temp.setAwayteam(result.getString("Away_team"));
			temp.setHometeam(result.getString("Home_team"));
			temp.setGround(result.getString("Ground"));
			temp.setTime(result.getString("Match_time"));
			temp.setDate(result.getString("Match_date"));
			data.add(temp);
		}
		}catch(Exception e){
		System.out.println(e);
		}finally{
			return data;
		}
	}
	
	public void close() {
	    try {
	      if (result != null) {
	        result.close();
	      }

	      if (statement != null) {
	        statement.close();
	      }

	      if (connect != null) {
	        connect.close();
	      }
	    } catch (Exception e) {

	    }
	  }
	
}
