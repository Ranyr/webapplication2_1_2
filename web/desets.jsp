<%-- 
    Document   : desets
    Created on : 27 May, 2020, 11:07:52 PM
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
			
if(clickedButton.name==="b1")
{

alert("b1");

document.myfm.action="desert1_order.jsp";

}
		
else if(clickedButton.name==="b4")
				
{

alert("b4");
				
document.myfm.action="desert4_order.jsp";
	
}
				
else if(clickedButton.name ==="b5")
				
{

alert("b5");
			
document.myfm.action="desert5_order.jsp";
				
}


document.myfm.submit();
				
}

	
</script>
 
 <form name="myfm">
    <body>
      <div id="div1">
    <table border="0" align="Center"><tr><th><font color="white">DESERTS</th></tr></table>
</div>
<table style="border:1"  align="Center" cellspacing="20" id="table1">
     <tr style="align:Center"><img src="gulabjamun.jpg" align="Center" id="img"></tr>
<tr align="Center"><th><b><u><font color="#A378B">HOT DESERTS</u></b></th></tr>
            
<tr><td><i><input type="text" name="s1" value="Gazar Halwa(kg)"></i></td>
    <td><input type="text"  name="t1" size="3" value="150"></td><td><input type="button" name="b1" value= "go" onClick=submitForm(this) /></td></tr>
    
   
    <tr align="Center"><th><b><u><font color="#A378B">COLD DESERTS</u></b></th> </tr>
           
    
      
    <tr><td><i><input type="text" name="s4" value="Ice Cream"></i></td>
        <td><input type="text"  name="t4" size="3" value="35"></td><td><input type="button" name="b4" value= "go" onClick=submitForm(this) /></td></tr>
            
        <tr><td><i><input type="text" name="s5" value="Chocolate cake"></i></td>
            <td><input type="text"  name="t5" size="3" value="350"></td><td><input type="button" name="b5" value= "go" onClick=submitForm(this) /></td></tr>
            
    </body>
    </form>
</html>
