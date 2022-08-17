/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

/**
 *
 * @author radhika
 */
public class feedback extends HttpServlet {
String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
           
            
            RequestDispatcher dis1=request.getRequestDispatcher("./header.html");
            dis1.include(request,response);
            a1=request.getParameter("t1");
            a2=request.getParameter("t2");
            a3=request.getParameter("t3");
            a4=request.getParameter("r1");
            a5=request.getParameter("r2");
            a6=request.getParameter("r3");
            a7=request.getParameter("r4");
            a8=request.getParameter("r5");
            a9=request.getParameter("r6");
            a10=request.getParameter("r7");
            a11=request.getParameter("t4");

             
            Class.forName("com.mysql.jdbc.Driver");
          //  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
            PreparedStatement stat=con.prepareStatement("insert into feedbacks values(?,?,?,?,?,?,?,?,?,?,?)");
            stat.setString(1,a1);
            stat.setString(2,a2);
            stat.setString(3,a3);
            stat.setString(4,a4);
            stat.setString(5,a5);
            stat.setString(6,a6);
            stat.setString(7,a7);
            stat.setString(8,a8);
            stat.setString(9,a9);
            stat.setString(10,a10);
            stat.setString(11,a11);

           stat.executeUpdate();
           out.println("<h1>your feedback has recorded </h1>");
            out.println("<body bgcolor=#FFDDCC>");
            RequestDispatcher dis2=request.getRequestDispatcher("./footer1.html");
            dis2.include(request,response);
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
