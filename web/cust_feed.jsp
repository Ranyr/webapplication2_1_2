<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title align="center">ADMIN VIEW</title>
</head>
<body>

<%@page import="com.userbeanfeed,com.*,java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="admin_header.html" %> 

<h1><center>CUSTOMERS FEEDBACKS</center></h1>

<%
List<userbeanfeed> list=daofeed.getAllRecords();
request.setAttribute("list",list);
%>

<table border="1" width="90%">
<tr align="center"><th>name</th><th>email</th><th>age</th><th>food_quality</th><th>menu_variety</th>
 <th>speed_of_service</th><th>taste</th> <th>order_accuracy</th><th>price</th>
 <th>comments</th></tr>
 
  
<c:forEach items="${list}" var="u">
   <tr><td>${u.getName()}</td><td>${u.getEmail()}</td><td>${u.getAge()}</td>  
     <td>${u.getFood_quality()}</td><td>${u.getMenu_variety()}</td><td>${u.getSpeed_of_service()}</td>
     <td>${u.getTaste()}</td><td>${u.getOrder_accuracy()}</td><td>${u.getPrice()}}</td>
     <td>${u.getComments()}</td></tr>
 </c:forEach>  
   
</table>
<br/>

<%@ include file="footer1.html" %> 
</body>
</html>