<%-- 
    Document   : addprosuccess
    Created on : 23 Mar, 2022, 11:46:22 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> product added Success</title>

<style>
    
* {
  box-sizing: border-box;
  }
    
.column {
  float:Center;
  
  padding:15px;
  align:center;
  text-align:Center;
  color:pink;
}

.row::after {
  content:"";
  clear: both;
  display: table;
  padding:5px;
  align:center;
}

</style>
</head>
<body>
<%@ include file="admin_header.html" %>
    <h1><center>sorry for Inconvience</center></h1>
  <div class="row">
  <div class="column">
    <img src="addproo.jpg" alt="addprooimage" style=width:270 height=210><br>
    <a href="addprodform1.jsp"><h3><center>Try Again </center></h3></a>
  </div>
  </div>

<%@ include file="footer1.html" %>
</body>
</html>