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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author radhika
 */
public class last extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       try {
          
        
        
      String  a1= request.getParameter("t1");
      String  a3= request.getParameter("t2");
      String  a4= request.getParameter("t3");
      String  a5= request.getParameter("t4");
      String  a6= request.getParameter("t5");
        String  a7= request.getParameter("t6");
         String  a8= request.getParameter("t7");
          String  a9= request.getParameter("t8");
        
        Class.forName("com.mysql.jdbc.Driver");
      //  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
        PreparedStatement stat=con.prepareStatement("Insert into uorder values(?,?,?,?,?,?,?,?)");
       
        stat.setString(1,a1);   
            
        stat.setString(3,a3);    
        stat.setString(4,a4);    
        stat.setString(5,a5);    
        stat.setString(6,a6);    
        stat.setString(7,a7);    
        stat.setString(8,a8);    
        stat.setString(9,a9); 
         stat.executeUpdate();
        response.sendRedirect("orderses1");
         
       
    }
       catch(Exception e){
           
           out.println(e);
       }}

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
