<%-- 
    Document   : showorder
    Created on : 2 Apr, 2022, 3:45:45 PM
    Author     : radhika
--%>

<%@page import="com.Orderdao"%>
<%@page import="com.pdao1"%>
<%@page import="com.Order"%>
<%@page import="java.util.List"%>
<%@page import="com.cartbean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="common_css_jsp1.jsp" %>
<%@include file="navvheader.jsp"%>

<%
        // In order to show count of no._of_cart_items_icon on all pages  include this java code
         ArrayList<cartbean>cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
 
 if(cart_list != null)
 {   
     request.setAttribute("cart_list",cart_list);
      
 }    
    
    
List<Order> lst=null;
User ul=(User)session.getAttribute("user");
if(ul != null)
{
  //lst=Orderdao.disporder(ul.getUid());//display order by emailid
    lst=Orderdao.disporder(ul.getEmail());
 int sk= lst.size();
 if(sk>0){out.println("yesss"+sk);} //comment
 else{out.println("no");}  //comment
}
else
{response.sendRedirect("lablo1.jsp");}

double po=(double)session.getAttribute("tt3"); 
out.println("discount price= "+po);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="container">
            <div class="card-header my-3">All Orders</div>
            <table class="table table-Loght">
                <thead>
                    <tr>
                        <td scope="col">Date</td>
                        <td scope="col">Name</td>
                        <td scope="col">food item</td>
                        <td scope="col">Quantity</td>
                        <td scope="col">Price</td>
                        <td scope="col">contact No.</td>
                        <td scope="col">Address</td>
                        <td scope="col">Cancel</td>
                    </tr>
                </thead> 
                <tbody>
                    <%
                    
                        if(lst.size()>0)
                        {
                          for(Order o:lst)
                          {  %>
                          <tr>
                             
                              <td><%= o.getDate()%></td>
                              <td><%=o.getName()%></td>
                              <td><%=o.getFooditem()%></td>
                              <td><%=o.getQuantity()%></td>
                              <td><%= po%></td>
                              <td><%= o.getContact_no()%></td>
                              <td><%= o.getAddress() %></td>
                              <td><a href="cancelorderservlet?orderid=<%= o.getOrderid()%>" class="btn btn-danger">Cancel</a></td>
                          </tr>  
                          
                         <% }
                        }
                    
                    
                    %>
                </tbody>
                
            </table>
        </div>
        
        
    </body>
    <%@include file="footer1.html"%>
</html>
