<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="views/css/font.css" rel="stylesheet"/>
	<link href="views/css/style.css" rel='stylesheet' type='text/css' />
	<script src="views/js/validation.js"></script>
<title>Register Page</title>
</head>
<body>
<h1>Register </h1>
	
	
	<div class="w3ls-login box box--big"/>
	<form action="register" name="registration" onSubmit="return formValidation();" method="post">
Name:<input type="text" name="custName" /><br/>
DOB:<input type="text" name="dob" /><br/>
Email:<input type="email" name="email" /><br/>
Password:<input type="password" name="password" /><br/>

<!-- SSN-Type:<input type="text" name="ssntype" placeholder="Enter SNN Type"/><br/>
SSN-No:<input type="text" name="ssnno" placeholder="Enter SNN Number"/><br/> -->

<input type="submit"/>
<input type="submit" value="Clear" href="register.jsp"/>
</body>
</html>