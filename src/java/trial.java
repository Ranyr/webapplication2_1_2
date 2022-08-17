

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
import javax.servlet.http.HttpSession;

public class trial extends HttpServlet {

    String a1,a2;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        try {
            a1= request.getParameter("t1");
            a2= request.getParameter("t2");
          
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
          Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("SELECT username,password FROM acc WHERE username='"+a1+"'AND password='"+a2+"'");
        int count=0;
                  while(rs.next()){
                                       count++;
                                 }
      if(count>0){  //if username,password is correct then only count increases
          
       
               HttpSession session=request.getSession();    //////////////////////////////////////////
               session.setAttribute("username",a1);
               RequestDispatcher dis=request.getRequestDispatcher("homepage.jsp");//now  call goes to success1
               dis.forward(request,response);
      
      }
      else{
      out.println("<h1><b><center><font color='black'>no such user found</center><b></h1>");
      out.println("<h2><b><center><font color='black'><a href='trial111.jsp'>forgot password ? </a></center><b></h2>");
       out.println("<h1><b><center><font color='black'>Please Sign up first</center><b></h1>");
      
      RequestDispatcher dis=request.getRequestDispatcher("account.html");
             dis.include(request,response);
      }
        }
        
        
        
        catch(Exception e){
        
        
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
