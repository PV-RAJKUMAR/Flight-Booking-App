<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
	<h1>Hai ${headerMessage}!!!!</h1>

        <form:form method="POST" action="editUser" modelAttribute="user">

        	<form:hidden path="id" />
             <table>
                <tr>
                    <td><form:label path="firstname">First Name</form:label></td>
                    <td><form:input path="firstname"/></td>
                </tr>
                <tr>
                     <td><form:label path="lastname">Last Name</form:label></td>
                     <td><form:input path="lastname"/></td>
                </tr>
                <tr>
                    <td><form:label path="age">Age</form:label></td>
                    <td><form:input path="age"/></td>
                </tr>
                 <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email"/></td>
                 </tr>
                <tr>
                    <td><form:label path="mobileNo">MobileNo</form:label></td>
                    <td><form:input path="mobileNo"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

</body>
</html>