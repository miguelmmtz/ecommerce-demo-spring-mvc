<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchased Products View</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">
</head>
<body>
	<h1>Purchase Order</h1>
	<div align="center">
		<h3>Order Id: ${purchase.purchaseOrderId}</h3>
		<h3>Date and time: ${purchase.dateTime}</h3>
		<h3>Purchased product list</h3>
		<table class="table">
			<thead class="thead-dark">
			<tr>
				<th>Product Name</th>
				<th>Product Category</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
			</thead>
			<c:forEach items="${purchase.purchasedProducts}" var="prod">
					<tr>						
						<td>${prod.productName}</td>
						<td>${prod.productCategory}</td>
						<td>${prod.productPrice}</td>
						<td>${prod.productQuantity}</td>
					</tr>
			</c:forEach>
		</table>
		<h3>Total price: ${purchase.totalPrice}</h3>
	</div>
</body>
</html>