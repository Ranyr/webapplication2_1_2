<%-- 
    Document   : account
    Created on : 19 May, 2020, 9:19:50 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <style>  
        #div1{
            height:38px;
            width:359px;
            margin-left:494px;
            margin-top:100px;
            background-color:#FFDDCC;
            cellpadding:25;
            align:"center";
            
        }
        #table1{
            background-color:#FFF;
            margin-left:494px;
            width:359px;
             border-bottom:1px #FFDDCC;
            align:"center";
        }                      

        #btn
        {background-color:#FFDDCC;
          border-radius:15px;
           
        }
         .container {
         position: relative;
        text-align: center;
        color: white;
                    }
   .centered {
  position: absolute;
  top: 35%;
  left: 50%;
  transform: translate(-70%, -45%);
  color:white;
}
        
        
        </style>
    <body>
       <form action="uacc">
        
  <div> <%@ include file="header.html" %></div>
   
         <div class="container">
  <img src="blackbg4.jpg" alt="food" style="width:100%;">
      <div class="centered">
    <div id="div1">
    <table border="0" align="Center"><tr><th><font color="#8A9BA7">REGISTER</font></th></tr></table>
    </div>
      
            <table border="0" align="Center" id="table1" cellspacing="20"> 
            
            <tr>
            <td align="center"> <font color="black">First name</td>
            <td><input type="text"  name="t1" placeholder="first name" required></td>
            </tr>
            
        <tr>
        <td align="center"> <font color="black">Last name</td>
        <td ><input type="text" name="t2" placeholder="last name"></td>
        </tr>
        
        <tr>  
       <td align="center"><font color="black">City</td> 
       <td><input type="text" name="t3" placeholder="city"></td>
        </tr> 
        
        <tr>
       <td align="center"><font color="black"> Address</td> 
        <td><input type="text" name="t4" placeholder="permanent address" required></td>
        </tr>
        
        <tr>
        <td align="center"><font color="black">Contact no.</td>
        <td><input type="text" name="t5" placeholder="contact no." required></td> 
        </tr>
        
        <tr>
        <td align="center"><font color="black"> Email Address</td>
        <td><input type="text" name="t6" placeholder="email"></td> 
        </tr>
        
        <tr>
        <td align="center"> <font color="black">Username</td>
        <td><input type="text" name="t7" placeholder="username" required></td> 
        </tr>
        
        <tr>
        <td align="center"> <font color="black">Password</td>
        <td><input type="password" name="t8" placeholder="password" required></td> 
        </tr>
        
        <tr>
        <td align="center"> <font color="black">Confirm Password</td>
        <td><input type="password" name="t9" placeholder="Confirm password"></td>
        </tr>
        
        <tr>
       <td align="center" >
     <input type="submit" value="SIGN UP" id="btn"> </td>
     <td >  <input type="reset" value="RESET" id="btn"></td>
       </tr>
       </table>
          </div></div>
   <div> <%@ include file="footer1.html" %></div>
    </form>
    </body>
</html>
