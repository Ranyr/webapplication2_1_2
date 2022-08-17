<%-- 
    Document   : dispic
    Created on : 30 Apr, 2022, 4:33:02 PM
    Author     : radhika
--%>

<%@page import="com.photodao"%>
<%@page import="com.photobean"%>
<%@page import="com.User"%>
<%@page import="com.cartbean"%>
<%@page import="com.catdao"%>
<%@page import="com.catbean"%>
<%@page import="java.util.*"%>

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
            photodao pd=new photodao();
           List<photobean> plist=null; 
             plist=pd.getdatabyctg(catnm);
         out.println(plist.size());
    
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
     <a href="dispic.jsp?id=<%= c.getname()%>" class="list-group-item list-group-item-action"><%= c.getname()%></a>
  
     
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
                                 for(photobean pp:plist)
                                 {
                                %>
                               
                                <div class="card" style="width: 16rem;">  
                                 <div class="container text-center">
                                     <img src="C:\Users\radhika\Documents\NetBeansProjects\WebApplication2_1_2\build\web\img\<%= pp.getPhoto()%>"  alt="myimage" style="width:200px;height:150px;" class="card-img-top" />
                                     </div>
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
