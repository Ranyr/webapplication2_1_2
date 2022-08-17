<%-- 
    Document   : viewproductform
    Created on : 23 Mar, 2022, 11:59:24 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><center>ADMIN VIEW</center></title>
</head>
<body>

<%@page import="com.pdao,com.*,java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="admin_header.html" %>
<h1><center><font color="green">ALL PRODUCTS</font></center></h1>

<%
List<productbean> list=pdao.getAllRecords();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr><th>Id</th><th>product name</th><th>category</th><th>quantity</th><th>price</th><th>Edit</th><th>Delete</th></tr>
<c:forEach items="${list}" var="u">
  <tr><td>${u.getpid()}</td><td>${u.getname()}</td><td>${u.getid()}</td><td>${u.getquantity()}</td><td>${u.getprice()}</td><td><a href="peditform.jsp?pid=${u.getpid()}">Edit</a></td><td><a href="prodelete.jsp?pid=${u.getpid()}">Delete</a></td></tr>
</c:forEach>
</table>
<br/>
<%@ include file="footer1.html" %>
</body>
</html>
