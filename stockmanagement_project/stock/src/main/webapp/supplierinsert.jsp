<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>insert supplier</title>
<link rel="stylesheet" href="homeStyle.css">
<style>

form {
    margin: 20px auto; 
    width: 400px; 
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: #e6f7ff; 
}

input[type="text"] {
    width: 90%;
    padding: 10px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    background-color: #f0f0f0;
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


form input {
    margin-bottom: 10px;
}


form h2 {
    text-align: center;
    font-size: 24px;
    margin-bottom: 20px;
    color: #333;
}


form {
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}


form label {
    display: block;
    font-weight: bold;
    color: #333;
    margin-bottom: 5px;
}

</style>
</head>
<body>
<jsp:include page="navbar2.jsp" /> 
<form action="insert" method="post">

		Supplier ID <input type="text" name="ID" required><br>
		Supplier Name <input type="text" name="name" required><br>
		Email <input type="text" name="email" required><br>
		Phone Number <input type="text" name="phone" required><br>
		Address <input type="text" name="add" required><br>
		
		
		<input type="submit" name="submit" value="Create supplier">
	</form>
<jsp:include page="footer.jsp" />
</body>
</html>