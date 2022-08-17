<%-- 
    Document   : sandwich
    Created on : 27 May, 2020, 11:14:41 PM
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
            width:359px;
            margin-left:494px;
            margin-top:60px;
            background-color:rgb(202,174,183);
            cellpadding:25;
             }
             #table1{
            background-color:rgb(255,250,250);
            margin-left:494;
            width:355px;
             border-bottom:1px solid palevioletred;
        } 
        #img{
            margin-left:494px;
            width:359px;
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

document.myfm.action="san_order1.jsp";

}
		
else if(clickedButton.name==="button2")
				
{

alert("button2");
				
document.myfm.action="san_order2.jsp";
	
}
				
else if(clickedButton.name ==="button3")
				
{

alert("button3");
			
document.myfm.action="san_order3.jsp";
				
}

document.myfm.submit();
				
}

	
</script>
    <body>
         <form name="myfm">
        <div id="div1">
            <table border="0" align="Center"><tr><th><font color="white">SANDWICHES</th></tr></table>
</div>
    <table style="border:1"  align="Center" cellspacing="20" id="table1">
             
<tr style="align:Center"><img src="sand1.png" align="Center" id="img"></tr>
        
           
      
       
        <tr><td><i><input type="text" name="s1" value="Veg Grill"></i></td>              
            <td><input type="text"  name="t1" size="4" value="100" readonly="readonly"></td>
        <td><input type="button" name="button1" value= "go" onClick=submitForm(this) /></td></tr>
       
        <tr><td><i><input type="text" name="s2" value="Veg paneer grill"> </i></td>            
            <td><input type="text"  name="t2" size="4" value="120" readonly="readonly"></td>
        <td><input type="button" name="button2" value= "go" onClick=submitForm(this) /></td></tr>
       
       
        
        
        
        
        <tr><td><i><input type="text" name="s3" value="Garlic cheese grill"> </i></td>             
            <td><input type="text"  name="t3" size="4" value="120" readonly="readonly"></td>
        <td><input type="button" name="button3" value= "go" onClick=submitForm(this) /></td></tr>
        
             
        
        
    </table>
    </form>
        
        
       
    </body>
</html>
