<%@page import="com.dao"%>
<jsp:useBean id="u" class="com.userbean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=dao.update(u);
response.sendRedirect("viewusers.jsp");
%>