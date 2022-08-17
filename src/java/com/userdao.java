
package com;
import java.sql.*;
import com.*;
import static com.ConnectionUtil.con;

import javax.servlet.http.*;
public class userdao 
{
    /*private Connection con;
    private String query;
    private PreparedStatement ps;
    private ResultSet rs;  */
    
    /* public userdao(Connection con)
     {this.con=con;}  */
    
   
    public  static User userlogin(String email,String password)  //if username,password is correct then only whole row is returned
    {    //otherwise only null is returned
        User u=null;
       
	System.out.println("int getRecordByID");
	try
	{
            
                  Class.forName("com.mysql.jdbc.Driver");
                  System.out.println("driver loaded successfully");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
                  System.out.println("connection done");
                    
                 /*PreparedStatement ps=con.prepareStatement("select * from user where email=? and password=?");
            		ps.setString(1,email);
                        ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			u=new User();
			u.setName(rs.getString("name"));
			u.setEmail(rs.getString("email"));
			u.setPassword(rs.getString("password"));
			u.setUid(rs.getInt("uid"));
			
		}  */
            
          
            PreparedStatement ps=con.prepareStatement("select name,email,password from user1 where email=? and password=?");
            		ps.setString(1,email);
                        ps.setString(2,password);
		ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
             u=new User();
             u.setName(rs.getString("name"));
             u.setEmail(rs.getString("email"));
             u.setPassword(rs.getString("password"));
             
            }    
               
	}
	catch(Exception e)
	{
		System.out.println(e);
        }
    return u;
     }

    
     //public static int update(String ph,String addrss,String email)
    public static int update(String ph,String addrss,int oid)
{
	int status=0;
	System.out.println("in update");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		
                
                
               
                PreparedStatement ps=con.prepareStatement("update user1 set contact_no=?,address=? where oid=?");
		ps.setString(1,ph);
                ps.setString(2,addrss);
                ps.setInt(3,oid);
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
    
  public static User getuserbyemail(String email)
  {
   User u=null;
       
	System.out.println("int getRecordByID");
	try
	{
            
                  Class.forName("com.mysql.jdbc.Driver");
                  System.out.println("driver loaded successfully");
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
                  System.out.println("connection done");
                 PreparedStatement ps=con.prepareStatement("select * from user1 where email=?");
            		ps.setString(1,email);
                      
		ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
             u=new User();
             u.setName(rs.getString("name"));
             u.setEmail(rs.getString("email"));
              u.setPassword(rs.getString("password"));
             u.setContact_no(rs.getString("contact_no"));
             u.setAddress(rs.getString("address"));
            }   
        }
        catch(Exception e)
        {System.out.println(e);}
  
  return u;
  
  }


}
   

