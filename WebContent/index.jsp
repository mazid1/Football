<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html>

<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
response.setDateHeader("Expires", 0); // Proxies.
%>

<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Champions League</title>

<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="css/styles.css" rel="stylesheet" type="text/css" />
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

<div class="header_slider"> 
                           <div id="slider-wrapper">        
					             <div id="slider" class="nivoSlider">
									<img src="css/images/messi.jpg" alt="" title="" />
									<img src="css/images/ronaldo.jpg" alt="" title="" />
									<img src="css/images/neymar.jpg" alt="" title="" />							
								</div>        
				            </div>
								
<script type="text/javascript" src="lib/jquery-1.4.3.min.js"></script>
    <script type="text/javascript" src="lib/jquery.nivo.slider.pack.js"></script>
    <script type="text/javascript">
    $(window).load(function() {
        $('#slider').nivoSlider();
    });
    </script>
</div>	
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
