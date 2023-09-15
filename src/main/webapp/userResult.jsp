<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Name Result</title>
</head>
<body>
<p>Welcome, ${userNameBadge.getFirstName()}! <br />
Your username is: ${userNameBadge.getUserName()}.<br />
<p>
<a href="petIndex.jsp">Enter Pet Information</a>

</body>
</html>