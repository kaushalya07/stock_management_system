<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="loginStyles.css">
<meta charset="ISO-8859-1">
<title>supplier account</title>

<style type="text/css">


body {
  font-family: Arial, sans-serif;
  background-color: #f0f0f0;
  margin: 0;
  padding: 0;
}


table {
  width: 90%;
  border-collapse: collapse;
  margin: 20px;
  border: 1px solid #ccc;
  background-color: #fff;
  box-shadow: 0 2px 2px rgba(0, 0, 0, 0.1);
}

table th, table td {
  border: 1px solid #ccc;
  padding: 8px;
  text-align: left;
}

table tr:nth-child(even) {
  background-color: #e0e0e0;
}


input[type="button"] {
  background-color: #007BFF;
  color: #fff;
  border: none;
  padding: 10px 20px;
  cursor: pointer;
  border-radius: 5px;
  margin: 5px;
}

input[type="button"]:hover {
  background-color: #0056b3;
}



</style>
</head>
<body>
<jsp:include page="navbar2.jsp" /> 
<table>
<c:forEach var="supplier" items="${supplierDetails}">
	
		<c:set var="sid" value="${supplier.supplier_id}"/>
		<c:set var="sname" value="${supplier.supplier_name}"/>
		<c:set var="semail" value="${supplier.email}"/>
		<c:set var="sphonenumber" value="${supplier.phonenumber}"/>
		<c:set var="saddress" value="${supplier.address}"/>
		
<tr>
		<td>supplier_id</td>
		<td>${supplier.supplier_id}</td>
	</tr>
	
	<tr>
		<td>supplier_name</td>
		<td>${supplier.supplier_name}</td>
	</tr>
	
	<tr>
		<td>email</td>
		<td>${supplier.email}</td>
	</tr>
	
	<tr>
		<td>phonenumber</td>
		<td>${supplier.phonenumber}</td>
	</tr>
	
	<tr>
		<td>address</td>
		<td>${supplier.address}</td>
	</tr>
	
	</c:forEach>
</table>

<c:url value="updatesupplier.jsp" var="supupdate">
	
		<c:param name="supplier_id" value="${sid}" />
		<c:param name="supplier_name" value="${sname}" />
		<c:param name="email" value="${semail}" />
		<c:param name="phonenumber" value="${sphonenumber}" />
		<c:param name="address" value="${saddress}" />
	</c:url>
	

<a href="${supupdate}">
	<input type="button" name="update" value="Update Supplier Details">
	</a>
	
	<br>
	<br>
	
	
	<c:url value="deletesupplier.jsp" var="supdelete">
	
		<c:param name="supplier_id" value="${sid}" />
		<c:param name="supplier_name" value="${sname}" />
		<c:param name="email" value="${semail}" />
		<c:param name="phonenumber" value="${sphonenumber}" />
		<c:param name="address" value="${saddress}" />
	</c:url>
	
	
	<a href="${supdelete }">
	<input type="button" name="delete" value="Delete Supplier ">
	</a>
	
<jsp:include page="footer.jsp" />
</body>
</html>