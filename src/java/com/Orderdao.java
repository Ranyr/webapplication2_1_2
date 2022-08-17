
package com;

import static com.ConnectionUtil.con;
import static com.catdao.con;
import static com.dao.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import javax.servlet.http.*;


public class Orderdao {
    
 static Connection con;
    
  public static int save(Order md){
     int st=0,flag=0,oid=0;
     PreparedStatement ppp;
     if(con==null)
          {con=ConnectionUtil.getConnection();}
     try
     {   
          ppp=con.prepareStatement("insert into odrs1(name,email,pid,date,quantity)values(?,?,?,?,?)");
         ppp.setString(1,md.getName());
         ppp.setString(2,md.getEmail());
        // ppp.setInt(1,md.getUid());
          ppp.setInt(3,md.getPid());
          ppp.setString(4,md.getDate());
          ppp.setInt(5,md.getQuantity());
          st=ppp.executeUpdate();
          flag=1;
     }
     catch(Exception e){System.out.println(e);}
  
    try 
    {
        if(flag==1)
          { ppp=con.prepareStatement("select * from odrs1 where email=? AND pid=? AND  quantity=?");
            ppp.setString(1,md.getEmail());
            ppp.setInt(2,md.getPid());
            ppp.setInt(3,md.getQuantity());
            ResultSet rs=ppp.executeQuery();
            while(rs.next())
		{    oid=rs.getInt("orderid");
                }
          }
    }
    catch(Exception e)
    {System.out.println(e);}
    return oid;
  // return st;
  }  
    

///////////////////////////////////////////////////////////////////////////////////////////// 

 ////////////////////////////////////////////////////////////////////////////////////////
    
//public static List<Order> disporder(int v)  //call came from showorder.jsp page  v=uid
 public static List<Order> disporder(String v)//v=email
 {
   List<Order> lst=new ArrayList<>();
 try
 {		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		//PreparedStatement ps=con.prepareStatement("select * from odrs where uid=?");
		//ps.setInt(1,v);
                
               PreparedStatement ps=con.prepareStatement("select * from odrs1 where email=?");
		ps.setString(1,v);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{    
                    Order od=new Order();
                 
                   
                    int pid=rs.getInt("pid");
                    productbean1 pbean=pdao1.getSingleproduct(pid);
             ///////////////////////////////////////////////////////////////////////////////
                    User uum=userdao.getuserbyemail(v);
                    
                    
                    
                    
                    //od.setUid(v);
                  // od.setContact_no(uum.getContact_no());
                   //od.setAddress(uum.getAddress());
                   od.setContact_no(rs.getString("contact_no"));
                   od.setAddress(rs.getString("address"));
                    od.setPid(pbean.getPid());
                    od.setFooditem(pbean.getFooditem());
                    od.setName(uum.getName());//fooditem    getnames----username in Order.java
                    
                    od.setId(pbean.getId());//category
                    od.setDate(rs.getString("date"));
                    od.setQuantity(rs.getInt("quantity"));
                    od.setPrice(pbean.getPrice()*rs.getInt("quantity"));
                    od.setOrderid(rs.getInt("orderid"));
                    lst.add(od);	
			
		}
 
 
 }
 catch(Exception e)
 {System.out.println(e);}
 
 
  return lst;
 }
 
 public static int cancelorder(int orderid)
 {  
    int status=0;
	System.out.println("in delete");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("delete from odrs1 where orderid=?");
		ps.setInt(1,orderid);
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	return status;
 }
 
 
 /////////////////////////////////////////////////////////////////////////////////////////////////////
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
		
                
                
               
                PreparedStatement ps=con.prepareStatement("update odrs1 set contact_no=?,address=? where orderid=?");
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
 
}
/*




*/