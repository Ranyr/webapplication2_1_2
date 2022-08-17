<%-- 
    Document   : prom1
    Created on : 27 Apr, 2022, 10:09:45 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
int oid= (int)session.getAttribute("oid2");out.println("oid= "+oid);
 session.setAttribute("oid3",oid);
 
double p1=(double)session.getAttribute("p11"); out.println("p1= "+p1);
//session.setAttribute("p12",p1);

double t1=p1*10/100; out.println("t1= "+t1);
double t2=p1-t1 ; out.println("t2= "+t2);
session.setAttribute("total1",t2);
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
  margin: auto;
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
  <img src="prom101.jpg" alt="Avatar" style="width:100%;">
  <div class="container" style="background-color:white">
    <h2><b> 10% off on minimum order of RS.50 </b></h2> 
    <p></p>
 </div>
   
<div class="container">
  <table style="border:1"  cellpadding="4">
    
      <tr><td align="left">Use Promo Code: <input type="text" name="t1" value="S2136" class="promo"></td></tr>
      
     
      <tr><td align="right"><input type="submit" value="apply" name="b1"></td></tr>
  </table>
</div>
  </div>
    
</form>
</body>

</html> 


