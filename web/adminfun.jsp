<%-- 
    Document   : adminfun
    Created on : 23 Mar, 2022, 9:40:41 PM
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
            margin-top:160px;
            background-color:rgb(202,174,183);
            cellpadding:25;
             }
             #table1{
            background-color:rgb(255,250,250);
            margin-left:380px;
           width:538px;
             border-bottom:1px solid palevioletred;
        }
        #tab{
            
           margin-left:100px;  
        } 
        
        
        </style>
    </head>
    
    <script>


		
function submitForm(clickedButton)

{
			
if(clickedButton.name==="button1")
{

alert("button1");

document.myfm.action="addpro.jsp";

}
		
else if(clickedButton.name==="button2")
				
{

alert("button2");
				
document.myfm.action="viewpro.jsp";
	
}

else if(clickedButton.name==="button3")				
{

alert("button3");
				
document.myfm.action="updatepro.jsp";
	
}
else if(clickedButton.name==="button4")
				
{

alert("button4");
				
document.myfm.action="deletepro.jsp";
	
}
document.myfm.submit();
				
}
	
</script>
   
    
   <form name="myfm">
          <body>
        <div id="div1">
            <table border="0" align="Center"><tr><th><font color="white">Admin Functionalities</th></tr></table>
       </div>
    <table style="border:1"  align="Center" cellspacing="20" id="table1">
             

  
   
            
             <tr id="tab"> 
            <td><input type="button1" name="button2" value= "Add product" onClick=submitForm(this) /></td>
            </tr>
              <tr id="tab"> 
            <td><input type="button2" name="button2" value= "view product" onClick=submitForm(this) /></td>
            </tr>
              <tr id="tab"> 
            <td><input type="button3" name="button3" value= "update product" onClick=submitForm(this) /></td>
            </tr>
              <tr id="tab"> 
            <td><input type="button4" name="button4" value= "Delete product" onClick=submitForm(this) /></td>
            </tr>
            
       </table>   
   
       </body>
     </form> 
    
        
        
        
        
    
</html>
