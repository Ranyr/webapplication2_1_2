<%-- 
    Document   : breakfast
    Created on : 27 May, 2020, 10:41:12 PM
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
            width:560px;
            margin-left:470px;
            margin-top:10px;
            background-color:rgb(202,174,183);
            cellpadding:5px;
            text-align:center;
             }
             #table1{
            background-color:rgb(255,250,250);
             border-bottom:1px solid #A378B5;
              
            margin-left:470px;
            width:560px;
        } 
        
         
        
        </style>
    </head>
    <script>


		
function submitForm(clickedButton)

{
			

		
else if(clickedButton.name==="button2")
				
{

alert("button2");
				
document.myfm.action="break_order2.jsp";
	
}
				
else if(clickedButton.name ==="button3")
				
{

alert("button3");
			
document.myfm.action="break_order3.jsp";
				
}
else if(clickedButton.name==="button4")
				
{

alert("button4");
			
document.myfm.action="break_order4.jsp";
				
}

else if(clickedButton.name==="button5")
				
{

alert("button5");
			
document.myfm.action="break_order5.jsp";
				
}



document.myfm.submit();
				
}

	
</script>
    <body>
        <form name="myfm">
       
            
            <div id="div1">
                <table border="0" align="Center" ><tr><td align="center" colspan="2">Breakfast</td></tr></table>
    </div>
            
  <table style="border:1"  align="Center" cellspacing="0" cellpadding="12" id="table1">
    

    <tr><td align="Center" colspan="3"><font color="#A378B5"><b><u>VEGETATION</u></b></td>
</tr>



<tr><td><i><input  type="text" value="Mutter Paneer" name="s2"></i></td>
    <td><input type="text" name="t2"  size="4" value="215" readonly="readonly"></td>
    
    <td><input type="button" name="button2" value= "go" onClick=submitForm(this) /></td></tr>
    
    <td><i><input  type="text" name="s3" value="Dal Makhani"></i></td>
    <td><input  type="text" name="t3" value="210" size="4" readonly="readonly"></td>
     <td><input type="button" name="button3" value= "go" onClick=submitForm(this) /></td> </tr>

<tr><td align="Center" colspan="3"><font color="#A378B5"><b><u>ROTIS</u><b></td> </tr>

                <tr><td><i><input  type="text" name="s5" value="Plain roti"></i></td>
                    <td><input type="text" name="t5"  size="4" value="12" readonly="readonly"></td>
                    <td><input type="button" name="button5" value= "go" onClick=submitForm(this) /></td></tr>

<tr><td align="Center" colspan="3"><font color="#A378B5"> <b><u>NON VEGETATION</u></b></td></tr>
<tr><td><i><input  type="text" name="s4" value="Tandoori Chicken"></i></td>
    <td><input type="text" name="t4"  size="4" value="500" readonly="readonly"></td>
    <td><input type="button" name="button4" value= "go" onClick=submitForm(this) /></td> </tr>
        

        </table>
            </form>
    </body>
</html>
