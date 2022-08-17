<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title align="center">ADMIN VIEW</title>
</head>
<body>

<%@page import="com.userbeancontact,com.*,java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="admin_header.html" %> 

<h1><center> Customers Contact Requests</center></h1>

<%
List<userbeancontact> list=daocontact.getAllRecords();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr align="center"><th>name</th><th>email</th>
 <th>message</th></tr>

<c:forEach items="${list}" var="u">
  <tr><td >${u.getName()}</td><td >${u.getEmail()}</td><td >${u.getMessage()}</td>
  </tr>
</c:forEach>
</table>
<br/>

<%@ include file="footer1.html" %> 
</body>
</html>