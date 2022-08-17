<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <style>
        #div1{
            margin-left:498px;
            margin-top:23px;
            height:38px;
             background-color:rgb(202,174,183);
             width:335px;
        }
        input::placeholder{
          
            color:black; 
        }
       #btn
        {background-color:rgb(233,219,232);
          border-radius:15px;
            
        } 
      </style>
   </head>
    

       <body >
      <%
          HttpSession ses=request.getSession();
         String p1;
         p1=request.getParameter("t1");
         ses.setAttribute("z1",p1);     
      %>

      
     <form action="user_forgot_pass" >
         <div id="div1">
    <table border="0" align="Center"><tr><th>Set New Password</th></tr></table>
    </div>

    <table  border="0" align="Center" cellspacing="20" id="table1">
    
    <tr style="text-align:left"><td style="border:0">username</td>
        <td style="text-align:left">  <input type="text" name="t1" value="<%=p1%>" readonly="readonly" ></td></tr>
   
           
    <tr  style="text-align:left"><td style="border:0"> new password</td> 
    <td><input type="text" name="t2" placeholder="new password" required></td></tr>
    
     <tr  style="text-align:left"><td style="border:0">confirm password</td> 
         <td><input type="text" name="t3"  placeholder="Reenter password"></td></tr>
          
  
   
           <tr> <td style="border:0" align="Center" colspan="2"><input type="submit" value="Click Me" id="btn"> </td></tr>      
    </table>
 
        </form>
    </body>
</html>

