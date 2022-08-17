

import com.Order;
import com.Orderdao;
import com.User;
import com.cartbean;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class checkoutservlet extends HttpServlet {

  
  
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
          try {
              SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");        
              Date date= new Date();
         //retrieve all cart product from session 
          ArrayList<cartbean> cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
          User uo=(User)session.getAttribute("user");
          //check is user login? and product list? empty or not 
             if(cart_list != null && uo != null)
             {
                for(cartbean c:cart_list)
                {
                   Order o=new Order();
                   o.setPid(c.getPid());
                  // o.setUid(uo.getUid());
                   o.setQuantity(c.getQuantity());
                   o.setDate(formatter.format(date));
                  
                 int k=Orderdao.save(o);
                 if(k==0){break;}
                 
                } 
               
                cart_list.clear();
                response.sendRedirect("showorder.jsp");
             }
             else{response.sendRedirect("cartdisp.jsp");}
        }
        catch(Exception e){out.println(e);}
        
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

   
   

}
