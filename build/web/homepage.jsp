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
}
input[type=text]
{
    width:100%;
    padding:12px,20px;
    box-sizing:border-box;
    border-color:black;
    color:blue;
    border-radius:25px;
    height:25px;
    
}
input[type="text"]::placeholder{ text-align:center;
 color:blue;}
</style>
       </head>
    <body>
       
        <%@ include file="home_header.html" %> 
        <form action="./rest">

<div class="container">
  <img src="blackbg4.jpg" alt="food" style="width:100%;">
  
  <div class="centered"><input type="text" name="t1" placeholder="Location">
      <input type="submit" value="go"></div>
</div>
            </form>
<%@ include file="footer1.html" %>
      
    </body>
</html>
