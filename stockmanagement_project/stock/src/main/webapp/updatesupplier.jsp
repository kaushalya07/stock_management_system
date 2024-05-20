<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update supplier</title>

<link rel="stylesheet" href="homeStyle.css">

<style type="text/css">
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 0;
    }

    h1 {
        font-size: 24px;
        color: #336699;
        text-align: center;
        margin: 20px 0;
    }

    form {
        background-color: #fff;
        padding: 10px; 
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        max-width: 400px;
    }

    label {
        display: block;
        margin-top: 10px;
        color: #333;
    }

    input[type="text"] {
        width: 90%;
        padding: 10px;
        margin: 5px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"] {
        background-color: #800080;
        color: #fff;
        padding: 10px 20px;
        border: none;
        cursor: pointer;
        border-radius: 4px;
        margin-top: 10px;
    }

    input[type="submit"]:hover {
        background-color: #660066;
    }

    .center {
        text-align: center;
    }
</style>


</head>
<body>
<jsp:include page="navbar2.jsp" /> 
<%
	String sid=request.getParameter("supplier_id");
	String sname=request.getParameter("supplier_name");
	String semail=request.getParameter("email");
	String sphonenumber=request.getParameter("phonenumber");
	String saddress=request.getParameter("address");
%>
<h1 style="font-size: 24px; color: #336699; text-align:center;">Supplier Details</h1>

<form action="updatesupplier" method="post">
	
		Supplier_ID :<input type="text" name="supplier_id" value="<%= sid %>" readonly> <br><br>
		Supplier_Name :<input type="text" name="supplier_name" value="<%= sname %>"> <br><br>
		Email :<input type="text" name="email" value="<%= semail %>"> <br><br>
		Phonenumber :<input type="text" name="phonenumber" value="<%= sphonenumber %>"> <br><br>
		Address :<input type="text" name="address" value="<%= saddress %>"> <br><br>
		
		<input type="submit" name="submit" value="update suppliers details">
		
	</form>
<jsp:include page="footer.jsp" /> 
</body>
</html>