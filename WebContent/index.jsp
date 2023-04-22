<%@page import="java.util.*"%>
<%@page import="model.User"%>
<%@page import="controller.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ayush" method="get">
<input type="text" placeholder="name" name="name">
<input type="submit" value="Submit">
</form>
<br/>
<br/>
<a href="delete.jsp">Delete</a>

<a  href="update.jsp">Update</a>
</body>
</html>