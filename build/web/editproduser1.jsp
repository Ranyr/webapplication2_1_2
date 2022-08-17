<%@page import="com.pdao1"%>
<jsp:useBean id="ct1" class="com.productbean1"></jsp:useBean>
<jsp:setProperty property="*" name="ct1" />


<% 
int i=pdao1.update(ct1); 
if(i>0)
{
   response.sendRedirect("catsuccess.jsp");  
    
}
else
{
   response.sendRedirect("caterror.jsp");  

}

%>