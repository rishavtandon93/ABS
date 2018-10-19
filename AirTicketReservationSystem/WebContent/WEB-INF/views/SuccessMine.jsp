<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Iterator,java.util.List,java.util.ArrayList,com.mphasis.model.dto.FlightMaster" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/login.css"/>
<link href="resources/css/login.css" rel='stylesheet' type='text/css' /> 

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="resources/js/login.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
 <script type="text/javascript" src="resources/js/updatedvalidation.js"></script> 
<title>Book Page</title>
</head>
<body>
<ul>
   <img src="resources/image/final.jpg" width=50px; height=50px;/> 
  
  
</ul>
<div class="container">

<h1>Search Results</h1>
<!-- <form action="" id="searchvalid"> -->
<div>

Sort by Price: 
<table><tr><td>
<form action="ascend" method="post">
<input type="submit" value="Low to High" id="register"/></td>
</form>
<form action="descend" method="post">
<td><input type="submit" value="High to Low" id="register"/></td>
</form>
</tr>
</table>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<br/><br/>
<table><tr><td>
</td>
</tr>
</table>
</div>
</table>
<div class="footers" >
<table><tr>
<td>

<%  List<FlightMaster> fms = (ArrayList<FlightMaster>)session.getAttribute("fm"); %>
<%Iterator <FlightMaster> iter = fms.iterator();
while(iter.hasNext()){
  FlightMaster fim =iter.next();
%>
<form action="book" method="post" id="searchvalid">
<table style="border: 1px solid;">
<tr>
<td><input type="radio" name="myradio" value=<%=fim.getFNo()%>></td>
<td style="border: 1px solid;"><h6><%=fim.getFNo()%></h6></td>
<td style="border: 1px solid;"><h6><%=fim.getAirlineMaster().getAName().toUpperCase()%></h6></td>
<td style="border: 1px solid;"><h6><%=fim.getLocationMaster1().getLocationName()%></h6></td>
<td style="border: 1px solid;"><h6><%=fim.getLocationMaster2().getLocationName()%></h6></td>
<td style="border: 1px solid;"><h6><%=fim.getAvaSeats()%></h6></td>
<td style="border: 1px solid;"><h6><%=fim.getDepartTime()%></h6></td>
<td style="border: 1px solid;"><h6><%=fim.getDepartDate()%></h6></td>
<td style="border: 1px solid;"><h6><%=fim.getFare()%></h6></td>
</tr>
</table>
<%} %>
Number of Seats: <input type="number" name="seats"/>
<input type="submit" value="Book" id="register"/>
</form>
&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<br/><br/>

</td></tr></table>
</div>
</div>
</div>
<div class="footers1" >

<table>
<tr>
<td><a href="#"><i class="fa fa-facebook"></i></a></td>
<td><a href="#" class="fa fa-twitter"></a></td>
<td><a href="#" class="fa fa-instagram"></a></td>
</tr>
</table>
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