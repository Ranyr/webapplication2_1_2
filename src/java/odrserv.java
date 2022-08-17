

import com.Order;
import com.Orderdao;
import com.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class odrserv extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       PrintWriter out = response.getWriter(); 
        try{
           HttpSession session=request.getSession();
        User um=(User)session.getAttribute("user"); //user is coming from indexlet,jsp page
        int pid,quantity;
        if(um != null)
           {
             pid=Integer.parseInt(request.getParameter("pid"));
             quantity=Integer.parseInt(request.getParameter("quantity"));
             
             
             SimpleDateFormat formatter=new SimpleDateFormat("yyy-MM-dd");
             Date date=new Date();
             
            
                Order omodel=new Order();
             
             omodel.setPid(pid);
             //odmodel.setUid(um.getUid()); //name
             omodel.setName(um.getName());
             omodel.setEmail(um.getEmail());
             omodel.setQuantity(quantity);
             omodel.setDate(formatter.format(date));
              
              
              Orderdao od=new Orderdao();
           
             int oid=Orderdao.save(omodel);
             out.println("oid= "+oid);
            }
        
        else{}
        }
        
        catch(Exception e){out.println(e);}
        
    
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

 

}
