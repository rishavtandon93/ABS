<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Iterator,java.util.List,java.util.ArrayList,com.mphasis.model.dto.FlightMaster" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment page</title>
</head>
<body><h1>Proceed to payment</h1>
<form action="bookfinal" method=post>
<%  FlightMaster fim = (FlightMaster)session.getAttribute("lfm"); %>
Flight No:<h1><%=fim.getFNo()%></h1>
Booking Date:<h1>${ pbi.bookingDate } </h1>
Total Seats:<h1>${ pbi.seatsBook } </h1>
Depart date:<h1>${ pbi.departDate } </h1>
Fare:<h1>${ pbi.price } </h1>
<input type="submit" value="Confirm">
</form>
<form action="popoye" method="get">
<input type="submit" value="Go Back">
</form>
</body>
</html>