<%-- 
    Document   : login1
    Created on : 28 Mar, 2022, 11:57:57 AM
    Author     : radhika
--%>

<%@page import="com.User"%>
<%@page import="com.userdao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
   User user=(User)request.getSession().getAttribute("user");
   if(user != null) 
   {   
       request.setAttribute("user",user);
      out.println("user is not null");
   }
   else
   {out.println("user is null");}
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
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
        
      
    <%@include  file="nav_header.html"%>
     
    </head>
    <body>
        <form action="checklog"  method="post"> 
    
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
