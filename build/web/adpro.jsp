<%@page import="com.pdao"%>
<jsp:useBean id="u" class="com.productbean"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%

   int k=pdao.save(u);
if(k>0)
{
response.sendRedirect("addprosuccess.jsp");
}
else
{
response.sendRedirect("proerror.jsp");
}
%>


