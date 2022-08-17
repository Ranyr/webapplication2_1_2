<%-- 
    Document   : restaurant
    Created on : 20 May, 2020, 8:31:54 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
       .header {
         text-align: center;
         padding: 32px;
         background-color:#ffad06;
             }
             * {
  box-sizing: border-box;
}

.column {
  float: left;
  
  padding:15px;
  align:center;
  text-align:Center;
  color:pink;
}

/* Clearfix (clear floats) */
.row::after {
  content:"";
  clear: both;
  display: table;
  padding:5px;
  align:center;
}
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     </head>
    <body>
        <div><%@ include file="header.html" %></div>
      
        <div class="header">
  <h1>Choose Restaurant</h1>
</div>
        
   <div class="row">
  <div class="column">
    <img src="rest2.jpg" alt=china style="width:210" height="210"><br>
    <a href="dominoz-front.jsp" >Domino's pizza</a>
  </div>
  <div class="column">
    <img src="rest.jpg" alt="india" style="width:210" height="210"><br>
    <a href="kesar-restro.jsp">Kesar's restro</a>  
  </div>
      <div class="column">
    <img src="urban_cort.jpg" alt="india" style="width:210" height="210"><br> 
    <a href="urboo.jsp">The Urban Courtyard</a>
  </div>
       <div class="column">
    <img src="sanjha-chulha.jpg" alt="pizza" style="width:210" height="210"><br>
    <a href="sanja-chulha.jsp">Sanjha Chulha</a>
  </div>
</div>
    
    
    <div class="row">
        <div class="column">
    <img src="novelty.jpg" alt="burger" style="width:210" height="210"><br>
    <a href="novelty-front.jsp" style="text-align:Center">Novelty Sweets</a> 
  </div>
        <div class="column">
   <img src="urban_cort.jpg" alt="jatt" style="width:210" height="200"><br>
   
     <a href="punjabiirest.jsp">Punjabi Dhaba</a>
  </div>
<div class="column">
    <img src="rest2.jpg" alt="cont" style="width:210" height="210"><br>
     <a href="hoppers.jsp">Hoppers</a>
  </div> 
         <div class="column">
    <img src="balle.jpg" alt="india" style="width:210" height="210"><br>
    <a href="balle-restro.jsp">Balle Balle </a>  
  </div>
        
        </div>
    

    
    
    
<div class="row">
  
  <div class="column">
    <img src="balle.jpg" alt="balle" style="width:170" height="210"><br>
     <a href="bro.jsp">Brothers Dhaba</a>
  </div>
  <div class="column">
    <img src="littlechef1.jpg" alt="littlechef1" style="width:210" height="210"><br>
     <a href="littlechef-restro.jsp"> The Little Chef </a>
  </div>
    <div class="column">
    <img src="rest.jpg" alt="india"  style="width:210" height="210"><br>
    <a href="amrit-restro.jsp">Amrit Dhaba</a>  
  </div>
    <div class="column">
    <img src="rest2.jpg" alt="main" style="width:210" height="210"><br>
     <a href="sagar-ratna.jsp">Sagha ratana</a>
  </div>
</div>
    
            
         <div><%@ include file="footer.html" %></div> 
    </body>
</html>
