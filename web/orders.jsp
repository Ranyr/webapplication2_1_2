<%-- 
    Document   : orders
    Created on : 27 Mar, 2022, 9:10:07 PM
    Author     : radhika
--%>

<%@page import="java.util.*"%>
<%@page  import="java.util.Collections.*"%>
<%@page import="com.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="com.User"%>
<%@page import="com.orderdao"%>
<%@page import="com.userdao" %>
<%@page import="com.orderfood" %>

<%
  
   ArrayList<cartbean>cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
 
 if(cart_list != null)
 {   
     session.setAttribute("cart_list",cart_list);
      
 }

  
 //in order to show My Orders to user   
    
User umo=(User)session.getAttribute("user");

List <orderfood> lst=null;
if(umo != null)
{
  request.setAttribute("umo1",umo);
  orderdao od1=new orderdao();
  od1.userorders(umo.getUid());
  
}
else{response.sendRedirect("letlo1.jsp");}

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
      
        <%@include file="navvheader.jsp" %>
        <%@include file="common_css_jsp1.jsp"%>
    </head>
    <body>
       <div class="container">
           <div class="card-header my-3">All Orders</div>
       <table class="table table-Loght">
              <thead>
                  <tr>
                       <th scope="col">Order Date</th>
                      <th scope="col">Name</th>
                          <th scope="col">Category</th>
                           <th scope="col">Quantity</th>
                           <th scope="col">Price</th>
                             <th scope="col">Cancel</th>
                      
                      
                  </tr>
                  
              </thead>
             
              
              
              
              <tbody>
                
               </tbody>
                 

                  
                  
                  
              
       </table>
        </div>
    </body>
    <%@include  file="footer1.html" %>
</html>
