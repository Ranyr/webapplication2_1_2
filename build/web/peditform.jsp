<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@page import="com.pdao,com.productbean,com.ConnectionUtil"%>
<%@ include file="admin_header.html" %>
<%
//String id=request.getParameter("id");
//int id=Integer.parseInt(request.getParameter("id"));
//productbean u=pdao.getRecordByid(id); 

int pid=Integer.parseInt(request.getParameter("pid"));
productbean u=pdao.getRecordByid(pid);
%>

<h1>Edit Form</h1>

<form action="pedituser.jsp">
<input type="hidden" name="pid" value="<%=u.getpid()%>"/>

<table>
<tr><td>name</td><td><input type="text" name="name" value="<%= u.getname()%>"/></td></tr>
<tr><td>category</td><td><input type="text" name="id" value="<%= u.getid()%>"/></td></tr>
<tr><td>quantity</td><td><input type="text" name="quantity" value="<%= u.getquantity()%>"/></td></tr>
<tr><td>price</td><td><input type="text" name="price" value="<%= u.getprice()%>"/></td></tr>
</td></tr>
<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
</table>
</form>
<%@ include file="footer1.html" %>
</body>
</html>
