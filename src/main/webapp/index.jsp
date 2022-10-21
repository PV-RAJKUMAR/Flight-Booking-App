<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body bgcolor="Azure">
<div align="center">
           <a><b>Welcome to Flight Booking app</b></a>
           <br>
           <br>
           <form action="getUser" method="post">

           User-Name:<input type="text" name="userName"/>
           <br>
           Password:<input type="password" name="password"/>
           <br>
           <button onclick='window.location="/FlightBookingApp/getUser?userName="+document.getElementBy-name("userName").value'>Search</button>
<a href="register">register</a>
<br>
<a href="officer">Officer login</a>
</body>
</html>