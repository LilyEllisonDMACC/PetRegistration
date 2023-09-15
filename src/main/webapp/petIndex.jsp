<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pet Registration</title>
</head>
<body>
	<h1>Welcome to The Pet Registration Page for New Clients</h1>
	<h2>Pet Information</h2>
	<form action="getPetInfoServlet" method="post">
		Please enter the following information for your pet:<br>
		<label for="pName"> Pet's name:</label>
		<input type="text" name="pName" size="10"><br>
		Select your pet's gender:
		<input type="radio" id="male" name="pSex" value="Male">
		<label for="male">Male</label>
		<input type="radio" id="female" name="pSex" value="Female">
		<label for="female">Female</label><br>		
		<input type="submit" value="Submit Pet Info" />
	</form>
</body>
</html>