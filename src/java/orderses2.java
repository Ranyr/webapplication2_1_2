

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;

public class orderses2 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
         String code; 
        try {
            RequestDispatcher dis1=request.getRequestDispatcher("./header.html");
            dis1.include(request,response);
            HttpSession session=request.getSession(false); 
            
            String n111=(String)session.getAttribute("n11");
              String n333=(String)session.getAttribute("n33");
               String n444=(String)session.getAttribute("n44");
                String n555=(String)session.getAttribute("n55");
                 String n666=(String)session.getAttribute("n66");
                String n777=(String)session.getAttribute("n77");
              
                
                String n888=(String)session.getAttribute("n88");
                String n999=(String)session.getAttribute("n99");
                String n100=(String)session.getAttribute("n10");
                
                
             out.println("<html>"); 
              
             out.println("<body bgcolor='#FEE1E8'>");  
            out.println("<html>");
            out.println("<body>");
            out.println("<table border='0'  align='center'  width='440'>");
            out.println("<tr>");out.println("<td><h1><b> ORDER DETAILS</b></h1></td>");out.println("</tr>");
           out.println("<tr>");out.println("<td>");out.println("<h4>item:" +n111+ "</h4>");out.println("</td>");out.println("</tr>");
           out.println("<tr>");out.println("<td>");out.println("<h4>quantity:" +n333+ "</h4>");out.println("</td>");out.println("</tr>");
           out.println("<tr>");out.println("<td>");out.println("<h4>price per item:" +n444+ "</h4>");out.println("</td>");out.println("</tr>");
           
           out.println("<tr>");out.println("<td>");out.println("<h4>order date&time:" +n555+ "</h4>");out.println("</td>");out.println("</tr>");
           out.println("<tr>");out.println("<td>");out.println("<h4>customer name:" +n666+ "</h4>");out.println("</td>");out.println("</tr>");
           out.println("<tr>");out.println("<td>");out.println("<h4>contact no:" +n888+ "</h4>");out.println("</td>");out.println("</tr>");
           out.println("<tr>");out.println("<td>");out.println("<h4>email address:" +n999+"</h4>");out.println("</td>");out.println("</tr>");
           out.println("<tr>");out.println("<td>");out.println("<h4>Delivery address:" +n100+ "</h4>");out.println("</td>");out.println("</tr>");
           out.println("<tr>");out.println("<td>");out.println("<h4>total price:" +n777+ "</h4>");out.println("</td>");out.println("</tr>");
           out.println("</table>");
           out.println("</body>");
           out.println("</html>");
           ////////////////////////////////////////////////////////////////automate code for order/////////////////////////////////////
         
           
           int mintt=Integer.parseInt(n777);
          
           if((n111.equals("Chicken Soup")&&(mintt>=200))||(n111.equals("Onion Bhaji")&&(mintt>=200))||(n111.equals("Keema Kofte")&&(mintt>=200))){
            code= "S2130";
            out.println("<html>");
            out.println("<head>");
            out.println("<body>");  
                       out.println("<form action='discount1'>");

            out.println("<table border='0'  align='center'  width='440'>");
           out.println("<tr>");out.println("<td>");out.println("<a href='starter_copon.html'>WANT TO APPLY COPOUN</a>");out.println("</tr>");out.println("</td>");
           out.println("</table>"); 
           out.println("</form>");
           out.println("</body>");
           out.println("</head>");
           out.println("</html>");
            
           }
          
            
           else if((n111.equals("Mushroom chicken")&&(mintt>=200))||(n111.equals("Breaded Chicken Supreme")&&(mintt>=200))||(n111.equals("Fish and chip")&&(mintt>=200))){
           code= "S2131";
           out.println("<html>");
            out.println("<head>");
            out.println("<body>"); 
             out.println("<form action='discount1'>");
           out.println("<table border='0'  align='center'  width='440'>");          
          out.println("<tr>");out.println("<td>");out.println("<a href='maincourse_coupon.html'>WANT TO APPLY COPOUN</a>");out.println("</tr>");out.println("</td>");           
          out.println("</table>");
           out.println("</form>");
           out.println("</body>");
           out.println("</head>");
           out.println("</html>");
           }
            else if((n111.equals("Cold COffee vanillia")&&(mintt>=200))||(n111.equals("Chocolate Milk")&&(mintt>=200))||(n111.equals("Milk Shakes")&&(mintt>=200))){
           code= "S2132";
           out.println("<html>");
            out.println("<head>");
            out.println("<body>");    
            out.println("<form action='discount1'>");
           out.println("<table border='0'  align='center'  width='440'>");
           
           out.println("<tr>");out.println("<td>");out.println("<a href='drink_coupon.html'>DO YOU WANT ANY COPOUN?</a>");out.println("</tr>");out.println("</td>");
           out.println("</table>");
           out.println("<form>");
          out.println("</body>");
           out.println("</head>");
           out.println("</html>");
           }

            else if((n111.equals("Gazar Halwa(kg)")&&(mintt>=200))||(n111.equals("Chocolate cake")&&(mintt>=200))||(n111.equals("Gulab Jamun(pc)")&&(mintt>=200))){
           code= "S2133";
           out.println("<html>");
            out.println("<head>");
            out.println("<body>");  
                       out.println("<form action='discount1'>");

           out.println("<table border='0'  align='center'  width='440'>"); 
          out.println("<tr>");out.println("<td>");out.println("<a href='desert_coupon.html'>DO YOU WANT ANY  COPOUN</a>");out.println("</tr>");out.println("</td>");            
          out.println("</table>"); 
           out.println("</form>");
           out.println("</body>");
           out.println("</head>");
           out.println("</html>");
            
           }
           
            else if((n111.equals("Mutter Paneer")&&(mintt>=180))||(n111.equals("Tandoori Chicken")&&(mintt>=180))||(n111.equals("Dal Makhani")&&(mintt>=180))){
           code= "S2135";
           out.println("<html>");
            out.println("<head>");
            out.println("<body>"); 
                       out.println("<form action='discount1'>");

           out.println("<table border='0'  align='center'  width='440'>");            
           out.println("<tr>");out.println("<td>");out.println("<a href='indian_coupon1.html'>WANT TO APPLY COPOUN</a>");out.println("</tr>");out.println("</td>");
           out.println("</table>"); 
             out.println("<form>");
           out.println("</body>");
           out.println("</head>");
           out.println("</html>");
            
           }
            else if((n111.equals("Mysore masala")&&(mintt>=120))||(n111.equals("Masala dhosa")&&(mintt>=120))||(n111.equals("Rava Masala")&&(mintt>=120))){
           code= "S2136";
           out.println("<html>");
            out.println("<head>");
            out.println("<body>");
                      out.println("<form action='discount1'>");

           out.println("<table border='0'  align='center'  width='440'>");
            
           out.println("<tr>");out.println("<td>");out.println("<a href='dho_coupon.html'>WANT TO APPLY COPOUN</a>");out.println("</tr>");out.println("</td>");
             out.println("</table>");
            out.println("</form>");
           out.println("</body>");
           out.println("</head>");
           out.println("</html>");
           }
              
               else if((n111.equals("Plain Cheese")&&(mintt>=120))||(n111.equals("Spicy Delight")&&(mintt>=120))||(n111.equals("Fresh Veggi")&&(mintt>=120))){
           code="S2138";
           out.println("<html>");
            out.println("<head>");
            out.println("<body>");
                       out.println("<form action='discount1'>");

           out.println("<table border='0'  align='center'  width='440'>");           
          out.println("<tr>");out.println("<td>");out.println("<a href='pizza_coupon1.html'>WANT TO APPLY COPOUN</a>");out.println("</tr>");out.println("</td>");          
          out.println("</table>");
           out.println("</form>");
           out.println("</body>");
           out.println("</head>");
           out.println("</html>");
           }
             else if((n111.equals("Crispy Chicken")&&(mintt>130))||(n111.equals("Chicken Tandoori Grill")&&(mintt>130))||(n111.equals("Chicken Chilli Cheese")&&(mintt>130))){
           code= "S2139";
           out.println("<html>");
            out.println("<head>");
            out.println("<body>");
                       out.println("<form action='discount1'>");

           out.println("<table border='0'  align='center'  width='440'>");         
          out.println("<tr>");out.println("<td>");out.println("<a href='burger_coupon.html'>SEE COPOUNS AVAILABLE!!! </a>");out.println("</tr>");out.println("</td>");            
           out.println("</table>");
            out.println("</form>");
           out.println("</body>");
           out.println("</head>");
           out.println("</html>");
           }
             
            else if((n111.equals("Veg paneer grill")&&(mintt>=100))||(n111.equals("Schezwan grill ")&&(mintt>=100))||(n111.equals("Garlic cheese grill ")&&(mintt>=100))){
           code= "S21310";
            out.println("<html>");
            out.println("<head>");
            out.println("<body>");
                       out.println("<form action='discount1'>");

           out.println("<table border='0'  align='center'  width='440'>");
           out.println("<form action='discount1'>");
     
           out.println("<tr>");out.println("<td>");out.println("<a href='sandwich_coupon.html'>WANT TO APPLY COPOUN</a>");out.println("</tr>");out.println("</td>");   
          out.println("</table>");
           out.println("</form>");
           out.println("</body>");
           out.println("</head>");
           out.println("</html>");
           }
               
                
                 else{
                 out.println("<html>");
                
                  out.println("<body>");
                int assume=mintt;
                String mintt1=String.valueOf(assume);
                session.setAttribute("abc",mintt1);
                   out.println("<table border='0'  align='center'  width='440'>");
                 
               
           out.println("<tr>");out.println("<td>"); out.println("<h2><a href='billing1.jsp'> Make payment</a></h2>"); out.println("</td>");out.println("</tr>");
          out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                out.println("</table>");
              out.println("</body>");
          
           out.println("</html>");
             
           
               }
           
           session.setAttribute("tt", n777);
         session.setAttribute("ite",n111); 
           out.println("</body>"); 
           out.println("</html>"); 
            RequestDispatcher dis=request.getRequestDispatcher("./footer.html");
            dis.include(request,response);
        }
        catch(Exception e){
        
        System.out.println(e);
        }
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
