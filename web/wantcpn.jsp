<%-- 
    Document   : wantcpn
    Created on : 27 Apr, 2022, 8:26:28 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
int oid=(int)session.getAttribute("oo"); out.println("oid= "+oid);
session.setAttribute("oid1",oid);  

double pp1=(double)session.getAttribute("pp");out.println("pp1= "+pp1);
session.setAttribute("pp11",pp1);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
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
    <form action="getcpn.jsp">
<div class="coupon">
  <div class="container">
    <h3>Hurry Up!! Use Discount Coupons</h3>
        
  </div>
  <img src="promomain1.jpg" alt="Avatar" style="width:100%;">
  <div class="container" style="background-color:white">
  </div>
  <div class="container">
      <table style="border:1"  cellpadding="4">
      
      <tr><td align="right"><input type="submit" value="Have a look At discount coupons" name="b1"></td></tr>
    </table>
  </div>
</div>
    
</form>
</body>
</html>
