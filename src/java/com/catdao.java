
package com;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


public class catdao 
{
     static Connection con;
    public catdao(){}
    
    public static int save(catbean ct)
    {
       
        int k=0;
        try{
             if(con==null)
		{
                       con=ConnectionUtil.getConnection();

		}
		PreparedStatement ps=con.prepareStatement("INSERT INTO cat(name)values(?)");
		ps.setString(1,ct.getname());
		
                k=ps.executeUpdate();
       // int a=select id from cat where name=ct.getname();
                  
          }
       catch(Exception e)
       {System.out.println(e);}
      
         
        
      return k;  
    }
    
 public static List<catbean> getAllRecords()
  {
	List<catbean> list=new ArrayList<catbean>();
	System.out.println("in getAllRecords");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from cat");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			catbean ct=new catbean();
			ct.setid(rs.getInt("id"));
			ct.setname(rs.getString("name"));
                        
			
			list.add(ct);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
} 
 


public static catbean getRecordByid(int id)  //it will return single row from cat table wrt given id
{
	catbean  ct=null;
	System.out.println("int getRecordByID");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from cat where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			ct=new catbean();
			ct.setid(rs.getInt("id"));
			ct.setname(rs.getString("name"));
			
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return ct;
}
 
 
  public static int update(catbean ct)
{
	int status=0;
	System.out.println("in update");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("update cat set name=? where id=?");
		ps.setString(1,ct.getname());
                ps.setInt(2,ct.getid());
                
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
public static int delete(catbean ct)
{
	int status=0;
	System.out.println("in delete");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("delete from cat where id=?");
		ps.setInt(1,ct.getid());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	return status;
}
       
    
}
