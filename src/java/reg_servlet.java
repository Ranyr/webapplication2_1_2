

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class reg_servlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         String a1,a2,a3;
         
        try 
        {
             
        a1=request.getParameter("name");
        a2=request.getParameter("email");
        a3=request.getParameter("password");
    
      
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
        
       /* PreparedStatement stat=con.prepareStatement("Insert into user(name,email,password)values(?,?,?)");
       
        stat.setString(1,a1);   
        stat.setString(2,a2);    
        stat.setString(3,a3);   */  
         PreparedStatement stat=con.prepareStatement("Insert into user1(name,email,password)values(?,?,?)");
        stat.setString(1,a1);   
        stat.setString(2,a2);    
        stat.setString(3,a3); 
        
         stat.executeUpdate();
        out.println("<body bgcolor=#FFDDCC>");
        out.println("<h1><b><center>you are registered successfully</center><b></h1>");
        out.println("<h2><center><a href='lablo1.jsp'>login</a></center></h2>");
        }
        catch(Exception e)
        {out.println(e);}
    }

   


   
 

}
