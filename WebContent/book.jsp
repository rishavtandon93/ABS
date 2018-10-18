<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="views/css/login.css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="views/js/login.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
 <script type="text/javascript" src="views/js/updatedvalidation.js"></script> 
<title>Book Page</title>
</head>
<body>
<ul>
   <img src="views/image/final.jpg" width=50px; height=50px;/> 
  <li style="float:right"><a href="register.jsp">Register</a></li><br/><br/>
  
</ul>
<div class="container">
<h1>Search Results</h1>
<form action="" id=bookvalid">
<div>
<table><tr><td>
Sort by Price:  <select name="Sort"><br/><br/>


<option value=1>Low to High</option>
<option value=2>High to Low</option>
</select>

Number of Seats: <input type="text" name="Number of Seats"/>
</td>
</table>
</div>
</table>
<center><input type="submit" value="Proceed to Pay"/></center><br/><br/><br/>
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