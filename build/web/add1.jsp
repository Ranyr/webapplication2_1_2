<%-- 
    Document   : add1
    Created on : 28 Apr, 2022, 12:35:01 PM
    Author     : radhika
--%>

<%@page import="com.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

int oid1=(int)session.getAttribute("oo");
session.setAttribute("oid2",oid1);
 
User b=(User)session.getAttribute("user");
if(b != null)
{
   String nm=b.getName(); out.println("nm= "+nm); //now send confirmation email at this address
    String em=b.getEmail(); out.println("em= "+em);
     session.setAttribute("em1",em);
}

double tt=(double)session.getAttribute("total1");
session.setAttribute("tt1",tt);out.println("tt= "+tt);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
   #s1{
   background-color:rgb(255,250,250);
   width:310px;
   margin-left:520px;
   border-bottom:1px solid palevioletred;
   border-color:rgb(202,174,183);
   align:center;
   }
   #div1{
   background-color:rgb(202,174,183);
    width:310px;
 
     margin-left:520px;
    margin-top:130px;
      height:41px;
    align:center;
    text-align:"center";
   }
   #btn{
        background-color:rgb(233,219,232);
              border-radius:15px;   
       
       
   } 
   #s2{
       width:250;
       
   }
    
    </style>
        
    </head>
    <body>
        <h1>Coupon code Applied Successfully</h1> 
<form action="updaddrss">
         <table id="div1" align="center">   
        <div><th><td >Enter Order  Delivery Details</td></th></div>
        </table>
        
        <table style="align:center"  id="s1" cellspacing="11">
            <tr ><td align="left">Contact number</td></tr>
            <tr><td align="left"><input size="33" type="text" name="contact_no" placeholder="your Mobile no." required></td></tr>
            
            <tr><td align="left">address</td></tr>
            <tr><td align="left"><textarea   name="address" placeholder="enter delivery adress" rows="7" cols="33" maxlength="250" required> </textarea></td></tr>
    
                   
            <tr><td align="Center"><input type="submit" value="ok" id="btn"></td></tr>
       </table>
        </form>      
    </body>
</html>
