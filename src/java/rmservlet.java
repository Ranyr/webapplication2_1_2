

import com.cartbean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class rmservlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
         try{
           String pid=request.getParameter("pid");
           //out.println("pid = "+pid);
         if(pid != null)
         {
             HttpSession session=request.getSession();
             ArrayList<cartbean> cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
             if(cart_list != null)
             {
                for(cartbean c:cart_list)
                {
                    if(c.getPid()==Integer.parseInt(pid))
                    {
                        cart_list.remove(cart_list.indexOf(c));
                        break;
                    }
                
                }
                response.sendRedirect("cartdisp.jsp");
             }
             else{response.sendRedirect("cartdisp.jsp");}
         }
        
         }
         catch(Exception e){out.println(e);}
    }

   
 

}
