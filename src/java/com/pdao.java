
package com;

import static com.dao.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class pdao {
    
 /*static Connection con;
 public static int save(productbean u)
 {
	int k=0;
	System.out.println("in save");
	try
	{
		if(con==null)
		{
                       con=ConnectionUtil.getConnection();

		} //id=category
		PreparedStatement ps=con.prepareStatement("INSERT INTO products(name,id,quantity,price)values(?,?,?,?)");
		ps.setString(1,u.getname());
		ps.setString(2,u.getid());//here save ctnm instead of ctid
		ps.setString(3,u.getquantity());
                ps.setInt(4,u.getprice());
		 
                k=ps.executeUpdate();
                

	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return k;
}  */
  
 public static int save(productbean u)
 {
	int k=0;
	System.out.println("in save");
	try
	{
		if(con==null)
		{
                       con=ConnectionUtil.getConnection();

		} //id=category
		PreparedStatement ps=con.prepareStatement("INSERT INTO products(name,id,quantity,price)values(?,?,?,?)");
		ps.setString(1,u.getname());
               //ps.setString(2,u.getid());//here save ctnm instead of ctid
               
          //get categorynm by catid***********************************************
              int id=Integer.parseInt(u.getid());
             catdao ct=new catdao();
             catbean ans= ct.getRecordByid(id);   
               String nm=ans.getname();
          //**********************************************************************
		ps.setString(2,nm);
		ps.setString(3,u.getquantity());
                ps.setInt(4,u.getprice());
		 
                k=ps.executeUpdate();
                

	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return k;
}  
    
 
 
 
 public static int update(productbean u)
{
	int status=0;
	System.out.println("in update");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("update products set name=?,id=?,quantity=?,price=? where pid=?");
		ps.setString(1,u.getname());
                ps.setString(2,u.getid());
                ps.setString(3,u.getquantity());
		ps.setInt(4,u.getprice());
		ps.setInt(5,u.getpid());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
public static int delete(productbean u)
{
	int status=0;
	System.out.println("in delete");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("delete from products where pid=?");
		ps.setInt(1,u.getpid());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	return status;
}
public static List<productbean> getAllRecords()
{
	List<productbean> list=new ArrayList<productbean>();
	System.out.println("in getAllRecords");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from products");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			productbean u=new productbean();
			u.setpid(rs.getInt("pid"));
			u.setname(rs.getString("name"));
                        u.setid(rs.getString("id"));
			u.setquantity(rs.getString("quantity"));
                        u.setprice(rs.getInt("price"));
			
			list.add(u);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
}

public static productbean getRecordByid(int pid)
{
	productbean u=null;
	System.out.println("int getRecordByID");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from products where pid=?");
		ps.setInt(1,pid);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			u=new productbean();
			u.setpid(rs.getInt("pid"));
			u.setname(rs.getString("name"));
			u.setid(rs.getString("id"));
                        u.setquantity(rs.getString("quantity"));
			u.setprice(rs.getInt("price"));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return u;
}

 
 
 
 
 
 
    
}
