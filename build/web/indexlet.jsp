<%-- 
    Document   : indexlet
    Created on : 30 Mar, 2022, 2:48:25 PM
    Author     : radhika
--%>

<%@page import="com.cartbean"%>
<%@page import="java.util.*"%>
<%@page import="com.userdao"%>
<%@page import="com.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
      <%     
          ArrayList<cartbean>cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
 
          if(cart_list != null)
          {   
              session.setAttribute("cart_list",cart_list);
      
          }
     
     
     %>
        
    </head>
    <body>
        <%
           String em=(String)request.getParameter("email");
           String pass=(String)request.getParameter("password");
           
          User us=userdao.userlogin(em,pass);  //us has whole row saved in user table in database(name,password,email,id)
          if(us != null)
          {
            //out.println("user is authenticated");
           //out.println("email = "+us.getEmail());
           session.setAttribute("user",us);
           
           response.sendRedirect("getpro.jsp");
          }
          else
          {   out.println("<body bgcolor=#FFDDCC>");
              out.println("<h1><Center>Credentials are Incorrect</Center></h1>"); 
               out.println("<h2><Center><a href='lablo1.jsp'>login again?</Center></h2>");
              out.println("</body>");
          }
        %>
       
    </body>
</html>
