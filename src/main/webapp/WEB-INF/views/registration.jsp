<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div align="center">
	<h1>Sign Up</h1>
	<form:form action="saveUser" method="post" modelAttribute="user">
		<table>
			<form:hidden path="userId"/>
			<tr>
				<td>Name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password"/></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="emailId"/></td>
			</tr>	
			<tr>
				<td>Phone Number:</td>
				<td><form:input path="phoneNo"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input class="btn btn-primary" type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form>
</div>
</body>
</html>