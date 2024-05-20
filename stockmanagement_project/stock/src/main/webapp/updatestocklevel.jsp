<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update stock</title>
<link rel="stylesheet" href="homeStyle.css">
<style>

form {
    max-width: 400px;
    margin: 0 auto;
    padding: 20px;
    border: 1px solid #ddd;
    border-radius: 5px;
    background-color: #fff;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}


h1 {
    font-size: 24px;
    text-align: center;
    color: #333;
    margin-bottom: 20px;
}


label {
    display: block;
    margin: 5px 0;
    color: #333;
    font-weight: bold;
}


input[type="text"],
input[type="number"] {
    width: 90%;
    padding: 10px;
    margin: 5px 0;
    border: 1px solid #ccc;
    border-radius: 5px;
}


input[type="submit"] {
    width: 100%;
    padding: 10px;
    background-color: #3498db;
    color: #fff;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}


input[type="submit"]:hover {
    background-color: #2980b9;
}



</style>



</head>
<body>
<jsp:include page="navbar.jsp" />

<%
	String pid=request.getParameter("product_id");
	String ptype=request.getParameter("product_type");
	String pname=request.getParameter("product_name");
	String punitprice=request.getParameter("product_unit_price");
	String pstock=request.getParameter("total_stock");
%>
<h1>STOCK DETAILS</h1>
<form action="updatestock" method="post">
	
		Product_ID:<input type="text" name="product_id" value="<%= pid %>" readonly> <br><br>
		Product_Type :<input type="text" name="product_type" value="<%= ptype %>" readonly> <br><br>
		Product_Name :<input type="text" name="product_name" value="<%= pname %>" readonly> <br><br>
		Product_Unit_Price :<input type="number" name="product_unit_price" value="<%= punitprice %>" readonly> <br><br>
		Total_Stock :<input type="number" name="total_stock" value="<%= pstock %>"> <br><br>
		
		<input type="submit" name="submit" value="update stock level">
		
	</form>

<jsp:include page="footer.jsp" />

</body>
</html>