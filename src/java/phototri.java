

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class phototri extends HttpServlet {  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         PrintWriter out = response.getWriter();
         Part part;
         try
         {
              part= request.getPart("photo");
              String filename=part.getSubmittedFileName();
              out.println(filename);
               
              String path=getServletContext().getRealPath("/"+"img"+File.separator+filename);
              InputStream is=part.getInputStream();
              boolean success= upload(is,path);
              
              if(success){out.println("file uploaded to the directory : "+path);}
              else{out.println("error");}
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