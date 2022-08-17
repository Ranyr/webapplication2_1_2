

import com.photobean;
import com.productbean1;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/prtr"})
public class prtr extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String a1;
        int a2;
        List<photobean> list=new ArrayList<photobean>();
        try {
            /* a1=request.getParameter("nm");
             a2=Integer.parseInt(request.getParameter("id"));
             out.println("a1= "+a1 );
             out.println("a2= "+a2); */
              Class.forName("com.mysql.jdbc.Driver");
                  System.out.println("driver loaded successfully");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
                  System.out.println("connection done");
                   PreparedStatement ps=con.prepareStatement("select * from products3");
           ResultSet rs=ps.executeQuery();
           while(rs.next())
		{
			photobean u=new photobean();
                        
                        out.println("pid= "+rs.getInt("pid"));
                       out.println("nm= "+rs.getString("fooditem"));
                          out.println("ppic= "+rs.getString("photo"));
                            
			u.setPid(rs.getInt("pid"));
			
                        u.setFooditem(rs.getString("fooditem"));
                        u.setId(rs.getString("id"));
			u.setQuantity(rs.getInt("quantity"));
                        u.setPrice(rs.getDouble("price"));
			u.setPhoto(rs.getString("photo"));
			list.add(u);
		}
           out.println("size= "+list.size());
           
           }
        catch(Exception e){out.println(e);}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
