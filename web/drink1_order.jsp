<%-- 
    Document   : drink1_order
    Created on : 28 May, 2020, 12:52:15 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
        #div1{
            margin-left:498px;
            margin-top:23px;
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
           
            background-color:rgb(255,250,250);
            border-bottom: 1px solid #A378B5;
        }
        
        </style>
        </head>
           <%@ include file="header.html"%>
          <body bgcolor="#FEE1E8">
             <%         
 String a1,a2;
 
 HttpSession ses=request.getSession();
  
a1=request.getParameter("s1");
  
a2=request.getParameter("t1");
  
ses.setAttribute("z1", a1);
 
 ses.setAttribute("z2", a2);
  
          
            
 
   %>
       <form action="orderses1" >
         <div id="div1">
    <table border="0" align="Center"><tr><th>Place Order</th></tr></table>
    </div>

    <table  border="0" align="Center" cellspacing="20" id="table1">
    
    <tr style="text-align:left"><td style="border:0">Item</td>
        <td style="text-align:left"><input type="text" name="t1"  value="<%=a1%>" readonly="readonly"></td></tr>
                
    <tr  style="text-align:left"><td style="border:0">Quantity</td> 
    <td><input type="number" name="t2" placeholder="Quantity" required></td></tr>
    
     <tr  style="text-align:left"><td style="border:0">Price</td> 
         <td><input type="text" name="t3" readonly="readonly" value="<%=a2%>"></td></tr>
          

    <tr style="text-align:left"><td style="border:0">Order date&time</td>
    <td style="text-align:left"><input type="datetime-local" name="t4" required></td></tr>
    
     <tr style="text-align:left"><td style="border:0">customer name</td>
      <td><input type="text" name="t5" placeholder="your name" required></td></tr>  
    
          <tr style="text-align:left"><td style="border:0">contact no.</td>
      <td><input type="text" name="t6" placeholder="contact detail" required></td></tr>  
    
        
          <tr style="text-align:left"><td style="border:0">email address</td>
      <td><input type="email" name="t7" placeholder="contact detail" required></td></tr>  
          <tr></tr>
    <tr style="text-align:left"><td style="border:0">delivery address</td>
    <td style="border:0"><textarea   name="t8" placeholder="delivery address" rows="7" cols="23" maxlength="250" required> </textarea></td>
  
   
           <tr> <td style="border:0" align="Center" colspan="2"><input type="submit" value="PLACE ORDER" id="btn"> </td></tr>      
    </table>
 
        </form>
    </body>
       <%@ include file="footer.html"%>
</html>