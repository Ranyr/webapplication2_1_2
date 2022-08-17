<%@page import="com.pdao1"%>
<jsp:useBean id="u" class="com.productbean1"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
pdao1.delete(u);
response.sendRedirect("viewproductform1.jsp");
%>
