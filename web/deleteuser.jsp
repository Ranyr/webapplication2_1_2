<%@page import="com.dao"%>
<jsp:useBean id="u" class="com.userbean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
dao.delete(u);
response.sendRedirect("viewuserform.jsp");
%>