<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Page</title>
</head>
<body>
<form action="payment" method="post">
<h1>Enter card number:</h1><input type="number" name="cardnumber">
<h1>Enter Name on card</h1><input type="text" name="cardname">
<h1>Enter CVV:</h1><input type="text" name="cvv">
<h1>Enter expiry date:</h1><input type="date" name="expdate">
<input type="submit" value="Pay">
</form>
</body>
</html>