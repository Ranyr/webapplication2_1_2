
package com;

import static com.catdao.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class nmdao {
    
    
    public static catbean getRecordBynm(String name)
{
	catbean ct=null;
	System.out.println("int getRecordByID");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from cat where name=?");
		ps.setString(1,name);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			ct=new catbean();
			
			ct.setname(rs.getString("name"));
			ct.setid(rs.getInt("id"));
			
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return ct;
}
    
}
