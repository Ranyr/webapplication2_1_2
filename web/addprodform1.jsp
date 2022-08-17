
<%@page import="java.util.List"%>
<%@page import="com.catdao"%>
<%@page import="com.catbean"%>
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
            width:353px;
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
            width:340px;
            margin-top:"50px";
            background-color:rgb(255,250,250);
            border-bottom: 1px solid #A378B5;
        }
        </style>
    </head>
    <body>
        
        
       <!--adpro.jsp-->
      
        <form action="aadprod"  method="post">
         <div id="div1">
    <table border="0" align="Center"><tr><th>Add Product</th></tr></table>
    </div>

    <table  border="0" align="Center" cellspacing="20" id="table1">
      
    <tr style="text-align:left" ><td style="border:0">product name</td>         
   <td align="left" colspan="2"><input type="text" name="fooditem" placeholder="enter product Name">
   
        <%  
//In order to get all categories from cat table ,and in order to show those all categories in drop down menu at prodform.jsp 
           catdao dd=new catdao();
           List <catbean>ls=dd.getAllRecords();
        
        %>
       
           
            
        
         <tr><td>Category Name</td>
                <td>
                <select name="id"  id="id">
                    <%
                    for(catbean c:ls){
                    %>
                     <option value="<%= c.getid()%>"><%= c.getname()%></option>
                   <% } %>
                </select>
                </td>
          </tr>
       
  
        
     
       
    <tr  style="text-align:left"><td style="border:0">Quantity</td> 
    <td><input type="text" name="quantity" placeholder="Quantity"></td></tr>
    
     <tr style="text-align:left"><td style="border:0">Price</td> 
     <td><input type="text" name="price" placeholder="enter price here"></td></tr>
          

         
         
   <tr> <td style="border:0" align="Center" colspan="2"><input type="submit" value="Add Product" id="btn"> </td></tr>      
    </table>
  
       </form>
        
         
        
    </body>
</html>
