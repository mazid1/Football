<<<<<<< HEAD
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Registration Form</title>
  <link rel="stylesheet" href="css/registerFailure.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>

<body>
  <div class="container">
    <section class="register">
      <h1>Register</h1>
      <form method="post" action="signupServlet">
      <div class="reg_section personal_info">
      <h3>Your Personal Information</h3>
      <input type="text" name="username" value="" placeholder="Your Desired Username">
      <input type="text" name="email" value="" placeholder="Your E-mail Address">
      </div>
      <div class="reg_section password">
      <h3>Your Password</h3>
      <input type="password" name="password" value="" placeholder="Your Password">
      <input type="password" name="confirm" value="" placeholder="Confirm Password">
      </div>
      <div class="reg_section password">
      <h3>Select security question</h3>
      <select name="question">
        <option value="1">Name of your best friend</option>
        <option value="2">Your favorite food</option>
        <option value="3">Name of your birthplace</option>
        <option value="4">Your first pet</option>
        <option value="5">Your favorite aunt</option> 
      </select>
      
      <!-- <textarea name="textarea" id="">Your Full Address</textarea> --> 
      <input type="text" name="answer" value="" placeholder="Your answer">
      <input type="text" name="myteam" value="" placeholder="Your favorite team">
      
      </div>
      <p class="terms">
        <label>
        <%
        String error1 = (String)session.getAttribute("errorType");
        if(error1.equals("username")) {
        %>
        	Username already in use!
        <%} %>
        
        <%
        String error2 = (String)session.getAttribute("errorType");
        if(error2.equals("password")) {
        %>
        	Passwords do not match!
        <%} %>
        
        </label>
      </p>
      <p class="submit"><input type="submit" name="commit" value="Sign Up"></p>
      </form>
    </section>
  </div>
	
  <!--  
  <section class="about">
    Download it for free from <a href="http://www.imomen.com/">iMomen</a>
  </section>
  -->

</body>
=======
<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Registration Form</title>
  <link rel="stylesheet" href="css/registerFailure.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>

<body>
  <div class="container">
    <section class="register">
      <h1>Register</h1>
      <form method="post" action="registerFailure.jsp">
      <div class="reg_section personal_info">
      <h3>Your Personal Information</h3>
      <input type="text" name="username" value="" placeholder="Your Desired Username">
      <input type="text" name="email" value="" placeholder="Your E-mail Address">
      </div>
      <div class="reg_section password">
      <h3>Your Password</h3>
      <input type="password" name="password" value="" placeholder="Your Password">
      <input type="password" name="confirm" value="" placeholder="Confirm Password">
      </div>
      <div class="reg_section password">
      <h3>Select security question</h3>
      <select>
        <option value="">Name of your best friend</option>
        <option value="">Your favorite food</option>
        <option value="">Name of your birthplace</option>
        <option value="">Your first pet</option>
        <option value="">Your favorite aunt</option> 
      </select>
      
      <!-- <textarea name="textarea" id="">Your Full Address</textarea> --> 
      <input type="text" name="answer" value="" placeholder="Your answer">
      
      </div>
      <p class="terms">
        <label>
           Register failed!
        </label>
      </p>
      <p class="submit"><input type="submit" name="commit" value="Sign Up"></p>
      </form>
    </section>
  </div>
	
  <!--  
  <section class="about">
    Download it for free from <a href="http://www.imomen.com/">iMomen</a>
  </section>
  -->

</body>
>>>>>>> 5daaf1ccd19969ba7f853ca9f5a1e79903d86b30
</html>