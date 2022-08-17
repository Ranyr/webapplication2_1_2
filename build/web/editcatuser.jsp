<%@page import="com.catdao"%>
<jsp:useBean id="ct" class="com.catbean"></jsp:useBean>>
<jsp:setProperty property="*" name="ct" />

<%
int i=catdao.update(ct);
if(i>0)
{response.sendRedirect("catsuccess.jsp");}
else
{
  response.sendRedirect("caterror.jsp");

}
%>
