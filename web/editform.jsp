<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@page import="com.dao,com.userbean,com.ConnectionUtil"%>
<%@ include file="admin_header.html" %>
<%
String id=request.getParameter("id");
userbean u=dao.getRecordById(Integer.parseInt(id));
%>

<h1>Edit Form</h1>
<form action="edituser.jsp" method="post">
<input type="hidden" name="id" value="<%=u.getId()%>"/>

<table>
<tr><td>Foodcategory</td><td><input type="text" name="foodcategory" value="<%= u.getFoodcategory()%>"/></td></tr>
<tr><td>Food_item_name:</td><td><input type="text" name="item_name" value="<%= u.getItem_name()%>"/></td></tr>
<tr><td>Price</td><td><input type="text" name="price" value="<%= u.getPrice()%>"/></td></tr>

</td></tr>
<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
</table>
</form>
<%@ include file="footer1.html" %>
</body>
</html>