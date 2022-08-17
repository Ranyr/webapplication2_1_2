<%@page import="com.dao"%>
<jsp:useBean id="u" class="com.userbean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=dao.save(u);
if(i>0)
{
response.sendRedirect("success.jsp");
}
else
{
response.sendRedirect("error.jsp");
}
%>