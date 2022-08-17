<%-- 
    Document   : contact
    Created on : 19 May, 2020, 8:11:38 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
     <body  bgcolor="E0FFFF">
      
        
        <form action="./contactform">
         <table id="div1" align="center">   
        <div><th><td >CONTACT US</td></th></div>
        </table>
        
        <table style="align:center"  id="s1" cellspacing="11">
            <tr ><td align="left">Name</td></tr>
            <tr><td align="left"><input size="33" type="text" name="t1" placeholder="write your name here" required></td></tr>
            <tr><td align="left">Email</td></tr>
          <tr><td align="left" id="s2"><input  size="33" type="text" name="t2" placeholder="enter your email address" required></td></tr>
            <tr><td align="left">Message</td></tr>
            <tr><td align="left"><textarea   name="message" placeholder="message" rows="7" cols="33" maxlength="250" required> </textarea></td></tr>
    
                   
            <tr><td align="Center"><input type="submit" value="SEND MESSAGE" id="btn"></td></tr>
       </table>
              
     </form>
    </body>
</html>
