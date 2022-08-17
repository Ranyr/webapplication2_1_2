<%-- 
    Document   : prtr
    Created on : 24 Mar, 2022, 3:59:34 PM
    Author     : radhika
--%>

<%@page import="java.util.List"%>
<%@page import="com.catbean"%>
<%@page import="com.catdao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="prtr">
        <%
          catdao dd=new catdao();
           List <catbean>ls=dd.getAllRecords();
        
        %>
        
        
        <table>
             <tr> <td>pdnm</td><td><input type="text" name="nm"></td>
            <tr>
                <td>
                <select name="id"  id="id">
                    <%
                    for(catbean c:ls){
                    %>
                     <option value="<%= c.getid()%>"><%= c.getname()%></option>
                   <% } %>
                </select>
                </td>
            </tr>
            <tr>
                <td><input type="submit" name="b1" value="click here"></td>
            </tr>
        </table>  
                
            </form>    
    </body>
</html>
