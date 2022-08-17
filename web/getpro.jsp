<%-- 
    Document   : getpro
    Created on : 28 Mar, 2022, 7:17:04 PM
    Author     : radhika
--%>


<%@page import="com.cartbean"%>
<%@page import="com.catdao"%>
<%@page import="com.catbean"%>
<%@page import="java.util.*"%>
<%@page import="com.pdao1"%>
<%@page import="com.productbean1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
  User userprod=(User)session.getAttribute("user"); //session coming from indexlet.jsp(login servlet)
  if(userprod !=null)
  {    
     out.println(userprod.getName());
     out.println(userprod.getUid());
    request.setAttribute("userprod1",userprod);
  }  

%>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <%@include  file="common_css_jsp.jsp"%>
            <%@include file="navvheader.jsp"%>
    </head>
    
     
  
    
    <body>
        
        <div class="container-fluid">
        
        
         <%
              String catnm= request.getParameter("id");  //1 2 3 allproducts=all
             //out.println(catnm);
            
            
            // side bar for categories
           catdao ct=new catdao();
           List<catbean> ctlist=ct.getAllRecords();
        
         
         
         // products based on selected categories
            pdao1 pd=new pdao1();
           List<productbean1> plist=null; 
             plist=pd.getAllRecordsbyctnm(catnm);
         
    
//IN order to show cart_list().size()on cart icon include following lines on all pages(letlo1.jsp,getpro.jsp,orders.jsp,cart.jsp)

 ArrayList<cartbean>cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
 
 if(cart_list != null)
 {   
     session.setAttribute("cart_list",cart_list);
      
 }

          %>
       
        <div class="row 4">
         
            <!--show category-->
           <div class="col-md-2">
               
               <div class="list-group mt-4">
                   
                   
         <h3 class="list-group-item list-group-item-action active"> All Categories </h3>
                
                 
                       
       <!--In order to display  CATEGORIES on side bar---- category names r fetched here-->              
       <%
     for(catbean c:ctlist)
     { %>
     <a href="getpro.jsp?id=<%= c.getname()%>" class="list-group-item list-group-item-action"><%= c.getname()%></a>
  
     
    <% }%>        
                   
 
           </div>
             
           </div> 
           <!--show products-->
               <div class="col-md-8">
                   <!--row-->
                   <div class="row mt-4">
                        <!--col-->
                        <div class="col-md-12"> 
                            <div class="card-columns">
                            
                               
                                <%
                                 for(productbean1 pp:plist)
                                 {
                                %>
                               
                                <div class="card" style="width: 16rem;">  
                                 
                                    <div class="card-body">
                                    <h5 class="card-title"><%=pp.getFooditem()%></h5> 
                                    <h6 class="price">Rs.<%= pp.getPrice()%></h6>
                                    </div> 
                                     
                          <div class="card-footer">          
                              <a href="NewServlet?pid=<%=pp.getPid()%>" class="btn btn-outline-primary">Add to Cart</a> 
                              <a  class="btn btn-success"  href="orderservlet?quantity=1&pid=<%= pp.getPid()%>&price=<%=pp.getPrice()%>">Buy Now</a> 
                                    
                            </div>        
                             
                                 </div>
                                 </div>
                     
                    </div>  
                                    
                                    
                               </div>  
                                
                                
                                <%}%>  
                            </div> 
                            
                       </div> 
                       
                       
                       
                  </div>
           
           
        
                   
                   
               </div>
           
           
           
         </div>  
    </body>
</html>