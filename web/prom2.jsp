<%-- 
    Document   : prom2
    Created on : 27 Apr, 2022, 10:10:02 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
int oid= (int)session.getAttribute("oid2");out.println("oid= "+oid);
 session.setAttribute("oid3",oid);
 
double p1=(double)session.getAttribute("p11"); out.println("p1= "+p1);
session.setAttribute("p12",p1);

double t1=p1*15/100;
double total=p1-t1 ;
session.setAttribute("total1",total);
%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial;
}

.coupon {
  border: 5px dotted #bbb;
  width: 80%;
  border-radius: 15px;
  margin: 0 auto;
  max-width: 600px;
}

.container {
  padding: 2px 16px;
  background-color: #f1f1f1;
}

.promo {
  background: #ccc;
  padding: 3px;
}


</style>
</head>
<body>
    <form action="add1.jsp">
<div class="coupon">
  <div class="container">
    <h3>Special Offer</h3>
         
  </div>
  <img src="promo15.jpg"  alt="Avatar" style="width:100%;">
  <div class="container" style="background-color:white">
    <h2><b>GET 15% OFF on minimum order of Rs.150 </b></h2> 
    <p></p>
  </div>
  <div class="container">
      <table style="border:1"  cellpadding="4">
      <tr><td align="left">Use Promo Code: <input type="text" name="t1" value="S2133" class="promo" disabled></td></tr>
      <tr><td align="right"><input type="submit" value="apply" name="b1"></td></tr>
    </table>
  </div>
</div>
    
</form>
</body>
</html> 
