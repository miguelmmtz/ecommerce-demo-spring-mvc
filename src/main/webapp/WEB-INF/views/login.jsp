<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div align="center">
	<h1>Log In</h1>
	<form:form action="login" method="post" modelAttribute="credential">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input class="btn btn-primary" type="submit" value="Login"></td>
			</tr>
		</table>
	</form:form>
</div>
</body>
</html>