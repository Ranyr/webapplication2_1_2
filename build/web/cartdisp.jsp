<%-- 
    Document   : cart
    Created on : 28 Mar, 2022, 5:52:14 PM
    Author     : radhika
--%>


<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.productbean1"%>
<%@page import="com.ConnectionUtil"%>
<%@page import="com.pdao1"%>
<%@page import="com.cartbean"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>




  <%
        User userc = (User)session.getAttribute("user");
        if(userc != null)  //if user is present then only cart page is accessible
        {  
            out.println("ses is present in cart page"); //comment
            session.setAttribute("userc1",userc);
         
          //if no user is present(user is null) then only login.jsp page is shown
        }
        else{
        
            out.println("In order to see cart page plz login first");
            response.sendRedirect("lablo1.jsp"); 
        }
     
   %>  

   <%
   ArrayList<cartbean> cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
   List<cartbean> ctproduct=null;
   if(cart_list != null)
   {
     
     ctproduct= pdao1.getctproducts(cart_list);
      session.setAttribute("cart_list",cart_list);
    
    double total=pdao1.gettotalcartprice(cart_list);
    session.setAttribute("total",total);
   }
   
   %>  
     
     


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carts are here</title>
        <%@include file="navvheader.jsp"%>
            <%@include file="common_css_jsp1.jsp"%>
            <style type="text/css">
                
                .table tbody td{ vartical-align: middle;}
                .btn-incre,.btn-decre{box-shadow: none;font-size:16px;}
                
            </style>
    </head>
    <body>

       
       <div class="container">
          <div class="d-flex py-3"><h3>Total Price :Rs. ${(total >0)?total:0} </h3><a class="mx-3 btn btn-primary" href="checkoutservlet">Check Out</a></div>
          <table class="table table-Loght">
              <thead>
                  <tr>
                      <th scope="col">Name</th>
                          <th scope="col">Category</th>
                           <th scope="col">Price</th>
                            <th scope="col">Buy Now</th>
                             <th scope="col">Cancel</th>
                      
                      
                  </tr>
                  
              </thead>
              <tbody>
                  
      
                  <%
                  
                  if(cart_list != null)
                  {
                     for(cartbean t:ctproduct)//cartrow is fetched here----pdao1.getctproducts()
                     {       %>
                        
                              <tr>
                      <td><%= t.getFooditem()%></td>
                       <td><%= t.getId()%></td>
                       <td><%= t.getPrice()%></td>   
                       <td>
                           
                           <form action="orderservlet" method="post" class="form-inline">
                              
                         
                             <input type="hidden" name="pid" value="<%=t.getPid()%>" class="form-input">
                             <input type="hidden" name="price" value="<%=t.getPrice()%>" class="form-input">
                        <div class="form-group d-flex justify-content-between"> 
                            
                            <a class=" btn btn-sm btn-incre" href="increase?lol=inc&pid=<%=t.getPid()%>">
                          
                                <i class="fas fa-plus-square"></i>
                            </a>
                            <input type="text" name="quantity" value="<%=t.getQuantity()%>" class="form-control" readonly>    
                                
                                
                            
                            <a class="btn btn-sm btn-decre" href="increase?lol=dec&pid=<%= t.getPid()%>"><i class="fas fa-minus-square"></i></a>  
                         <button type="submit" class="btn btn-primary">BUY</button> 
                        
                        </div>
                           </form>
                         
                       </td>
                     
                       
                       <td><a class="btn btn-sm btn-danger" href="rmservlet?pid=<%=t.getPid()%>">Remove</a></td>
                    
                 </tr>
                     
                     
                     
                  <%   }
                  
                  }
                  
                  
                  %>
                  
   
                              
         
        
                     
               
                
             
                  
                  
              </tbody>
              
              
          </table>
       </div>
          
       
    </body>
    <%@include file="footer1.html"%>
</html>
