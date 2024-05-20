<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>stock account</title>
<link rel="stylesheet" href="homeStyle.css">


<style>
    
    table {
        width: 80%;
        margin: 0 auto;
        border-collapse: collapse;
        border: 1px solid #ccc;
        background-color: #f9f9f9;
    }

    th {
        background-color: #007bff;
        color: white;
        font-weight: bold;
        padding: 10px;
        text-align: left;
    }

    td {
        border: 1px solid #ccc;
        padding: 10px;
    }

    .update-button {
        display: block;
        width: 200px;
        background-color: #6b1e7b; 
        color: white;
        padding: 10px;
        border: none;
        border-radius: 5px;
        text-align: center;
        text-decoration: none;
        margin: 20px auto;
        cursor: pointer;
    }

    .update-button:hover {
        background-color: #4b145a; 
    }


    .additional-class {
       
        margin: 10px;
        padding: 15px;
        background-color: #f5f5f5;
        border: 1px solid #ddd;
        border-radius: 5px;
        box-shadow: 2px 2px 5px #888888;
    }

   
</style>



</head>
<body>
<jsp:include page="navbar2.jsp" /> 


	<table>

	<c:forEach var="stock" items="${stockDetails}">
	
		<c:set var="pid" value="${stock.product_id}"/>
		<c:set var="ptype" value="${stock.product_type}"/>
		<c:set var="pname" value="${stock.product_name}"/>
		<c:set var="punitprice" value="${stock.product_unit_price}"/>
		<c:set var="pstock" value="${stock.total_stock}"/>
	<tr>
		<td>product_id</td>
		<td>${stock.product_id}</td>
	</tr>
	
	<tr>
		<td>product_type</td>
		<td>${stock.product_type}</td>
	</tr>
	
	<tr>
		<td>product_name</td>
		<td>${stock.product_name}</td>
	</tr>
	
	<tr>
		<td>product_unit_price</td>
		<td>${stock.product_unit_price}</td>
	</tr>
	
	<tr>
		<td>total_stock</td>
		<td>${stock.total_stock}</td>
	</tr>
	
	</c:forEach>
	</table>
	
	<c:url value="updatestocklevel.jsp" var="slevelupdate">
	
		<c:param name="product_id" value="${pid}" />
		<c:param name="product_type" value="${ptype}" />
		<c:param name="product_name" value="${pname}" />
		<c:param name="product_unit_price" value="${punitprice}" />
		<c:param name="total_stock" value="${pstock}" />
	</c:url>

	
	<a href="${slevelupdate}">
	<input type="button" name="update" value="update stock level">
	</a>
	
<jsp:include page="footer.jsp" />
</body>
</html>