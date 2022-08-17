<%-- 
    Document   : burger
    Created on : 27 May, 2020, 11:31:50 PM
    Author     : radhika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <style>
       #div1{
            height:38px;
            width:538px;
            margin-left:380px;
            margin-top:60px;
            background-color:rgb(202,174,183);
            cellpadding:25;
             }
             #table1{
            background-color:rgb(255,250,250);
            margin-left:380px;
           width:538px;
             border-bottom:1px solid palevioletred;
        } 
        #img{
            margin-left:380px;
            width:538px;
            height:270px;
            background-color:rgb(255,250,250);
            
        }
        
        
        
        </style>
    </head>
    <script>


		
function submitForm(clickedButton)

{
			
if(clickedButton.name==="button1")
{

alert("button1");

document.myfm.action="bug_order1.jsp";

}
		
else if(clickedButton.name==="button2")
				
{

alert("button2");
				
document.myfm.action="bug_order2.jsp";
	
}
				



document.myfm.submit();
				
}

	
</script>
   
       <form name="myfm">
          <body>
        <div id="div1">
            <table border="0" align="Center"><tr><th><font color="white">BURGER</th></tr></table>
</div>
    <table style="border:1"  align="Center" cellspacing="20" id="table1">
             <tr style="align:Center"><img src="burger1.png" align="Center" id="img"></tr>

   <tr> <th><font color="#A378B5"><b>BURGER</b></th><th>
           
   <tr><td><i><input type="text" name="s1" value="Crispy Veg burger"></i></td>
       <td><input type="text"  name="t1" value="35" size="3"></td>
           <td><input type="button" name="button1" value= "go" onClick=submitForm(this) /> </tr>
   
            <tr><td><i><input type="text" name="s2" value="Crispy Chicken"></i></td>
                <td><input type="text" name="t2" value="49" size="3"></td>
              
            <td><input type="button" name="button2" value= "go" onClick=submitForm(this) /></td>
            </tr>
            
       </table>   
   
       </body>
     </form>
</html>
