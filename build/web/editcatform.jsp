<%-- 
    Document   : editcatform
    Created on : 24 Mar, 2022, 6:28:40 PM
    Author     : radhika
--%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@page import="com.catdao,com.catbean,com.ConnectionUtil"%>
<%@ include file="admin_header.html" %>
<%
//String id=request.getParameter("id");
int id=Integer.parseInt(request.getParameter("id"));
catbean ct=catdao.getRecordByid(id);
%>

<h1>Edit Form</h1>
<form action="editcatuser.jsp">
<input type="hidden" name="id" value="<%=ct.getid()%>"/>

<table>
<tr><td>Category name</td><td><input type="text" name="name" value="<%= ct.getname()%>"/></td></tr>


</td></tr>
<tr><td colspan="2"><input type="submit" value="Edit category"/></td></tr>
</table>
</form>
<%@ include file="footer1.html" %>
</body>
</html>
