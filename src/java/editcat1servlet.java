

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import com.*;
import javax.servlet.http.Part;
@MultipartConfig
public class editcat1servlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String fooditem,id;
        int quantity,ppic;
        double price;
       Part part;
        try 
        {       
            /*
            
             part= request.getPart("ppic");
              String filename=part.getSubmittedFileName();
              out.println(filename);
               
              String path=getServletContext().getRealPath("/"+"img"+File.separator+filename);
              InputStream is=part.getInputStream();
              boolean success= upload(is,path);
              
            */
          
               //fetching product data  
          fooditem=request.getParameter("fooditem");  //********************
          id=request.getParameter("id");
          quantity=Integer.parseInt(request.getParameter("quantity"));
          price=Double.parseDouble(request.getParameter("price"));
           
        
           productbean1 ct1=new productbean1();     //create object for bean class
           ct1.setFooditem(fooditem);
           ct1.setId(id);
           ct1.setQuantity(quantity);
           ct1.setPrice(price);
           
            /*part= request.getPart("ppic");
            ppic=part.getSubmittedFileName();
            ct1.setppic(ppic); */
          // String path=getServletContext().getRealPath("/"+"img"+File.separator+ppic);
            
            
            //String filename=part.getSubmittedFileName();   
            //out.println("filename= "+ppic); 
           // out.println("path=  "+ path);
              
            
               //InputStream is=part.getInputStream();
            int n=pdao1.update(ct1);//*****************************************************************
            
            
            /*if(n>0)
            {
                
                  boolean success= upload(is,path);
                 if(success)
                 {
                  out.println("file uploaded to the directory : path= "+path);
                   
                       // response.sendRedirect("catupdatesuccess.jsp");
                 }
                 else
                 {
                     out.println(" <h1><center>there is some error while uploading a file</center></h1>");
                     // response.sendRedirect("catupdateerror.jsp");
                 
                 }
            
            
            }
            else{
              response.sendRedirect("catupdateerror.jsp");
            
            }  */
            
        }
        catch(Exception e){out.println(e);}
    }

   

      public boolean upload(InputStream is,String path)
    {
      boolean test=false;
     
      
      try
      {
          byte []byt=new byte[is.available()]; 
          is.read();
          FileOutputStream fops=new FileOutputStream(path);
          fops.write(byt);
          fops.flush();
          fops.close();
          
          test=true;
      }
      catch(Exception e){}
      return test;
    } 
   

   
}
