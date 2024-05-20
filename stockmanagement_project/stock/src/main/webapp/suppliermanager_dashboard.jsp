<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Supply Manager Dashboard</title>
<link rel="stylesheet" href="homeStyle.css">
<style type="text/css">
<
link rel ="stylesheet " href ="homeStyle.css ">table {
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
	background-color: #f2f2f2;
}


.button-container {
	text-align: center;
}

.button-container form {
	display: inline;
}

.button-container button {
	background-color: #007bff; 
	color: white;
	border: none;
	padding: 15px 30px; 
	cursor: pointer;
	border-radius: 5px;
	font-size: 16px;
	margin: 5px; 
}

.button-container button:hover {
	background-color: #0056b3;
}

h1 {
	text-align: center;
}

.centered {
	text-align: center;
}
</style>
</head>

<body>


	<jsp:include page="navbar2.jsp" />

	<br>
	<h1>Welcome! Supplier Manager</h1>
	<br>

	
		<div class="button-container">
		<form method="post" action="manageSupplierServlet">
			<button type="submit" class="manage-button">Manage
				Supplier</button>
			</form>
			<form action="stocklist.jsp" method = "post">
			<button type="submit" class="edit-button">Update Stock</button>
			</form>
			
			<form action="buystock.jsp" method = "post">
			<button type="submit" class="edit-button">Buy Stock</button>
			</form>
		</div>
	

	<br>
	<br>
	
	<div class="centered">
		<img alt="StockFlow" src="Images/stock2.jpg"
			style="width: 70%; height: auto;">
	</div>

	<jsp:include page="footer.jsp" />

</body>
</html>
