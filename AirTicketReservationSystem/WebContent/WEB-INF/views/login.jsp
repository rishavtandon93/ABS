<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="resources/css/font.css" rel="stylesheet"/> 
	<link href="resources/css/style.css" rel='stylesheet' type='text/css' /> 
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
</html>