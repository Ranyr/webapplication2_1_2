<%-- 
    Document   : pizza
    Created on : 27 May, 2020, 11:45:54 PM
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
            width:510px;
            margin-left:494px;
            margin-top:60px;
            background-color:rgb(202,174,183);
            cellpadding:25;
             }
             #table1{
            background-color:rgb(255,250,250);
            margin-left:494px;
            width:510px;
             border-bottom:1px solid palevioletred;
        } 
        #img{
            margin-left:494px;
            width:510px;
            height:240px;
            
        } 
        
        
        </style>
    </head>
     <script>


		
function submitForm(clickedButton)

{
			
if(clickedButton.name ==="button1")
{

alert("button1");

document.myfm.action="pizza1_order.jsp";

}
		
else if(clickedButton.name ==="button2")
				
{

alert("button2");
				
document.myfm.action="pizza2_order.jsp";
	
}
				

document.myfm.submit();
				
}
</script>
    
    <body>
    <form name="myfm">
        <div id="div1">
            <table border="0" align="Center"><tr><th><font color="white">PIZZA</th></tr></table>
</div>
    <table style="border:1"  align="Center" cellspacing="20" id="table1">
             <tr style="align:Center"><img src="pizza.jpg" align="Center" id="img"></tr>

             <tr> <th><font color="#A378B5"><b>Variety</b></th><th><font color="#A378B5"></th> <th><font color="#A378B5"><b>Size</b></th><th><font color="#A378B5"></th></tr>
   
   <tr><td><i><input type="text" name="s1" value="Plain Cheese"></i></td>
       <td><input type="text"  name="t1" size="4" value="210"></td>
      
           <td> <input type="button" name="button1" value= "go" onClick=submitForm(this) /> </td> </tr>
          
   
   <tr><td><i><input type="text" name="s2" value="Spicy Delight"></i></td><td><input type="text"  name="t2" size="4" value="130"></td>
       
            <td> <input type="button" name="button2" value= "go" onClick=submitForm(this) /> </td></tr>
  
   
            
    
    </table>
    </form>
    </body>
</html>
