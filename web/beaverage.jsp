<%-- 
    Document   : beaverage
    Created on : 27 May, 2020, 10:27:10 PM
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
            width:355px;
            margin-left:494px;
            margin-top:60px;
            background-color:rgb(202,174,183);
            cellpadding:25;
             }
             #table1{
            background-color:rgb(255,250,250);
             border-bottom:1px solid palevioletred;
              
            margin-left:494;
            width:355px;
        }                      
         #img{
            margin-left:494px;
            width:355px;
            height:270px;
        }
        
        </style>
    </head>
    
    

     <script>


		
function submitForm(clickedButton)

{
			
if(clickedButton.name==="button1")
{

alert("button1");

document.myfm.action="drink1_order.jsp";

}
		
else if(clickedButton.name==="button2")
				
{

alert("button2");
				
document.myfm.action="drink2_order.jsp";
	
}
				
else if(clickedButton.name ==="button3")
				
{

alert("button3");
			
document.myfm.action="drink_order3.jsp";
				
}
else if(clickedButton.name==="button4")
				
{

alert("button4");
			
document.myfm.action="drink4_order.jsp";
				
}


document.myfm.submit();
				
}

	
</script>
 <body bgcolor="#FDD4C1">
<form name="myfm">
   
        <div id="div1">
    <table border="0" align="Center"><tr><th><font color="white">BEVERAGES</th></tr></table>
</div>
<table style="border:1"  align="Center" cellspacing="20" id="table1">
     <tr style="align:Center"><img src="cold.jpg" align="Center" id="img"></tr>
<tr align="Center"><th><b><font color="#A378B">COLD BEVERAGES</b></th></tr>
            


<tr><td><i><input type="text" name="s1" value="Milk Shakes"></i></td>
        <td><input type="text"  name="t1" size="4" value="80" readonly="readonly"></td>
<td><input type="button" name="button1" value= "go" onClick=submitForm(this) /></td></tr>

<tr><td><i><input type="text" name="s2" value="Cold COffee vanillia"></i></td>
        <td><input type="text"  name="t2" size="4" value="80" readonly="readonly"></td>
<td><input type="button" name="button2" value= "go" onClick=submitForm(this) /></td></tr>
    
    
    <tr align="Center"><th><b><font color="#A378B">HOT BEVERAGES</b></th> </tr>
           
   
        
    <tr><td><i><input type="text" name="s3" value="Coffie Plain"></i></td>
            <td><input type="text"  name="t3" size="4" value="40" readonly="readonly"></td>
    <td><input type="button" name="button3" value= "go" onClick=submitForm(this) /></td></tr>
    
    <tr><td><i><input type="text" name="s4" value="Chocolate Milk"></i></td>
                <td><input type="text"  name="t4" size="4" value="50" readonly="readonly"></td>
    <td><input type="button" name="button4" value= "go" onClick=submitForm(this) /></td></tr>
   </table>         
            
      </form> 
</body>
</html>
