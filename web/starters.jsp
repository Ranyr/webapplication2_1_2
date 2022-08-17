<%-- 
    Document   : starters
    Created on : 27 May, 2020, 5:17:24 PM
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
            text-align:center;
            
                      }
             #table1{
            background-color:rgb(255,250,250);
            margin-left:494px;
            width:355px;
           border-bottom:1px solid palevioletred;
           text-align:center;
        }                         
        </style>
    </head>
    <script>


		
function submitForm(clickedButton)

{
			
if(clickedButton.name ==="button1")
{

alert("button1");

document.myfm.action="start1_order.jsp";

}
		
else if(clickedButton.name ==="button2")
				
{

alert("button2");
				
document.myfm.action="start2_order.jsp";
	
}
				
else if(clickedButton.name ==="button3")
				
{

alert("button3");
			
document.myfm.action="start3_order.jsp";
				
}
else if(clickedButton.name ==="button4")
				
{

alert("button4");
			
document.myfm.action="start4_order.jsp";
				
}




document.myfm.submit();
				
}

	
</script>
    <body>
      <form name="myfm">
        <div id="div1">
            <table border="0" align="Center" ><tr><td align="center" colspan="2">STARTERS</td></tr></table>
    </div>
            <table style="border:1"  align="Center" cellspacing="20" id="table1">

           
             
             <tr align="Center" ><th colspan="2"><font color="#A378B5"><u>SOUP</u></th>
                        </tr>
       
                        
                  
         <tr><td><i><input type="text" name="s1" value="Chicken soup"></i></td>
             <td><input type="text" name="t1" value="120" size="4" readonly="readonly"></td>
            <td>                  
  <input type="button" name="button1" value= "go" onClick=submitForm(this) />  </td></tr>
            
                            
             <tr><td><i><input type="text" name="s2" value="Vegetable soup"></i></td>
                <td><input type="text" name="t2" value="110" size="4" readonly="readonly"></td>
        <td> <input type="button" name="button2" value= "go" onClick=submitForm(this) /> </td></tr>    
            
            
                
            <tr align="Center" ><th colspan="2"><font color="#A378B5"><u>BREAD & SALAD</u></th>
                        </tr>
            <tr><td><i><input type="text" name="s3" value="Garlic Bread(3pcs)"></i></td>
            <td><input type="text" name="t3" value="130" size="4" readonly="readonly"></td>
              <td> <input type="button" name="button3" value= "go" onClick=submitForm(this) /> </td></tr>
            
            
           
            
            <tr align="Center" ><th colspan="2"><font color="#A378B5" ><b><u>INDIAN STARTERS</u></b></th>
  
            </tr>
            
          
            
            <tr><td><i><input type="text" name="s4" value="Keema Kofte"></i></td>
            <td><input type="text" name="t4" value="200" size="4" readonly="readonly"></td>
            <td> <input type="button" name="button4" value= "go" onClick=submitForm(this) readonly="readonly"/> </td></tr>
            

        
     </table>
            </form>
    </body>
</html>
