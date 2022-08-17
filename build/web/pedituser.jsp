<%@page import="com.pdao"%>
<jsp:useBean id="u" class="com.productbean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=pdao.update(u);
response.sendRedirect("viewproductform.jsp");
%>
