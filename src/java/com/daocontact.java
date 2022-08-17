
package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.daocontact.*;

public class daocontact {
    static Connection con;
   public static List<userbeancontact> getAllRecords()
{
	List<userbeancontact> list=new ArrayList<userbeancontact>();
	System.out.println("in getAllRecords");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from contact_us");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			userbeancontact u=new userbeancontact();
			
			u.setName(rs.getString("name"));
			u.setEmail(rs.getString("email"));
			u.setMessage(rs.getString("message"));
                       
                               
			list.add(u);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;
}
}
