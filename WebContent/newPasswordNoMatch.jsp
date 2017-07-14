<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>New password</title>
  <link rel="stylesheet" href="css/newPasswordNoMatch.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>

<body>
  <div class="container">
    <section class="register">
      <h1>Setting new password</h1>
      <form method="post" action="newPasswordNoMatch.jsp">
      <div class="reg_section personal_info">
      <h3>Enter new password</h3>
      <input type="password" name="password" value="" placeholder="Your Password">
      <input type="password" name="confirm" value="" placeholder="Confirm Password">
      </div>
      
      <p class="terms">
        <label>
           Password did not match!
        </label>
      </p>
      
      <p class="submit"><input type="submit" name="commit" value="Submit"></p>
      </form>
    </section>
  </div>
	
  <!--  
  <section class="about">
    Download it for free from <a href="http://www.imomen.com/">iMomen</a>
  </section>
  -->

</body>
</html>