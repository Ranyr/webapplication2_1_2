<%-- 
    Document   : billing1
    Created on : 28 May, 2020, 3:24:52 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
     <%@ include file="header.html"%>
    <form action="order_msg.jsp">
    <body bgcolor="#FEE1E8">
        <%
   String cde;
 
 session=request.getSession(false);
  
cde=(String)session.getAttribute("abc");
    %>
        <h2> <center> our service supports cash on delivery</center></h2><br>
        
        <h2><center>you have to pay <%=cde %> while receiving an order</center></h2><br>
    <p> <center>   <input type="submit" value="ok"></center></p>
    </body>
    </form>
     <%@ include file="footer1.html"%>
</html>
