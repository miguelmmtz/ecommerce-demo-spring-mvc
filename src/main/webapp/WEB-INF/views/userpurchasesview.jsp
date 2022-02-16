<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Orders View</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet">
</head>
<body>
	<h1>Purchase Orders by User: ${userId}</h1>
	<div align="center">
		<table class="table">
			<thead class="thead-dark">
			<tr>
				<th>Order Id</th>
				<th>Total Price</th>
				<th>Date and Time</th>
			</tr>
			</thead>
			<c:forEach items="${allPurchasesByUser}" var="purchase">
					<tr>						
						<td>${purchase.purchaseOrderId}</td>
						<td>${purchase.totalPrice}</td>
						<td>${purchase.dateTime}</td>
					</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>