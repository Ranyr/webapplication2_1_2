

import com.pdao1;
import com.photobean;
import com.photodao;
import com.productbean1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(fileSizeThreshold=1024*1024*10,
                 maxFileSize=1024*1024*50,
                 maxRequestSize=1024*1024*100)
public class addprod1 extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
      response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String fooditem,id,photo;
        int qty;int check=0;
        double price;
        Part part;
        String path;
        try{
          
              
              fooditem=request.getParameter("fooditem"); out.println("fooditem= "+fooditem);
              id=request.getParameter("id");out.println("ctg= "+id);
              qty=Integer.parseInt(request.getParameter("quantity"));out.println("qty= "+qty);
              price=Double.parseDouble(request.getParameter("price"));out.println("price= "+price);
             part= request.getPart("photo");
            photo= part.getSubmittedFileName();  out.println("photo= "+photo);
            photobean pd=new photobean();
            
           pd.setFooditem(fooditem);
           pd.setId(id);
           pd.setQuantity(qty);
           pd.setPrice(price);
           pd.setPhoto(part.getSubmittedFileName());
           
             path=getServletContext().getRealPath("/"+"img"+File.separator+photo);
           
        //save   
        int p= photodao.save(pd);
      
         
         if(p>0){
             out.println("saved image");
         
               }//response.sendRedirect("addprosuccess.jsp");} 
         else{out.println("not saved");}//response.sendRedirect("addproerror.jsp");} 
         
         InputStream is=part.getInputStream();//----------------------------------------------2
            check= uploadfile(is,path);//------------------call goes to upload method-------3
              if(check>0)
              {
               out.println("image uploaded");
               out.println("path= "+path);
               
               List uu= photodao.getdata();
               out.println("size= "+uu.size());
             // response.sendRedirect("prtr");
              
              }
              else{out.println("image not uploaded");} 

         
        }
        catch(Exception e)
        {out.println(e);}  
    }

   public static int uploadfile(InputStream is,String path)
 {
     int check=0;
 FileOutputStream fops;
 try
 {
     byte[] byt=new byte[is.available()];
     is.read();
     fops= new FileOutputStream(path);
     fops.write(byt);
     fops.flush();
     fops.close();
     check=1;
 }
 catch(Exception e){e.printStackTrace();}
 return check;
 } 


}
