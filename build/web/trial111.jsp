
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <script>


		
function submitForm(clickedButton)

{
			
if(clickedButton.name==="button1")
{

alert("button1");

document.myfm.action="trial11.jsp";

}

document.myfm.submit();
}
</script>
    
    <body bg color="#FEE1E8">
        <form name="myfm">
        <table align="center">
       <tr> <td><h1>Enter Username</h1></td></tr>
      <tr> <td><input type="text" name="t1"></td></tr>
      <tr><td><input type="button" value="click here" name="button1" onClick=submitForm(this)></td></tr>
       </table>
        </form>
    </body>
</html>

