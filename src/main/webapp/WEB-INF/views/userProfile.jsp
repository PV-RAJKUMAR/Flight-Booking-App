<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>USER DETAILS</title>
</head>
<body bgcolor="lightgray">
<div align="center">
	<h3>Profile</h3>

        <form:form method="POST" action="getUser" modelAttribute="user">
        <table border="1" cell-padding="5">
        <tr>
            <td>Id:</td>
            <td>${user.id}</td>
         </tr>
         <tr>
            <td>First Name:</td>
            <td>${user.firstName}</td>
          </tr>
          <tr>
            <td>Last Name</td>
            <td>${user.lastName}</td>
          </tr>
          <tr>
             <td>Age:</td>
             <td>${user.age}</td>
          </tr>
          <tr>
             <td>E-mail</td>
             <td>${user.email}</td>
          </tr>
          <tr>
              <td>MobileNo:</td>
              <td>${user.mobileNo}</td>
          </tr>
          <tr>
          <td>UserName</td>
          <td>${user.userName}</td>
          </tr>
          </table>
          </form:form>
          </div>
          </body>
          </html>


