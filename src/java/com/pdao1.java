
package com;

import java.util.*;
import java.sql.*;
import com.*;
import static com.ConnectionUtil.con;
import javax.servlet.http.*;
public class pdao1 
{
    
 public static int save(productbean1 u)
 {
	int k=0;
	System.out.println("in save");
	try
	{
		if(con==null)
		{
                       con=ConnectionUtil.getConnection();

		} //id=category
		PreparedStatement ps=con.prepareStatement("INSERT INTO products2(fooditem,id,quantity,price)values(?,?,?,?)");
		ps.setString(1,u.getFooditem());
               //ps.setString(2,u.getid());//here save ctnm instead of ctid
               
          //get categorynm by catid*********** firstly we recevied cid from dropdown menu from prodform1.jsp page************************************
              int id=Integer.parseInt(u.getId());
             catdao ct=new catdao();
             catbean ans= ct.getRecordByid(id);   
               String cnm=ans.getname();
          //**********************************************************************
		ps.setString(2,cnm);
		ps.setInt(3,u.getQuantity());
                ps.setDouble(4,u.getPrice());
		//ps.setString(5,u.getppic()) ;
                k=ps.executeUpdate();
                

	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return k;
}  
    
 
 
 
public static int update(productbean1 u)
{
	int status=0;
	System.out.println("in update");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		
                
                
               
                PreparedStatement ps=con.prepareStatement("update products2 set fooditem=?,id=?,quantity=?,price=? where pid=?");
		ps.setString(1,u.getFooditem());
                ps.setString(2,u.getId());
                ps.setInt(3,u.getQuantity());
                ps.setDouble(4,u.getPrice());
                ps.setInt(5,u.getPid());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
public static int delete(productbean1 u)
{
	int status=0;
	System.out.println("in delete");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("delete from products2 where Pid=?");
		ps.setInt(1,u.getPid());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	return status;
}
public static List<productbean1> getAllRecords()
{
	List<productbean1> list=new ArrayList<productbean1>();
	System.out.println("in getAllRecords");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from products2");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			productbean1 u=new productbean1();
                        
                        System.out.println("id= "+rs.getInt("pid"));
                          System.out.println("nm= "+rs.getString("fooditem"));
                           // System.out.println("ppic= "+rs.getString("ppic"));
                            
			u.setPid(rs.getInt("pid"));
			//u.setName(rs.getString("name"));
                        u.setFooditem(rs.getString("fooditem"));
                        u.setId(rs.getString("id"));
			u.setQuantity(rs.getInt("quantity"));
                        u.setPrice(rs.getDouble("price"));
			//u.setppic(rs.getString("ppic"));
			list.add(u);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
}



public static productbean1 getRecordByid(int pid)
{
	productbean1 u=null;
	System.out.println("int getRecordByID");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from products2 where pid=?");
		ps.setInt(1,pid);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			u=new productbean1();
			u.setPid(rs.getInt("pid"));
			u.setFooditem(rs.getString("fooditem"));
			u.setId(rs.getString("id"));
                        u.setQuantity(rs.getInt("quantity"));
			u.setPrice(rs.getDouble("price"));
			//u.setppic(rs.getString("ppic"));
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return u;
}
    
  



public static List<productbean1> getAllRecordsbyctnm(String id)  //id=ctnm
{
	List<productbean1> list=new ArrayList<productbean1>();
	System.out.println("in getAllRecords");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from products2 where id=? ");
                ps.setString(1,id);
		ResultSet rs=ps.executeQuery();
               
		while(rs.next())
		{
			productbean1 u=new productbean1();
                        
                        System.out.println("pid= "+rs.getInt("pid"));
                          System.out.println("nm= "+rs.getString("fooditem"));
                           // System.out.println("ppic= "+rs.getString("ppic"));
                            
			u.setPid(rs.getInt("pid"));
			u.setFooditem(rs.getString("fooditem"));
                        u.setId(rs.getString("id"));
			u.setQuantity(rs.getInt("quantity"));
                        u.setPrice(rs.getDouble("price"));
			//u.setppic(rs.getString("ppic"));
			list.add(u);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
}




public static List<cartbean> getctproducts(ArrayList<cartbean> cartList)
{
  
    
   List<cartbean> prds=new ArrayList<cartbean>();
  try
  {    
            if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
      
      
      if(cartList.size()>0)
      {
         for(cartbean item:cartList)
         {
            
		PreparedStatement ps=con.prepareStatement("select * from products2 where pid=?");
                ps.setInt(1,item.getPid());
		ResultSet rs=ps.executeQuery();
               
		if(rs.next())
		{
			 cartbean rw=new cartbean();
                          rw.setFooditem(rs.getString("fooditem"));
                          rw.setId(rs.getString("id"));
                          rw.setQuantity(item.getQuantity());
                          rw.setPrice(rs.getDouble("price")*item.getQuantity());
			  rw.setPid(rs.getInt("pid"));
                          prds.add(rw);
                } 
         
         }
      
      }
     
  
  }
   
   catch(Exception e){System.out.println(e);}
   
 return prds;
}



public static double gettotalcartprice(ArrayList<cartbean> cartList)
{
    double sum=0;
    try{
         if(cartList.size()>0){
             for(cartbean item:cartList)
             {
                PreparedStatement ps=con.prepareStatement("select * from products2 where pid=? ");
                ps.setInt(1,item.getPid());
		ResultSet rs=ps.executeQuery();
                 while(rs.next())
                 {
                     sum =sum+rs.getDouble("price")*item.getQuantity();
                     
                     
             
                 } 
             
             }
             
           
         
      }
    }
    catch(Exception e){System.out.println(e);}
    
  return sum;
}

  public static productbean1 getSingleproduct(int pid)
  {
   
      
     productbean1 u=null;
	System.out.println("int getRecordByID");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from products2 where pid=?");
		ps.setInt(1,pid);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			u=new productbean1();
			u.setPid(rs.getInt("pid"));
			u.setFooditem(rs.getString("fooditem"));
			u.setId(rs.getString("id"));  //category
			u.setPrice(rs.getDouble("price"));
                        
			//u.setppic(rs.getString("ppic"));
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return u;
     
   
  }


}