

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        #div1{
            margin-left:498px;
            margin-top:80px;
            height:38px;
             background-color:rgb(202,174,183);
             width:335px;
        }
        input::placeholder{
          
            color:black; 
        }
    #btn
        {background-color:rgb(233,219,232);
          border-radius:15px;
            
        }
        #table1{
             margin-left:498px;
            width:335px;
            margin-top:"50px";
            background-color:rgb(255,250,250);
            border-bottom: 1px solid #A378B5;
        }
        </style>
    </head>
    <body>
        <%@ include file="admin_header.html" %>
       <form action="cat2servlet" enctype="multipart/form-data"  method="post">
      
        
         <div id="div1">
    <table border="0" align="Center"><tr><th>Add category</th></tr></table>
    </div>

    <table  border="0" align="Center" cellspacing="20" id="table1">
      
    <tr style="text-align:left" ><td style="border:0">category name</td>         
        <td align="left" colspan="2"><input type="text" name="name" placeholder="category Name Here" /></td></tr>
   
    
    <tr style="text-align:left" ><td style="border:0">photo</td>         
        <td align="left" colspan="2"><input type="file" name="ppic" placeholder="choose photo" /></td></tr>
    
    
   <tr> <td style="border:0" align="Center" colspan="2"><input type="submit" value="Add Category" id="btn"> </td></tr>      
    </table>
  
       </form>
        
        <%@ include file="footer1.html" %>
        
    </body>
</html>
