<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pet Info Result</title>
</head>
<body>
<p>Welcome, ${userPet.getpName()}! <br />
You are such a good ${userPet.getpGender()}! <br />
</p>
<a href="index.jsp">Return to User Registration Page</a> <br />
<a href="petIndex.jsp">Enter another pet</a>

</body>
</html>