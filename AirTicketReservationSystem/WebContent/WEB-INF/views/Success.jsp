<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="java.util.Iterator,java.util.List,java.util.ArrayList,com.mphasis.model.dto.FlightMaster,com.mphasis.model.dto.Customer" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CONGRATULATIONS</title>
</head>
<body>
<%  FlightMaster fim = (FlightMaster)session.getAttribute("lfm"); %>
Flight No:<h1><%=fim.getFNo()%></h1>
Airline :<h1><%=fim.getAirlineMaster().getAName()%></h1>
Booking Id:<h1>${ pb.bookingId }</h1>
Booking Date:<h1>${ pb.bookingDate } </h1>
Total Seats:<h1>${ pb.seatsBook } </h1>
Depart date:<h1>${ pb.departDate } </h1>
Fare:<h1>${ pb.price } </h1>

</body>
</html>