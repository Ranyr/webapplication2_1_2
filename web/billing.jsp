<%-- 
    Document   : billing
    Created on : 28 May, 2020, 1:21:50 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <%@ include file="header.html"%>
      <form action="order_msg.jsp">
          <body bgcolor="#FEE1E8">
       
        <%
   String y2;
 
 session=request.getSession(false);
  
y2=(String)session.getAttribute("x2");
    %>
        <h1><center>our service supports cash on delivery</center></h1><br>
        
        <h3><center>you have to pay <%=y2%> while receiving an order</center></h3>
        <p> <center>   <input type="submit" value="ok"></center></p>
        
    </body>
    </form>
     <%@ include file="footer1.html"%>
</html>

