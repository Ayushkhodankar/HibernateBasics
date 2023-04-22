<%@page import="controller.UserDao"%>
<%@page import="model.User"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateuser" method="get">
<%
String id=request.getParameter("id");
User u1= new UserDao().userSearch(id);
%>
<input type="text" placeholder="name" name="name" value="<%=u1.getName()%>">
<input type="submit" value="Update">
</form>
</body>
</html>