<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="loginStyles.css">
<meta charset="ISO-8859-1">
<title>Buy Stock</title>

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
        padding: 5px; 
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        max-width: 300px; 
    }

    label {
        display: block;
        margin-top: 5px;
        color: #333;
    }

    input[type="text"],
    input[type="number"],
    input[type="date"] {
        width: 90%;
        padding: 5px;
        margin: 2px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    input[type="submit"] {
        background-color: #800080;
        color: #fff;
        padding: 5px 20px;
        border: none;
        cursor: pointer;
        border-radius: 4px;
        margin-top: 5px;
    }

    input[type="submit"]:hover {
        background-color: #660066;
    }

    .center {
        text-align: left;
    }

</style> 

</head>
<body>

<jsp:include page="navbar2.jsp" /> 
	<h1>Buy Stock</h1>
    <form action="#" method="post">
        <label for="productID">Product ID:</label>
        <input type="text" id="productID" name="productID" required><br>

        <label for="productName">Product Name:</label>
        <input type="text" id="productName" name="productName" required><br>

        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" required><br>

        <label for="date">Date:</label>
        <input type="date" id="date" name="date" required><br>

        <label for="supplierID">Supplier ID:</label>
        <input type="text" id="supplierID" name="supplierID" required><br>

        <label for="pricePerUnit">Price Per Unit:</label>
        <input type="text" id="pricePerUnit" name="pricePerUnit" required><br>

        <label for="totalPrice">Total Price:</label>
        <input type="text" id="totalPrice" name="totalPrice" required><br>

        <input type="submit" value="Submit">
    </form>

<jsp:include page="footer.jsp" />
</body>
</html>