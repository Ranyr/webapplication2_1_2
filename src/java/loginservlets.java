


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginservlets")
public class loginservlets extends HttpServlet 
{
private static final long serialVersionUID = 1L;

public loginservlets() 
{
super();

}

protected void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html; charset=\"UTF-8\"");
PrintWriter servletout = response.getWriter();
HttpSession session = request.getSession();
//session.invalidate();
String signin =(String)session.getAttribute("signin");
  if(session.isNew() || signin== null) 
    
        { printSignInForm(servletout, "loginservlets");}
                      
else 
      {printWelcomeBack(servletout, signin);}

}



private void printWelcomeBack(PrintWriter servletout,String signin) {

servletout.println("Hey, you're "+ signin+ ", aren't you ? Welcome back !!");

}





private void printSignInForm(PrintWriter servletout, String action) 
{

  servletout.println("<form method='post' action='"+ action+"'>"+
                   "<label>"+ "Please sign in"+ "</label>"+ "<input type='text' name='signin'/>"+
                    "<button type='submit'>"+ "Sign in"+ " </button>");
}
   


protected void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException
{
    
PrintWriter servletout = response.getWriter();
String signin= request.getParameter("signin");
HttpSession session = request.getSession();
     if(signin != null) 
         {printThanks(servletout, signin, "loginservlets");
          session.setAttribute("signin", signin);
         }
    else 
     
         {printSignInForm(servletout, "loginservlets");}

}

private void printThanks(PrintWriter servletout, String signin, String string) {
servletout.println("Thanks for signing in ,"
+ signin
+ "Please "
+ "<a href='"
+ string
+ " '>"
+ "visit again !"
+ " ");}}
