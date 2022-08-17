/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.photobean;
import com.photodao;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@MultipartConfig
public class discount11 extends HttpServlet {

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String fooditem,id,photo,path;
            int qty;
            double price;
            int flag=0;
            int status=0;
           int check=0;
             
              Connection con=null;
             
             
            PreparedStatement ps=null;
        try {
               
              fooditem=request.getParameter("fooditem"); out.println("fooditem= "+fooditem);
              id=request.getParameter("id");out.println("ctg= "+id);
              qty=Integer.parseInt(request.getParameter("quantity"));out.println("qty= "+qty);
              price=Double.parseDouble(request.getParameter("price"));out.println("price= "+price);
              Part  part= request.getPart("photo");//-----------------------------------------1
            photo= part.getSubmittedFileName();  out.println("photoname= "+photo);
            
            // path="C:\\Users\\radhika\\Documents\\NetBeansProjects\\WebApplication2_1_2\\build\\web\\img\\"+File.separator+photo;
            path=getServletContext().getRealPath("/"+"img"+File.separator+photo);
            out.println("path= "+path);
           
           
              //ctg=request.getParameter("id");//SNACKS
              //qty=Integer.parseInt(request.getParameter("quantity"));//2
              //price=Double.parseDouble(request.getParameter("price"));//20
             // filename=request.getParameter("filename");//img
              
         
             /* Part part=request.getPart("photo");//photo
              photo=extractfilename(part); //photoname=filename
              out.println("photo= "+photo);
              savepath="C:\\Users\\radhika\\Documents\\NetBeansProjects\\WebApplication2_1_2\\build\\web\\img\\"+File.separator+photo;
              File filesavedir=new File(savepath);    */
             // part.write(savepath +File.separator);
        
         
           //Class.forName("com.mysql.jdbc.Driver");
           // con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
         /* ps=con.prepareStatement("insert into ptrii(name,filename,path)values(?,?,?)");
         ps.setString(1,name);
         ps.setString(2,filename);
         ps.setString(3,savepath);
         status=ps.executeUpdate();  */
       /* PreparedStatement ps=con.prepareStatement("insert into phototr(fooditem,id,quantity,price,filename,path)values(?,?,?,?,?,?)");
          ps.setString(1,name);
         ps.setString(2,ctg);
          ps.setInt(3,qty);
          ps.setDouble(4,price);
           ps.setString(5,filename);
         ps.setString(6,savepath);
         ps.executeUpdate();  
         out.println("name= "+name);
          out.println("filename= "+filename);
          out.println("path= "+savepath);  */
    /* ps=con.prepareStatement("insert into products3(fooditem,id,quantity,price,photo)values(?,?,?,?,?)");
      ps.setString(1,fooditem);
      ps.setString(2,id);
      ps.setInt(3,qty);
      ps.setDouble(4,price);
      ps.setString(5,photo);
      status=ps.executeUpdate();  */
           photobean pd=new photobean();
            
           pd.setFooditem(fooditem);
           pd.setId(id);
           pd.setQuantity(qty);
           pd.setPrice(price);
           pd.setPhoto(part.getSubmittedFileName());
        //save   
        status= photodao.save(pd);
    
          if(status>0)
          {out.println("Image inserted succesfully");}
          else{out.println("nooooo");}
          
           InputStream is=part.getInputStream();//----------------------------------------------2
            check= uploadfile(is,path);//------------------call goes to upload method-------3
              if(check>0){
                  out.println("image uploaded");
               List uu= photodao.getdata();
               out.println("size= "+uu.size());
              }
              else{out.println("image not uploaded");} 
           
      // photobean u= photodao.getRecordByname(name);//*********************************
      // out.println(u.getFilename());//*************************************
       
         
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
