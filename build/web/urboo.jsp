<%-- 
    Document   : homepage
    Created on : 20 May, 2020, 6:07:03 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
.container {
  position: relative;
  text-align: center;
  color: white;
}



.centered {
  position: absolute;
  top: 35%;
  left: 50%;
  transform: translate(-50%, -50%);
  color:white;
}
</style>
       </head>
    <body>
        
        <%@ include file="header.html" %> 
        

<div class="container">
  <img src="urban.jpg" alt="food" style="width:100%">
  
  <div class="centered">
  
  </div>
  </div>
<%@ include file="footer.html" %>
        
    </body>
</html>


