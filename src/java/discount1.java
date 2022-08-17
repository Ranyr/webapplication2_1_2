

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class discount1 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String a1;
              int  discount,total,k,save;
        try {
            
             HttpSession session=request.getSession(false); 
          //  String ttt=(String)session.getAttribute("tt");
             k=Integer.parseInt((String)session.getAttribute("tt"));
             
             String item=(String)session.getAttribute("ite");
             
           a1= request.getParameter("t1");///ccccc
       
           if((a1.equals("S2130")&&(item.equals("Onion Bhaji")))||(a1.equals("S2130")&&(item.equals("Chicken Soup")))||(a1.equals("S2130")&&(item.equals("Keema Kofte")) ) ){
             discount=50; 
             out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
             out.println("<h1><center>coupn applied succesfully</center></h1>");out.println("<br>");
             total= k-discount;
             out.println("<table align='center'>");   
             out.println("<tr>");out.println("<td>");  out.println("total amount="+total);out.println("</td>");  out.println("</tr>");
             out.println("</table>");
             save=total;
             String n7=String.valueOf(save);
             session.setAttribute("x2",n7);
             out.println("<h2><center><a href='billing.jsp'>Proceed to pay</a></center></h2>");
               out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                 out.println("</body>");
                     out.println("</html>");
          }
         
        else if((a1.equals("S2131")&&(item.equals("Mushroom chicken")))||(a1.equals("S2131")&&(item.equals("Breaded Chicken Supreme")))||(a1.equals("S2130")&&(item.equals("Fish and chip")) ) ){
            discount=50; 
             out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
             out.println("<h1><center>coupn applied succesfully</center></h1>");out.println("<br>");
             total= k-discount;
             out.println("<table align='center'>");   
             out.println("<tr>");out.println("<td>");  out.println("total amount="+total);out.println("</td>");  out.println("</tr>");
             out.println("</table>");
             save=total;
             String n7=String.valueOf(save);
             session.setAttribute("x2",n7);///////////////////////////////////////
                out.println("<h2><center><a href='billing.jsp'>Proceed to pay</a></center></h2>");
                  out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                 out.println("</body>");
                     out.println("</html>");
           }
           else if((a1.equals("S2132")&&(item.equals("Chocolate Milk")))||(a1.equals("S2132")&&(item.equals( "Milk Shakes")))||(a1.equals("S2132")&&(item.equals("Cold COffee vanillia")))){
            discount=50;
            out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
             out.println("<h1><center>coupn applied succesfully</center></h1>");out.println("<br>");
             total= k-discount;
               out.println("<table align='center'>");   
             out.println("<tr>");out.println("<td>");  out.println("total amount="+total);out.println("</td>");  out.println("</tr>");
             out.println("</table>");
             save=total;
             String n7=String.valueOf(save);
             session.setAttribute("x2",n7);
             out.println("<h2><center><a href='billing.jsp'>Proceed to pay</a></center></h2>");
               out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                 out.println("</body>");
                     out.println("</html>");
           }
           else if((a1.equals("S2133")&&(item.equals("Gazar Halwa(kg)")))||(a1.equals("S2133")&&(item.equals("Chocolate cake")))||(a1.equals("S2133")&&(item.equals("Gulab Jamun(pc)")))){
            discount=50; 
            out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
             out.println("<h1><center>coupn applied succesfully</center></h1>");out.println("<br>");
             total= k-discount;
              out.println("<table align='center'>");   
             out.println("<tr>");out.println("<td>");  out.println("total amount="+total);out.println("</td>");  out.println("</tr>");
             out.println("</table>");
             save=total;
           String n7=String.valueOf(save);
             session.setAttribute("x2",n7);
                out.println("<h2><center><a href='billing.jsp'>Proceed to pay</a></center></h2>");
                  out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                 out.println("</body>");
                     out.println("</html>");
           }
           
           
           else if((a1.equals("S2135")&&(item.equals("Mutter Paneer")))||(a1.equals("S2135")&&(item.equals("Tandoori Chicken")))||(a1.equals("S2135")&&(item.equals("Dal Makhani")))){
            discount=50; 
            out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
             out.println("<h1><center>coupn applied succesfully</center></h1>");out.println("<br>");
             total= k-discount;
              out.println("<table align='center'>");   
             out.println("<tr>");out.println("<td>");  out.println("total amount="+total);out.println("</td>");  out.println("</tr>");
             out.println("</table>");
             save=total;
             String n7=String.valueOf(save);
             session.setAttribute("x2",n7);
               out.println("<h2><center><a href='billing.jsp'>Proceed to pay</a></center></h2>");
                 out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                 out.println("</body>");
                     out.println("</html>");
           }
           else if((a1.equals("S2136")&&(item.equals("Mysore masala")))||(a1.equals("S2136")&&(item.equals("Masala dhosa")))||(a1.equals("S2136")&&(item.equals("Rava Masala")))){
            discount=50;
             out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
             out.println("<h1><center>coupn applied succesfully</center></h1>");out.println("<br>");
             total= k-discount;
           out.println("<table align='center'>");   
             out.println("<tr>");out.println("<td>");  out.println("total amount="+total);out.println("</td>");  out.println("</tr>");
             out.println("</table>");
             save=total;
             String n7=String.valueOf(save);
             session.setAttribute("x2",n7);
               out.println("<h2><center><a href='billing.jsp'>Proceed to pay</a></center></h2>");
                 out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                 out.println("</body>");
                     out.println("</html>");
           }
          
           else if((a1.equals("S2138")&&(item.equals("Plain Cheese")))||(a1.equals("S2138")&&(item.equals("Spicy Delight")))||(a1.equals("S2138")&&(item.equals("Fresh Veggi")))){
            discount=50; 
            out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
             out.println("<h1><center>coupn applied succesfully</center></h1>");out.println("<br>");
             total= k-discount;
              out.println("<table align='center'>");   
             out.println("<tr>");out.println("<td>");  out.println("total amount="+total);out.println("</td>");  out.println("</tr>");
             out.println("</table>");
             save=total;
           String n7=String.valueOf(save);
             session.setAttribute("x2",n7);
                out.println("<h2><center><a href='billing.jsp'>Proceed to pay</a></center></h2>");
                  out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                 out.println("</body>");
                     out.println("</html>");
           }
           else if((a1.equals("S2139")&&(item.equals("Crispy Chicken")))||(a1.equals("S2139")&&(item.equals("Chicken Tandoori")))||(a1.equals("S2139")&&(item.equals("Chicken Chilli Cheese")))){
            discount=35;
            out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
             out.println("<h1><center>coupn applied succesfully</center></h1>");out.println("<br>");
             total= k-discount;
             out.println("<table align='center'>");   
             out.println("<tr>");out.println("<td>");  out.println("total amount="+total);out.println("</td>");  out.println("</tr>");
             out.println("</table>");
             save=total;
             String n7=String.valueOf(save);
             session.setAttribute("x2",n7);
                out.println("<h2><center><a href='billing.jsp'>Proceed to pay</a></center></h2>");
                  out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                 out.println("</body>");
                     out.println("</html>");
           }
           else if((a1.equals("S21310")&&(item.equals("Veg paneer grill")))||(a1.equals("S21310")&&(item.equals("Schezwan grill ")))||(a1.equals("S21310")&&(item.equals("Garlic cheese grill ")))){
            discount=30;
            out.println("<html>");
             out.println("<body bgcolor='#FEE1E8'>");
             out.println("<h1><center>coupn applied succesfully</center></h1>");out.println("<br>");
             total= k-discount;
              out.println("<table align='center'>");   
             out.println("<tr>");out.println("<td>");  out.println("total amount="+total);out.println("</td>");  out.println("</tr>");
             out.println("</table>");
             save=total;
               String n7=String.valueOf(save);
             session.setAttribute("x2",n7);
               out.println("<h2><center><a href='billing.jsp'>Proceed to pay</a></center></h2>");
                 out.println("<tr>"); out.println("<td>"); out.println("<h2><a href='cancel.jsp'> cancel order</a></h2>"); out.println("</td>");out.println("</tr>");
                 out.println("</body>");
                     out.println("</html>");
           }
          
           else
           {
                out.println("<html>");
           
              out.println("</body bgcolor='#FEE1E8'>");  
           out.println("<h1>PLease enter valid coupon code!!!!</h1> ");
            out.println("<h2><center><a href=homepage.jsp'>try again</a></center></h2>");
            out.println("</body>");
                     out.println("</html>");
           }
             
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
