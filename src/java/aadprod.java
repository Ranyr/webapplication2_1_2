

import com.pdao1;
import com.productbean1;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class aadprod extends HttpServlet {


   

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
    
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String fooditem,id;
        int quantity;
        double price;
        try{
            fooditem=request.getParameter("fooditem");
            id=request.getParameter("id");
            quantity=Integer.parseInt(request.getParameter("quantity"));
            price=Double.parseDouble(request.getParameter("price"));
            
            
            productbean1 pd=new productbean1();
           pd.setFooditem(fooditem);
           pd.setId(id);
           pd.setQuantity(quantity);
           pd.setPrice(price);
           
         int p= pdao1.save(pd);
         if(p>0){response.sendRedirect("addprosuccess.jsp");}
         else{response.sendRedirect("addproerror.jsp");}
         
        }
        catch(Exception e)
        {out.println(e);}
    
    }

  

}
