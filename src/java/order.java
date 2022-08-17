
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.RequestDispatcher;

public class order extends HttpServlet {
 String a1,a2,a3,a4,a5,a6;
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();       
       
        try  {
            RequestDispatcher dis=request.getRequestDispatcher("header.html");
             dis.include(request,response);

            a1=request.getParameter("t1");
            a2=request.getParameter("r1");
            a3=request.getParameter("t2");
            a4=request.getParameter("t3");
            a5=request.getParameter("t4");
            a6=request.getParameter("r2");
             
            Class.forName("com.mysql.jdbc.Driver");
           // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
            PreparedStatement stat=con.prepareStatement("insert into uorder values(?,?,?,?,?,?)");
            stat.setString(1,a1);
            stat.setString(2,a2);
            stat.setString(3,a3);
            stat.setString(4,a4);
            stat.setString(5,a5);
            stat.setString(6,a6);
           stat.executeUpdate();
           out.println("<h1>order placed successfully</h1>");
           RequestDispatcher dis1=request.getRequestDispatcher("footer1.html");
             dis1.include(request,response);

          
           
        }
        catch(Exception e){
        System.out.println(e);
        }
    }

   
}
