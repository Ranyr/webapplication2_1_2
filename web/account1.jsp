<%-- 
    Document   : login
    Created on : 19 May, 2020, 9:08:42 PM
    Author     : radhika
--%>

<%@page import="com.cartbean"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
             margin-top:90px;
             height:38px;
            width:330px;
            margin-left:520px;
        }
        input[type=text]::placeholder{
           text-align:center;
        }
        
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
     <%    // In order to show count of no._of_cart_items_icon on all pages  include this java code
         ArrayList<cartbean>cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
 
 if(cart_list != null)
 {   
     request.setAttribute("cart_list",cart_list);
      
 }  %>
        
        
        
    </head>
    
    <body >
        <div><%@ include file="navvheader.jsp" %></div>
   
    
     
       <form action="reg_servlet"> 
        <table id="div1">
        <div> <tr><td align="center" colspan="2" id="div1"><h1>Sign UP</h1></td></th></div>
        </table>
     <table style="border:0" align="Center" cellspacing="11" id="table1" >
         
     <tr><td  align="center">Name</td></tr>
    <tr><td align="Center"><input type="text" name="name" required></td></tr>
        
    <tr><td  align="center">Email</td></tr>
    <tr><td align="Center"><input type="text" name="email" required></td></tr>
    
    <tr><td align="Center">Password</td></tr>
    <tr><td align="Center"><input type="password" name="password" required></td></tr>
    
<tr><td align="Center"><input type="submit" value="login" id="btn"></td></tr>
  

<tr><td align="Center"><input type="reset" value="Reset"id="btn"></td></tr>
 
   </table>
    </form> 
 
   <div><%@ include file="footer1.html" %></div>
         </body>
</html>

