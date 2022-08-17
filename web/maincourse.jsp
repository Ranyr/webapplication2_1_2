<%-- 
    Document   : maincourse.jsp
    Created on : 27 May, 2020, 4:32:17 PM
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
            cellpadding:25px;
             }
             #table1{
            background-color:rgb(255,250,250);
            margin-left:494px;
            width:355px;
             border-bottom:1px solid palevioletred;
        }                      
        
        
        </style>
        </head>
        <script>


		
function submitForm(clickedButton)

{
			
if(clickedButton.name==="button1")
{

alert("button1");

document.myfm.action="main1_order.jsp";

}
		
else if(clickedButton.name==="button2")
				
{

alert("button2");
				
document.myfm.action="main2_order.jsp";
	
}
				

else if(clickedButton.name==="button4")
				
{

alert("button4");
			
document.myfm.action="main4_order.jsp";
				
}
else if(clickedButton.name==="button5")
				
{

alert("button5");
			
document.myfm.action="main5_order.jsp";
				
}

document.myfm.submit();
				
}

	
</script>
	
    
     <body >
         <form name="myfm">
        <div id="div1">
            <table border="0" align="Center"><tr><th><font color="white">MAIN COURSE</th></tr></table>
</div>
    <table style="border:1"  align="Center" cellspacing="20" id="table1">
        
        
        
        
        <tr><td><i><input type="text" name="s1" value="Mushroom chicken" readonly="readonly"></i></td>
            <td><input type="text"  name="t1" value="300" size="4" readonly="readonly"></td>
            <td><input type="button" name="button1" value= "go" onClick=submitForm(this) /> </td></tr>
        
        
        <tr><td><i><input type="text" name="s2" value="Breaded Chicken Supreme" readonly="readonly"></i></td>
            <td><input type="text"  name="t2" value="165" size="4" readonly="readonly"></td>
            <td><input type="button" name="button2" value= "go" onClick=submitForm(this) /></td></tr>
     
       
        <tr><td><i><input type="text" name="s4" value="French fries" readonly="readonly"></i></td>
              <td><input type="text"  name="t4" value="99" size="4" readonly="readonly"></td>
              <td><input type="button" name="button4" value= "go" onClick=submitForm(this) /></td></tr>
        
        <tr><td><i><input type="text" name="s5" value="Cheese hot dog" readonly="readonly" ></i></td>
              <td><input type="text"  name="t5" value="95" size="4" readonly="readonly"></td>
              <td><input type="button" name="button5" value= "go" onClick=submitForm(this) /></td></tr>
          
    </table>
    </form>
        
    </body>
</html>
