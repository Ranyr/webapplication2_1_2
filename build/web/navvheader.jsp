<%-- 
    Document   : navvheader
    Created on : 30 Mar, 2022, 2:07:48 PM
    Author     : radhika
--%>

<%@page import="com.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            
   <%
   User usern=(User)session.getAttribute("user");
   if(usern != null) 
   {   
       request.setAttribute("usern1",usern);
      //out.println("user is not null means if  user is already in the session");
   }
   else
   {//out.println("no user is logged in yet");
    
   }
  %>
        
        
         <style>
body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.topnav {
  overflow: hidden;
  background-color: black;
  color:#f2f2f2;
   font-size: 16px;
}

.topnav-left{float:left; margian-left:5;}
.topnav a {
  float:right;
  align:right;
  color: #f2f2f2;
  text-align: right;
  padding: 10px 14px;
  text-decoration: none;
  font-size: 16px;
  height:13px;
  margin-top: 5px;
  
}

.topnav a:hover {
  background-color: #ddd;
  color: red;
}


</style>
   </head>
         <div class="topnav">
     <p class="topnav-left">Food  Ordering System</p>
    <a href="letout">Logout</a>
    <%      // if user is loggedin  then only user can see ---LOGOUT ORDER
      if(usern != null){%>
         
        <a href="showorder.jsp">My Orders</a>
        <a href="cartdisp.jsp">Cart<span class="badge-danger px-3">${cart_list.size()}</span></a>
       
        
    <%} else{%>
    
   
     <a href="lablo1.jsp">Login</a>   
     
      <a href="account1.jsp">Register</a>
     
     
    <% }%>
   
    <a href="#home">Home</a>
    
    </div>
        
        
 
   
</html>
