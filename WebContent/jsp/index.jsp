<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<link href="css/font.css" rel="stylesheet"/>
	<link href="css/style.css" rel='stylesheet' type='text/css' />
<title>Welcome Page</title>
<style type="text/css">
    ul{
        padding: 0;
        list-style: none;
        background: #f2f2f2;
    }
    ul li{
        display: inline-block;
        position: relative;
        line-height: 21px;
        text-align: left;
    }
    ul li a{
        display: block;
        padding: 8px 25px;
        color: #333;
        text-decoration: none;
    }
    ul li a:hover{
        color: #fff;
        background: #939393;
    }
    ul li ul.dropdown{
        min-width: 100%; /* Set width of the dropdown */
        background: #f2f2f2;
        display: none;
        position: absolute;
        z-index: 999;
        left: 0;
    }
    ul li:hover ul.dropdown{
        display: block;	/* Display the dropdown */
    }
    ul li ul.dropdown li{
        display: block;
    }
</style>
</head>
<body>
    <ul>
        
        
        <li>
            <a href="#">From &#9662;</a>
            <ul class="dropdown" >
                <li><a href>Hyderabad</li>
                <li><a href="#">Banglore</a></li>
                <li><a href="#">Pune</a></li>
            </ul>
        </li>
        <li>
          
            <select name="To">
                <option value="1">Hyderabad</option>
               <option value="2">banglore</option>
                <option value="3">pune</option>
                </select>
            </ul>
        </li>
        <li><a href="#">Seats</a></li>
        <li><a href="#">About</a></li>
    </ul>
    <script>
function myFunction() {
  document.getElementById("demo").innerHTML = "Hello World";
}
</script>
    </body>
    </html>                           