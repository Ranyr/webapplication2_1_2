

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author radhika
 */
public class tr extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String a1,a2,a3,a4,a5,a6;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
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

           out.println(a1);
           out.println(a2);
           Class.forName("com.mysql.jdbc.Driver");
            Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
         //  Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
            PreparedStatement stat=con.prepareStatement("Insert into uorder values(?,?,?,?,?,?)");
            stat.setString(1,a1);
            stat.setString(2,a2);
            stat.setString(3,a3);
            stat.setString(4,a4);stat.setString(5,a5);stat.setString(6,a6);
            stat.executeUpdate();
            out.println("success");
            out.println("<body bgcolor=#FFDDCC>");
            RequestDispatcher dis1=request.getRequestDispatcher("footer.html");
             dis1.include(request,response);

        }
        catch(Exception e){
        out.println(e);}
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
