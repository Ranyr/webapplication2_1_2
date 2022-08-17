

import com.Orderdao;
import com.userdao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class updaddrss extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String a1,a2,em;
        int ob;
        int check=0,check1=0;
       PrintWriter out = response.getWriter(); 
        try
        {
            a1=request.getParameter("contact_no"); out.println("a1= "+a1); 
              a2=request.getParameter("address"); out.println("a2= "+a2);
            
            
            HttpSession ses=request.getSession(); 
             
             em=(String)ses.getAttribute("em1"); out.println("em= "+em); ses.setAttribute("em2",em);
             ob=(int)ses.getAttribute("oid2"); 
             out.println("oid= "+ob);
            
            
           double tt2= (double)ses.getAttribute("tt1"); ses.setAttribute("tt3",tt2);
             
             
               int cc=Orderdao.update(a1,a2,ob);  //update address according to orderid
            if(cc>0)
            {
             out.println("update success oid="+ob);
             updateemail ee=new updateemail();
             ee.doPost(request, response);
            // response.sendRedirect("placeordersuccess.jsp");
            // now call email confirmation method
          /* RequestDispatcher rq=request.getRequestDispatcher("updateemail");
           request.setAttribute("em2", em);
           rq.forward(request, response);  */
             //response.sendRedirect("showorder.jsp");
            }
            
            
            else{out.println("not update oid="+ob);}
        
        
        }
        catch(Exception e)
        {out.println(e);}
         
      
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doGet(request, response);
    }

}
