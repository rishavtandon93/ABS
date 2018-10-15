<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/font.css" rel="stylesheet"/>
	<link href="resources/css/style.css" rel='stylesheet' type='text/css' />
<title>Register Page</title>
</head>
<body>
<h1>Register </h1>
	
	
	<div class="w3ls-login box box--big"/>
	<form action="register" method="post">
Name:<input type="text" name="custName" placeholder="Enter Name"/><br/>
DOB:<input type="date" name="dob" placeholder="Enter DOB(DD/MM/YYYY)"/><br/>
Email:<input type="text" name="email" placeholder="Enter Email"/><br/>
Password:<input type="password" name="password" placeholder="Enter Password"/><br/>

<!-- SSN-Type:<input type="text" name="ssntype" placeholder="Enter SNN Type"/><br/>
SSN-No:<input type="text" name="ssnno" placeholder="Enter SNN Number"/><br/> -->

<input type="submit" value="Register"/>
<input type="submit" value="Clear" href="register.jsp"/>
</body>
</html>