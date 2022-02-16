<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart view</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
	<h1>Shopping Cart</h1>
	<h2>User: ${userId}</h2>
	<div align="center">
		<form:form action="purchaseCart" method="post" modelAttribute="userIdDto">
		<input type="hidden" name="userId" value="${userId}">
		<table class="table">
			<thead class="thead-dark">
			<tr>
				<th>Product Name</th>
				<th>Product Category</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
			</thead>
			<c:forEach items="${cart}" var="cart">				
				<tr>						
					<td>${cart.productName}</td>
					<td>${cart.productCategory}</td>
					<td>${cart.productPrice}</td>
					<td>${cart.productQuantity}</td>
				</tr>
			</c:forEach>
		</table>
		<button class="btn btn-primary" type="submit">Buy</button>
		</form:form>
	</div>
</body>
</html>