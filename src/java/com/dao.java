package com;
import com.ConnectionUtil.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.userbean;
import com.dao.*;

public class dao 
{
 static Connection con;
 public static int save(userbean u)
 {
	int status=0;
	System.out.println("in save");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("insert into adminmenu1(foodcategory,item_name,price) values(?,?,?)");
		ps.setString(1,u.getFoodcategory());
		ps.setString(2,u.getItem_name());
		ps.setString(3,u.getPrice());
		
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
public static int update(userbean u)
{
	int status=0;
	System.out.println("in update");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("update adminmenu1 set foodcategory=?,item_name=?,price=? where id=?");
		ps.setString(1,u.getFoodcategory());
		ps.setString(2,u.getItem_name());
		ps.setString(3,u.getPrice());
		ps.setInt(4,u.getId());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return status;
}
public static int delete(userbean u)
{
	int status=0;
	System.out.println("in delete");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("delete from adminmenu1 where id=?");
		ps.setInt(1,u.getId());
		status=ps.executeUpdate();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

	return status;
}
public static List<userbean> getAllRecords()
{
	List<userbean> list=new ArrayList<userbean>();
	System.out.println("in getAllRecords");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from adminmenu1");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			userbean u=new userbean();
			u.setId(rs.getInt("id"));
			u.setFoodcategory(rs.getString("foodcategory"));
			u.setItem_name(rs.getString("item_name"));
			u.setPrice(rs.getString("price"));
			
			list.add(u);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
}

public static userbean getRecordById(int id)
{
	userbean u=null;
	System.out.println("int getRecordByID");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from adminmenu1 where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			u=new userbean();
			u.setId(rs.getInt("id"));
			u.setFoodcategory(rs.getString("foodcategory"));
			u.setItem_name(rs.getString("item_name"));
			u.setPrice(rs.getString("price"));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return u;
}
}
