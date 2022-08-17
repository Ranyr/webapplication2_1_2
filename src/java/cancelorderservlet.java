

import com.Orderdao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class cancelorderservlet extends HttpServlet {

  

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
          String orderid=request.getParameter("orderid");
          if(orderid != null)
          {
            // orderdao od1=new orderdao();
            int k= Orderdao.cancelorder(Integer.parseInt(orderid));
            if(k>0){out.println("order cancelled successfully");response.sendRedirect("cancelodr.jsp");}
            else{out.println("not able to delete try again");response.sendRedirect("showorder.jsp");}
          }
        
        }
        catch(Exception e){out.println(e);}
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      doGet(request,response);
    }

  


}
