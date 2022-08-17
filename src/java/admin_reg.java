

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author radhika
 */
public class admin_reg extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String a1,a2,a3,a4,a5,a6;
        try  {
            
            
       
        a1=request.getParameter("name");
        a2=request.getParameter("email");
        a3=request.getParameter("contactno");
        a4=request.getParameter("username");
        a5=request.getParameter("password");
       a6=request.getParameter("confirmpassword");
      
        
        Class.forName("com.mysql.jdbc.Driver");
       // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/root","root","root");
        PreparedStatement stat=con.prepareStatement("Insert into adminregister values(?,?,?,?,?,?)");
       
        stat.setString(1,a1);   
        stat.setString(2,a2);    
        stat.setString(3,a3);    
        stat.setString(4,a4);    
        stat.setString(5,a5);    
        stat.setString(6,a6); 
        stat.executeUpdate();
        out.println("<body bgcolor=#FFDDCC>");
        out.println("<h1><b><center>you are registered successfully</center><b></h1>");
        out.println("<center><a href='admin.html'>now try to login</a></center>");
       
           
    }
       catch(Exception e){
           out.println(e);
       
       }
    
    }
           
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
