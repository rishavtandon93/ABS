<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Iterator,java.util.List,java.util.ArrayList,com.mphasis.model.dto.FlightMaster" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Mine page</title>
</head>
<body>
<%  List<FlightMaster> fms = (ArrayList)session.getAttribute("fm"); %>
<%Iterator <FlightMaster> iter = fms.iterator();
while(iter.hasNext()){
  FlightMaster fim =iter.next();
%>
<table style="border: 1px solid;">
<tr>
<td style="border: 1px solid;"><h3><%=fim.getFNo()%></h3></td>
<td style="border: 1px solid;"><h3><%=fim.getAirlineMaster().getAName().toUpperCase()%></h3></td>
<td style="border: 1px solid;"><h3><%=fim.getLocationMaster1().getLocationName()%></h3></td>
<td style="border: 1px solid;"><h3><%=fim.getLocationMaster2().getLocationName()%></h3></td>
<td style="border: 1px solid;"><h3><%=fim.getAvaSeats()%></h3></td>
<td style="border: 1px solid;"><h3><%=fim.getDepartTime()%></h3></td>
<td style="border: 1px solid;"><h3><%=fim.getDepartDate()%></h3></td>
<td style="border: 1px solid;"><h3><%=fim.getFare()%></h3></td>
</tr>
</table>
<%} %>
</body>
</html>