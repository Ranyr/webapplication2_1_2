

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class letout extends HttpServlet {

  
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            
            HttpSession session=request.getSession();
            if(session.getAttribute("user")!= null)   //if session exists--------this session is coming from indexlet.jsp(working as loginservlet)
            {  
              session.removeAttribute("user");    //remove user from session
               out.println("session removed successfully");
               response.sendRedirect("lablo1.jsp");//go to home page.jsp

            
           
            }
            else{
                
              
                out.println(" <h2><center>user is already logged out</center></h2>"); // with any reason still i m trying to logout then redirect user to getpro.jsp page
                 out.println("<h3><center><a href='lablo1.jsp'>Try to login?</a></center></h1>");
                // response.sendRedirect("home.jsp"); 
            }
        }
        catch(Exception e)
        {
           out.println(e);
        }
        
        
        
    }

 

}
