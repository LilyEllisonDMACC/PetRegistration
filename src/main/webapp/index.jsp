<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Owner Registration</title>
</head>
<body>
	<h1>Welcome to The Owner Registration Page for New Clients</h1>
	<h2>Owner Information</h2>
	<form action="getClientInfoServlet" method="post">
		Please enter the name of the primary pet owner to create a user name.<br>
		<label for="fName"> First name:</label>
		<input type="text" name="fName" size="10"><br>
		<label for="lName"> Last name:</label>
		<input type="text" name="lName" size="10"><br>
		<input type="submit" value="Create User Name" />
	</form>
</body>
</html>