<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="views/css/login.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
 <script type="text/javascript" src="views/js/updatedvalidation.js"></script> 
<title>Search Page</title>
</head>
<body >

<ul>
  <img src="views/image/final.jpg" width=50px; height=50px;/> 
  <li><a></a></li>
</ul>

  <!-- <div class="container"> -->
<div class="main">
<h1>Search</h1>
<form class="form" method="post" action="#" id="searchvalid">

<table><tr>
<td>
<div  align="left">From:<input type="text" name="from" placeholder="source"/></td>
<td><div  align="left">To:<input type="text" name="to" placeholder="destination"/></td>
</tr></table>
<table><tr>
<td>Date:<input type="date" name="date" placeholder="yyyy-mm-dd"/></td>

<div class="all"><td >Seats:<input type="number" name="seats" placeholder="no of seats"/></td></div>
</tr></table>

<div align="center">
<table><tr>
<td>
<input type="submit" value="search"  id="register" /></td></tr></table>

</div>




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

 <script src="views/js/updatedvalidation.js"></script>
</body>
</html>