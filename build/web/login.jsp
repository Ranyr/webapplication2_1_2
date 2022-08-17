<%-- 
    Document   : login
    Created on : 28 Mar, 2022, 11:53:20 AM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            background-color:rgb(202,174,183);
            cellpadding:25;
             margin-top:130px;
             height:38px;
            width:330px;
            margin-left:520px;
        }
    </style>
            
    </head>
    <body>
       
           <form action="trial"> 
    
     <div id="div1">
    <table border="0" align="Center"><tr><th>LOG IN</th></tr></table>
    </div>
       
     <table style="border:0" align="Center" cellspacing="11" id="table1" >
         
    <tr><td  align="Center" >Username</td></tr>
    <tr><td align="Center"><input type="text" name="t1" required></td></tr>
    <tr><td align="Center">Password</td></tr>
    <tr><td align="Center"><input type="password" name="t2" required></td></tr>

<tr><td align="Center"><input type="submit" value="login" id="btn"></td></tr>
  
  
   </table> 
 </form> 
        
        
        
    </body>
</html>
