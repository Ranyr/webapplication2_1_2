

import com.cartbean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class NewServlet extends HttpServlet {

   
  

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
           try{
           
             ArrayList<cartbean> cartList=new ArrayList<>();
             int pid= Integer.parseInt(request.getParameter("pid"));
              cartbean mm=new cartbean(); //cartbean data set here
               mm.setPid(pid);
               mm.setQuantity(1);
              
               HttpSession session=request.getSession();
               ArrayList<cartbean> cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");//first time call
               int flag=0;
               
               if(cart_list == null){  
                 cartList.add(mm);
                  session.setAttribute("cart-list",cartList);
                response.sendRedirect("getpro.jsp");
                  
               }
               else{  //if cartlist already have products
               
                  cartList= cart_list;
                  boolean exist=false;
                  
               for(cartbean c:cartList)
               {    
                    if(c.getPid()==pid)
                    {exist=true;
                     
     out.println("<h3 style='color:crimson;text-align:center'>Item already exist in the cart<a href='cartdisp.jsp'>Go to Cart</a></h3>");
                    }  
               }
               if(!exist)
                    {
                    
                       cartList.add(mm);
                    out.println("product added");
                   response.sendRedirect("getpro.jsp");
                    }   
               
               }
                
               
             //for(cartbean c:cartList)
             //{out.println(c.getPid());}  
               
               
              
           }
           
           
           catch(Exception e){out.println(e);}
    }

  
 

}
