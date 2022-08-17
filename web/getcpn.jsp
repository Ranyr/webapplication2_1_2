<%-- 
    Document   : getcpn
    Created on : 27 Apr, 2022, 8:32:23 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
 int oid= (int)session.getAttribute("oid1");out.println("oid= "+oid);
 session.setAttribute("oid2",oid);
 
double p1=(double)session.getAttribute("pp11"); out.println("p1= "+p1);
session.setAttribute("p11",p1);

if((p1>=50)&&(p1<150)){response.sendRedirect("prom1.jsp");} //10%
else if((p1>=150)&&(p1<300)){response.sendRedirect("prom2.jsp");}// 15%
else if((p1>=300)&&(p1<=400)){response.sendRedirect("prom3.jsp");}//20%
else{response.sendRedirect("prom.jsp");}// 25%
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
