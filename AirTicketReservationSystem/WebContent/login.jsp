

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="resources/css/login.css" rel="stylesheet"/> 
	<link href="resources/css/login.css" rel='stylesheet' type='text/css' /> 
<title>Login Page</title>
</head>
<body>
<h1>Login </h1>
	<div class="clear-loading spinner">
		<span></span>
	</div>
	<div class="w3ls-login box box--big"/>
<form action="loginn" method="get">
Email:<input type="text" name="email" placeholder="Enter Email"/><br/>
Password:<input type="password" name="password" placeholder="Enter Password"/><br/>

<input type="submit" value="Login"/>

</form>
<div class="w3ls-login box box--big" />
<form action="register" method="post">
<a href="register"><input type="submit" value="New User Register here"></a>
</form>

</body>
</html>  -->



<!DOCTYPE html>
<html>
<head>
<title>LoginPage</title>
<meta name="robots" content="noindex, nofollow">
<!-- Include CSS File Here -->
<link rel="stylesheet" href="resources/css/login.css"/>
<link href="resources/css/login.css" rel='stylesheet' type='text/css' /> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Include CSS File Here -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
 <script type="text/javascript" src="resources/js/updatedvalidation.js"></script> 
</head>
<body bgcolor="#E6E6FA">

<ul>
   <img src="resources/image/final.jpg" width=50px; height=50px;/> 
   
  <li style="float:right">
  <form action="redirectToRegister" method="post">
 <input type="submit" value="Register"></li><br/><br/>
  </form>
</ul>
<div class="container">
<div class="main">
<form class="form" method="post" action="loginn" id="loginvalid">
<h2>Fly High</h2>
<label>Email :</label>
<input type="text" name="email" id="email"><br/><br/>
<label>Password :</label>
<input type="password" name="password" id="password"><br/><br/>
<input type="submit" name="login" id="login" value="Login">



<div class="footer" >

<table>
<tr>
<td><a href="#"><i class="fa fa-facebook"></i></a></td>
<td><a href="#" class="fa fa-twitter"></a></td>
<td><a href="#" class="fa fa-instagram"></a></td>
</tr>
</table>
</div>


</form>
</div>

</div>
<ul><li style="margin-left:400px" ><a>
&copy;ABS.com
</a></li>
</ul>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
<script src="https://ajax.aspnetcdn.com/ajax/jquery.validate/1.17.0/jquery.validate.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.0/additional-methods.min.js"></script>

 <script src="resources/js/updatedvalidation.js"></script>


</body>
</html>



