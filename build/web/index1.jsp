<%-- 
    Document   : index1
    Created on : 28 Mar, 2022, 1:12:37 PM
    Author     : radhika
--%>

<%@page import="com.catbean"%>
<%@page import="com.catdao"%>
<%@page import="java.util.List"%>
<%@page import="com.pdao1"%>
<%@page import="com.productbean1"%>
<%@page import="com.User"%>
<%@page language="java"  contentType="text/html" pageEncoding="UTF-8" 
        isELIgnored="false"%>
<%@page import="com.userdao" %>
<%

 User user=(User)request.getSession().getAttribute("user");
  if(user != null)
  {out.println("ses is there");
    request.setAttribute("user",user);
  }

  
  else{out.println("not any ses");}

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         

   

        <%@include file="common_css_jsp.jsp" %> 


<%@include file="nav_header.html"%>
    </head>
    <body>
  <div class="container admin">
     
      <div class="row mt-3">
          
          
          <%
            catdao ct=new catdao();
            List<catbean> ctlist=ct.getAllRecords();
            
             pdao1 pd=new pdao1();
             List<productbean1> list = null;
           
            
             String catid= request.getParameter("id");
               
            
             out.println("cid= "+catid);
         list = pd.getAllRecordsbyctnm(catid);
            
          %>
            
     
          
           <div class="col-md-4">
               
               <div class="card">
                     
               <div class="card-body text-center">
                   <div class="container">
                       <img style="max-width:75px;" class="img-fluid rounded-circle" src="plus.png">
                   </div>
                     <h1><%= ctlist.size()%></h1>
                   <h1>categories</h1>
                 <% for(catbean c:ctlist)
      { %>
     <a href="index1.jsp?id=<%= c.getname()%>" ><%= c.getname()%></a>
  <%
  
  
  
  %>
     
    <% } %>
               </div>
                   
               </div>    
           </div>
          
          
          
           <div class="col-md-4">
               <div class="card">
               <div class="card-body text-center">
                     <div class="container">
                       
                   </div>
                   <h1>No. of Products is:</h1>
                   <h2>products : </h2>
                   <%
                      
                      for(productbean1 pp:list)
                      {  %> 
                       <h1><%= pp.getName()%></h1>
                      
                     <% } %>
                  
                   <h1>products</h1>
               </div>
                   </div>
           </div>
          
          
          
           <div class="col-md-4">
               <div class="card">
               <div class="card-body text-center">
                     <div class="container">
                       <img style="max-width:75px;" class="img-fluid rounded-circle" src="plus.png">
                   </div>
                   <h1>7890</h1>
                   <h1>users</h1>
               </div>
                   </div>
           </div>
      </div>
      </div>
      </div>
      
      
      
      
      
      
      
      
      
      
  </div>   
    </body>
       
</html>
