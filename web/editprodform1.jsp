<%-- 
    Document   : editcatform
    Created on : 24 Mar, 2022, 6:28:40 PM
    Author     : radhika
--%>

<%@page import="java.io.*"%>
<%@page import="java.util.List"%>
<%@page import="javax.servlet.*" %>
<%@page import="javax.servlet.http.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>
<%@page import="com.pdao1,com.productbean1,com.ConnectionUtil"%>
<%@ include file="admin_header.html" %>
<%
//String id=request.getParameter("id");
int pid=Integer.parseInt(request.getParameter("pid"));
productbean1 ct1=pdao1.getRecordByid(pid);
%>

<h1>Edit Form</h1>
<!--<form action="editprodtuser1.jsp"> -->


 <form action="editproduser1.jsp" >
     <input type="hidden" name="pid" value="<%= ct1.getpid()%>" />
<table>
  
<tr><td>product name</td><td><input type="text" name="name" value="<%= ct1.getname()%>"/></td></tr>

  
        <%  
//In order to get all categories from cat table ,and in order to show those all categories in drop down menu at prodform.jsp 
           pdao1 dd=new pdao1();
           List <productbean1>ls=dd.getAllRecords();
        
        %>
       
           
            
        
         <tr><td>Product Category </td>
                <td>
                <select name="id"  id="id">
                    <%
                    for(productbean1 c:ls){
                    %>
                     <option value="<%= c.getid()%>"><%= c.getname()%></option>
                   <% } %>
                </select>
                </td>
          </tr>



<tr><td>Quantity</td><td><input type="text" name="name" value="<%= ct1.getquantity()%>"/></td></tr>
<tr><td>Price</td><td><input type="text" name="name" value="<%= ct1.getprice()%>"/></td></tr>
<!--<tr><td>Product photo</td><td><input type="file" name="ppic" value=""></td></tr>  -->


<tr><td><input type="submit" value="Edit Category"></td></tr>
</table>
</form>


<%
    
    
  


%>


<%@ include file="footer1.html" %>
</body>
</html>

