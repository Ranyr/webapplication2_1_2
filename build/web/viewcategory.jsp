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
List<catbean> list=catdao.getAllRecords();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr><th>Id</th><th>category Name</th><th>Edit</th><th>Delete</th></tr>
<c:forEach items="${list}" var="u">
	<tr><td>${u.getid()}</td><td>${u.getname()}</td><td><a href="editcatform.jsp?id=${u.getid()}">Edit</a></td><td><a href="catdelete.jsp?id=${u.getid()}">Delete</a></td></tr>
</c:forEach>
</table>
<br/>
<%@ include file="footer1.html" %>
</body>
</html>

