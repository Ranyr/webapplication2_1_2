<%-- 
    Document   : addproform
    Created on : 23 Mar, 2022, 9:31:11 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        #div1{
            margin-left:498px;
            margin-top:80px;
            height:38px;
             background-color:rgb(202,174,183);
             width:335px;
        }
        input::placeholder{
          
            color:black; 
        }
    #btn
        {background-color:rgb(233,219,232);
          border-radius:15px;
            
        }
        #table1{
             margin-left:498px;
            width:335px;
            margin-top:"50px";
            background-color:rgb(255,250,250);
            border-bottom: 1px solid #A378B5;
        }
        </style>
    </head>
    <body>
         <%@ include file="admin_header.html" %>
        
       <form action="adpro.jsp">
      
        
         <div id="div1">
    <table border="0" align="Center"><tr><th>Add Product</th></tr></table>
    </div>

    <table  border="0" align="Center" cellspacing="20" id="table1">
      
    <tr style="text-align:left" ><td style="border:0">product name</td>         
   <td align="left" colspan="2"><input type="text" name="name" placeholder="enter product Name">
   
  
        <tr  style="text-align:left"><td style="border:0">category</td> 
     <td><input type="text" name="category" placeholder="enter category"></td></tr>
       
    <tr  style="text-align:left"><td style="border:0">Quantity</td> 
    <td><input type="text" name="quantity" placeholder="Quantity"></td></tr>
    
     <tr  style="text-align:left"><td style="border:0">Price</td> 
     <td><input type="text" name="price" placeholder="enter price here"></td></tr>
          

   
   <tr> <td style="border:0" align="Center" colspan="2"><input type="submit" value="Add Product" id="btn"> </td></tr>      
    </table>
  
       </form>
        
          <%@ include file="footer1.html" %>
        
    </body>
</html>
