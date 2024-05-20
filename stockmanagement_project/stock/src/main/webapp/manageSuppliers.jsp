<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Manage Users</title>
<style type="text/css">
.centered {
	text-align: center;
}

table {
	border-collapse: collapse;
	width: 100%;
	margin-bottom: 20px;
}

table, th, td {
	border: 1px solid #ddd;
}

th, td {
	padding: 10px;
	text-align: left;
}

th {
	background-color: #007bff;
	color: white;
}

.button-container {
	margin: 10px 0;
	text-align: center;
}

.button-container form {
	display: inline;
}

.button-container button {
	background-color: #007bff;
	color: white;
	border: none;
	padding: 10px 20px;
	cursor: pointer;
	border-radius: 5px;
	font-size: 16px;
	margin-right: 10px;
}

.button-container button:hover {
	background-color: #0056b3;
}
</style>

</head>
<body>
	<jsp:include page="navbar2.jsp" />
	<br>
	<br>
	<div class="button-container">
		<form action="supplierinsert.jsp" method="post">
			<button type="submit" class="add-button">Add Supplier</button>
		</form>
		<form action="supplierlist.jsp" method="post">
			<button type="submit" class="update-button">Update/Delete Supplier</button>
		</form>
		

	</div>
	<h2>Supplier Details</h2>
	<br>
	<br>
	<div class="centered">
		<table>
			<tr>
				<th>Supplier_ID</th>
				<th>Supplier_Name</th>
				<th>Email</th>
				<th>PhoneNumber</th>
				<th>Address</th>
			</tr>

			<c:forEach items="${supplierdetails}" var="supplier">
				<c:set var="id" value="${supplier.supplier_id}" />
				<c:set var="name" value="${supplier.supplier_name}" />
				<c:set var="email" value="${supplier.email}" />
				<c:set var="phone" value="${supplier.phonenumber}" />
				<c:set var="type" value="${supplier.address}" />
				<tr>
					<td>${supplier.supplier_id}</td>
					<td>${supplier.supplier_name}</td>
					<td>${supplier.email}</td>
					<td>${supplier.phonenumber}</td>
					<td>${supplier.address}</td>

				</tr>
			</c:forEach>
		</table>

	</div>
	<br>
	<br>
	<jsp:include page="footer.jsp" />
</body>
</html>
