

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
import javax.servlet.http.HttpSession;


public class orderses1 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try{ 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
      String  n1= request.getParameter("t1");
      String  n3= request.getParameter("t2");
      String  n4= request.getParameter("t3");
      String  n5= request.getParameter("t4");
      String  n6= request.getParameter("t5");
        String  n7= request.getParameter("t6");
         String  n8= request.getParameter("t7");
          String  n9= request.getParameter("t8");
     //out.println("data retrieved fromm html page");////////////////// 
      int n333,n444,n;
      n333=Integer.parseInt(n3);
      n444=Integer.parseInt(n4);
      n =n333*n444;
       
      String r7=String.valueOf(n);
        //out.println("total="+r7);//////////////////////////////
        
        
       HttpSession session=request.getSession();//httpsession setting key to a coresspond to an attribute
        
        session.setAttribute("n11",n1);
        session.setAttribute("n33",n3);
        session.setAttribute("n44",n4);
        session.setAttribute("n55",n5);
        session.setAttribute("n66",n6);
        session.setAttribute("n77",r7);
        session.setAttribute("n88",n7);
       session.setAttribute("n99",n8);
       session.setAttribute("n10",n9);
       response.sendRedirect("orderses2");
       }
       catch(Exception e){
       System.out.println(e);
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
