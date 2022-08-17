<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><center>ADMIN VIEW</center></title>
</head>
<body>

<%@page import="com.productbean1,com.pdao1,java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="admin_header.html" %>
<h1><center><font color="green">PRODUCTS</font></center></h1>

<%
List<productbean1> list=pdao1.getAllRecords();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr><th>Id</th><th>product Name</th><th>Product category</th><th>Quantity</th><th>Price</th><th>ADD</th><th>Delete</th></tr>
<c:forEach items="${list}" var="ct1">
<tr><td>${ct1.getPid()}</td><td>${ct1.getFooditem()}</td><td>${ct1.getId()}</td><td>${ct1.getQuantity()}</td><td>${ct1.getPrice()}</td><td><a href="addprodform1.jsp">Add</a></td><td><a href="proddelete1.jsp?pid=${ct1.getPid()}">Delete</a></td></tr>
</c:forEach>
</table>
<br/>
<%@ include file="footer1.html" %>
</body>
</html>
