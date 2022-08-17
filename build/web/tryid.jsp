<%-- 
    Document   : tryid
    Created on : 29 Mar, 2022, 12:08:47 PM
    Author     : radhika
--%>
<%@page import="java.util.List"%>
<%@page import="com.productbean1"%>
<%@page import="com.pdao1"%>
<%@page import="com.catbean"%>
<%@page import="com.catdao"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="common_css_jsp.jsp"%> <%@include file="nav_header.html"%>


<!DOCTYPE html>
<html>
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
         
    

          %>
       
           <div class="row 4">
         
            <!--show category-->
           <div class="col-md-2">
               
               <div class="list-group mt-4">
                   
                   
         <h3 class="list-group-item list-group-item-action active"> All Categories </h3>
                
                 
                       
       <!--In order to display  CATEGORIES on side bar-->              
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
                                
                                
                                <div class="card">
                                 
                                    <div class="card-body">
                                    <h5 class="card-title"><%=pp.getFooditem()%></h5> 
                                    </div> 
                                     
     
                                </div>
                                    
                                    
                           <div class="card-footer">
                   
                      <button class="btn btn-outline-primary ">Add To Cart</button> 
                     <button class="btn btn-success">Rs.<%=pp.getPrice()%></button>
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
