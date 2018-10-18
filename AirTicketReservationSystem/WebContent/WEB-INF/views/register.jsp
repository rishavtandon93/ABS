<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!--

<!DOCTYPE >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/css/login.css" rel="stylesheet"/>
	<link href="resources/css/login.css" rel='stylesheet' type='text/css' />
	<script src="resources/js/updatedvalidation.js" ></script>
<title>Register Page</title>
</head>
<body>
<h1>Register </h1>
	
	
	<div class="w3ls-login box box--big"/>
	<form action="register" name="registration" onSubmit="return formValidation();" method="post">
	
Name:<input type="text" name="custName" placeholder="Enter Name"/><br/>
DOB:<input type="date" name="dob" placeholder="Enter DOB(DD/MM/YYYY)"/><br/>
Email:<input type="email" name="email" placeholder="Enter Email" required/><br/>
Password:<input type="password" name="password" placeholder="Enter Password"/><br/>

 SSN-Type:<input type="text" name="ssntype" placeholder="Enter SNN Type"/><br/>
SSN-No:<input type="text" name="ssnno" placeholder="Enter SNN Number"/><br/> 

<input type="submit" value="Register"/>
<input type="submit" value="Clear" href="register.jsp"/>
</body>
</html> -->


<!DOCTYPE html>
<html>
<head>
<title>Registration Form </title>
<meta name="robots" content="noindex, nofollow">
<!-- Include CSS File Here -->
<link rel="stylesheet" href="resources/css/login.css"/>
<link href="resources/css/login.css" rel='stylesheet' type='text/css' /> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Include JS File Here -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/updatedvalidation.js"></script>
</head>
<body  bgcolor="#E6E6FA">
<ul>
  <img src="resources/image/final.jpg" width=50px; height=50px;/> 
<li><a></a></li>
</ul>
<div class="container">
<div class="main">
<form class="form" method="post" action="#" id="registervalid">
<h2>Registration Form</h2>
<label>Name :</label>
<input type="text" name="custName" id="name"><br/><br/>
<label>DOB :</label>
<input type="date" name="dob" id="dob"><br/><br/>
<label>Email :</label>
<input type="email" name="email" id="email"><br/><br/>
<label>Password :</label>
<input type="password" name="password" id="password"><br/><br/>
<input type="submit" name="register" id="register" value="Register" ><br/><br/>
<input type="submit" name="clear" id="register" value="Clear" href="register.jsp">


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
</div><br/>
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