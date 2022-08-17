

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class updateemail extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String em;
        try
        {
              
        HttpSession ses=request.getSession();
        em=(String)ses.getAttribute("em2");
        out.println("here is= "+em);
        
        final String useremail=em;
        final String password="";
        Properties props=new Properties();
        
        
       // response.sendRedirect("placeordersuccess.jsp");
        }
        catch(Exception e){out.println(e);}
       
    }



}
