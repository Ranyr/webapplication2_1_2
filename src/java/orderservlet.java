

import com.ConnectionUtil;
import com.Order;
import com.Orderdao;
import com.User;
import com.cartbean;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class orderservlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {    
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
        User um=(User)session.getAttribute("user"); //user is coming from indexlet.jsp page
        int pid,quantity;
        double price;
        try{
         
           if(um != null)
           {
             pid=Integer.parseInt(request.getParameter("pid"));  out.println("pid= "+pid);
             quantity=Integer.parseInt(request.getParameter("quantity"));out.println("quantity= "+quantity);
             price=Double.parseDouble(request.getParameter("price")); out.println("pprice= "+price);//either came from cart.dsp or from bynow button at getpro.jsp(qty,pid,price)
             session.setAttribute("pp",price); //session set for price(cart or direct buy now button)
 //atgetpro.jsp----addtocart button---newservlet.java----cartdisp.jsp----buy now, remove-----if buy now(qty,price-hidden fields)---orderservlet.java
            
            SimpleDateFormat formatter=new SimpleDateFormat("yyy-MM-dd");
             Date date=new Date();
             
            Order odmdl=new Order();
             odmdl.setName(um.getName());
            odmdl.setEmail(um.getEmail());
            odmdl.setPid(pid);
               odmdl.setDate(formatter.format(date));
            odmdl.setQuantity(quantity);
        
            
       int oid=Orderdao.save(odmdl);

//check=oid  -----initally check is just a pointer for save ?  or not ?
              //out.println("check oid= "+oid);
          if(oid>0)  //is order placed sussccefully or not? if yes remove that product from cartlist
             {
               out.println("oid= "+oid); 
               //when order is placed in order to remove that product from cart list  
             ArrayList<cartbean> cart_list=(ArrayList<cartbean>)session.getAttribute("cart-list");
             if(cart_list != null)
             {
                for(cartbean c:cart_list)
                {
                    if(c.getPid()== pid)
                    {    
                        cart_list.remove(cart_list.indexOf(c));
                        break;
                    }
                
                }
                
             }  
                 
              ///////////////////////////////////////////////////////////////////////
            
            
               HttpSession ses=request.getSession();
               ses.setAttribute("oo",oid);     //session set for order id
                response.sendRedirect("wantcpn.jsp");
               // response.sendRedirect("address.jsp");
                // response.sendRedirect("showorder.jsp");//comment enteraddress.jsp--address 
             }
             else
             {out.println("order failed");}  
           }
           
           else{ out.println("user not logged in yet!!");   
           response.sendRedirect("lablo1.jsp"); } 
        
        }
        catch(Exception e){out.println(e);}
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }

  

}
