
<%@page import="com.catdao"%>
<jsp:useBean id="u" class="com.catbean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
catdao.delete(u);
response.sendRedirect("viewcategory.jsp");
%>
