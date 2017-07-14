<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<%@ page import="football.info.*" %>
<%@ page import="java.util.*" %>

<html>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
response.setDateHeader("Expires", 0); // Proxies.
%>

<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Most Clean Sheets</title>

<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="css/mostCleansheets.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
</head>

<body>

<div id="bg">

<div id="main">
<div id="main_bot">
<!-- header begins -->
<div id="header">
	<div id="logo">
        <img src="images/uefa.png" alt="Champions League" style="height: 100px" />
    </div>
    
    <%if(session.getAttribute("username")!=null) { %>
     
    <div id="uname">You're logged in as: <%=(String) session.getAttribute("username") %></div>
    
    <%} %>
    
    <%if(session.getAttribute("username")==null) { %>
    
    <div id="uname">You're not logged in</div>
    
    <%} %>
    
    
    <div id="buttons">
        <ul>
          <li><form action="index.jsp"><input type="submit" value="home"></form></li>
          
          <li><form action="leagueInfo.jsp"><input type="submit" value="league info"></form></li>
          <li><form action="uc.html"><input type="submit" value="my zone"></form></li>
          <li><form action="uc.html"><input type="submit" value="fantasy league"></form></li>
          <%if(session.getAttribute("username")==null) { %>
          <li>
          <form action="loginRedirect" method="post">
          <input type="submit" value="login/signup">
          </form>
          </li>
          <%} %>
          <%if(session.getAttribute("username")!=null) { %>
          <li>
          <form action="logoutRedirect" method="post">
          <input type="submit" value="logout">
          </form>
          </li>
          <%} %>
        </ul>
    </div>
</div>
<!-- header ends -->
<!-- scroll begins -->

<div class="header_bg">
<% ArrayList<Player> player = (ArrayList<Player>)session.getAttribute("data"); %>
<table style="width:100%">
  <caption><b>Top Ten Clean Sheets</b></caption>
  <tr>
  	<th>Name</th>
    <th>Clean Sheets</th>
    <th>Team Name</th>
    <th>Position</th>
    <th>Age</th> 
    <th>Nationality</th> 
  </tr>
  
  <% 
    Iterator<Player> iterator = player.iterator();
    int cnt = 0;
    while (iterator.hasNext() && cnt < 10) {    
    	 Player ts = (Player)iterator.next();%>
    	 <tr>
       	 <td><%out.println(ts.getName());%></td>
       	 <td><%out.println(ts.getCleansheets());%></td>
       	 <td><%out.println(ts.getTeamname());%></td>
       	 <td><%out.println(ts.getPosition());%></td>
       	 <td><%out.println(ts.getAge());%></td>
       	 <td><%out.println(ts.getNationality());%></td>
       	 </tr>
    <%   cnt++;
    }
   %>
  
</table>

<div class="clear"></div>
</div>
<div class="clear"></div>
<!-- header ends -->
    
<!-- footer begins -->
<div id="footer">
	© 1998-2015 UEFA. All rights reserved. <br />
</div>
<!-- footer ends -->

</div>
</div>
</div>
</body>

</html>
