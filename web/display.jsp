<%-- 
    Document   : display
    Created on : 30 Mar, 2022, 4:27:35 PM
    Author     : radhika
--%>

<%@page import="com.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="navvheader.jsp"%>
        <h1> display results here!</h1>
        <%    
            User user1=(User)session.getAttribute("user");// this session comes from indexlet.jsp=after login credials are saved here 
            if(user1 != null)
            {
                out.println("ses is available here");
               out.println("email= "+ user1.getEmail());
              out.println("email= "+ user1.getName());
              
            }
            else{
                out.println("ses is not available here");
            }  
        %>
        
        
    </body>
</html>
