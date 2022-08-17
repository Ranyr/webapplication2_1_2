

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class uacc extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       try {
          
        String a1,a2,a3,a4,a5,a6,a7,a8,a9;
        a1=request.getParameter("firstname");
        a2=request.getParameter("lastname");
        a3=request.getParameter("city");
        a4=request.getParameter("address");
        a5=request.getParameter("contactno");
        a6=request.getParameter("email");
        a7=request.getParameter("username");
        a8=request.getParameter("password");
        a9=request.getParameter("confirmpassword");
      
        
        Class.forName("com.mysql.jdbc.Driver");
      //  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
        PreparedStatement stat=con.prepareStatement("Insert into acc values(?,?,?,?,?,?,?,?,?)");
       
        stat.setString(1,a1);   
        stat.setString(2,a2);    
        stat.setString(3,a3);    
        stat.setString(4,a4);    
        stat.setString(5,a5);    
        stat.setString(6,a6);    
        stat.setString(7,a7);    
        stat.setString(8,a8);    
        stat.setString(9,a9); 
         stat.executeUpdate();
out.println("<body bgcolor=#FFDDCC>");
        out.println("<h1><b><center>you are registered successfully</center><b></h1>");
        out.println("<h2><center><a href='login.jsp'>login</a></center></h2>");
        
      
           
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
