<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search supplier</title>

<link rel="stylesheet" href="homeStyle.css">
<style type="text/css">
    form {
        width: 300px;
        margin: 100px auto ; 
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        background-color: #f9f9f9;
        background-color: #e6e6ff;
    }

    label {
        display: block;
        margin-bottom: 5px;
    }

    input[type="text"] {
        width: 90%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }

    input[type="submit"] {
        background-color: #007bff;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }

    .form-container {
        text-align: center;
    }
</style>
</head>
<body>

<jsp:include page="navbar2.jsp" /> 
<form action="supplier" method="post">

		Supplier ID<input type="text" name="sid"> <br>
		
		<input type="submit" name="submit" value="submit">
	</form>
	
<jsp:include page="footer.jsp" />
</body>
</html>