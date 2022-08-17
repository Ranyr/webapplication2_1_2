

import com.cartbean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class increase extends HttpServlet {

  
  

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          try{
          
             String lol=request.getParameter("lol");
             int pid=Integer.parseInt(request.getParameter("pid"));
            HttpSession session=request.getSession();
            ArrayList<cartbean> cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
            if(lol != null && pid>1)
            {
            
               if(lol.equals("inc"))
               {
                   
                 for(cartbean c:cart_list)
                 {
                     if(c.getPid() == pid)
                     {
                         int qty=c.getQuantity();
                         qty++;
                         c.setQuantity(qty);
                         response.sendRedirect("cartdisp.jsp");
                     }
                 
                 }
               
               
               } 
              if(lol.equals("dec"))
              {
                  for(cartbean c:cart_list)
                 {
                     if(c.getPid() == pid && c.getQuantity()>1)
                     {
                         int qty=c.getQuantity();
                         qty--;
                         c.setQuantity(qty);
                         break; 
                     }
                 
                 }
                 response.sendRedirect("cartdisp.jsp");
              
              }
            
            
            }
            
            else{
             response.sendRedirect("cartdisp.jsp");
            
            }
            
            
          }
          
          catch(Exception e)
          {out.println(e);}
       
    

    
  

    }  
  

}
