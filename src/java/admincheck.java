

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

public class admincheck extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String a1,a2;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            a1=request.getParameter("t1");
            a2=request.getParameter("t2");
             Class.forName("com.mysql.jdbc.Driver");
           
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
           Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("SELECT username,password FROM adminregister WHERE username='"+a1+"'AND password='"+a2+"'");
   int count=0;      
   while(rs.next()){
           count++;
           }
   if(count>0){
       RequestDispatcher dis=request.getRequestDispatcher("index.jsp");//now  call goes to success1 it will open admin front page
              dis.forward(request,response);
   
   
   
   }
   else{
   out.println("<h1><b><center><font color='red'>no such user found please sign up first</center><b></h1>"); 
       out.println("<h1><b><center><font color='red'><a href='admin.jsp'>try again</a></center><b></h1>");
          out.println("<h1><b><center><font color='red'><a href='trial1.jsp'>forgot password</a></center><b></h1>");
      RequestDispatcher dis=request.getRequestDispatcher("admin_reg.html");
             dis.include(request,response);
   
   
   }
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
