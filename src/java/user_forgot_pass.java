

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/user_forgot_pass"})
public class user_forgot_pass extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          String a11,a2,a3;
          
        try (PrintWriter out = response.getWriter()) {
           a11=request.getParameter("t1");
             a2=request.getParameter("t2");
              a3=request.getParameter("t3");
             
              
              if(a2.equals(a3)){
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
        PreparedStatement stat=con.prepareStatement("UPDATE acc SET password=?,confirmpassword=? where username=? ");
         stat.setString(1,a2);
         stat.setString(2,a3);
         stat.setString(3,a11);
         stat.executeUpdate();
             
             
             out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
              out.println("<h1><center>yourpassword has been changed </center></h1>");
              out.println("<h3><center><a href='login.jsp'>Try to login here</a></center></h3>");
              out.println("</body>");
              out.println("</html>");
                      }
              
              else{
                  out.println("<html>");
              out.println("<body brcolor='#FEE1E8'>");
              out.println("<h1><center>new password and confirm password is not matched</center></h1>");
              out.println("<h3><center><a href='trial111.jsp'>forgot password</a></center></h3>");
              out.println("</body>");
              out.println("</html>");
              } 
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
