<%-- 
    Document   : lablo1
    Created on : 26 Apr, 2022, 8:16:36 PM
    Author     : radhika
--%>

<%@page import="com.cartbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%
          User um1=(User)session.getAttribute("user");
          if(um1 != null)
          {response.sendRedirect("getpro.jsp");//page where we enter location 
          } 
         ArrayList<cartbean> cart_list= (ArrayList<cartbean>)session.getAttribute("cart-list");
         if(cart_list != null)
         {session.setAttribute("cart_list",cart_list);
         }
        %>
      <style>
         
        #table1{
            background-color:rgb(255,250,250);
             width:330px;
             margin-left:520px;
             
        }
        
        #btn{
            background-color:rgb(233,219,232);
              border-radius:15px;   
        }
        #div1{
            background-color:rgb(255,250,250);
            cellpadding:25;
             margin-top:170px;
             height:38px;
            width:330px;
            margin-left:520px;
        }
        input[type=text]::placeholder{
           text-align:center;
        }
        
    </style>  
       <%@include file="navvheader.jsp" %>  
        
    </head>
    <body>
       <form action="indexlet.jsp"> 
    
     <div id="div1">
    <table border="0" align="Center"><tr><th>LOG IN</th></tr></table>
    </div>
       
     <table style="border:0" align="Center" cellspacing="11" id="table1" >
         
    <tr><td  align="Center" >Email</td></tr>
    <tr><td align="Center"><input type="email" name="email" required></td></tr>
    <tr><td align="Center">Password</td></tr>
    <tr><td align="Center"><input type="password" name="password" required></td></tr>

<tr><td align="Center"><input type="submit" value="login" id="btn"></td></tr>
  
  
   </table> 
 </form> 
    </body>
     <%@include file="footer1.html" %>
</html>
