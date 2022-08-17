<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><center>ADMIN VIEW</center></title>
</head>
<body>

<%@page import="com.dao,com.*,java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="admin_header.html" %>
<h1><center><font color="green">FOOD ITEMS</font></center></h1>

<%
List<userbean> list=dao.getAllRecords();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr><th>Id</th><th>foodcatergory</th><th>food_item_name</th><th>price</th><th>Edit</th><th>Delete</th></tr>
<c:forEach items="${list}" var="u">
	<tr><tr><td>${u.getId()}</td><td>${u.getFoodcategory()}</td><td>${u.getItem_name()}</td><td>${u.getPrice()}</td><td><a href="editform.jsp?id=${u.getId()}">Edit</a></td><td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td></tr>
</c:forEach>
</table>
<br/>
<%@ include file="footer1.html" %>
</body>
</html>