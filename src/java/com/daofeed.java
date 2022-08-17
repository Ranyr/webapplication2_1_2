
package com;


import com.ConnectionUtil.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.userbeanfeed;
import com.daofeed.*;

public class daofeed {
    static Connection con;
   public static List<userbeanfeed> getAllRecords()
{
	List<userbeanfeed> list=new ArrayList<userbeanfeed>();
	System.out.println("in getAllRecords");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from feedbacks");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			userbeanfeed u=new userbeanfeed();
			
			u.setName(rs.getString("name"));
			u.setEmail(rs.getString("email"));
			u.setAge(rs.getString("age"));
                        u.setFood_quality(rs.getString("food_quality"));
			 u.setMenu_variety(rs.getString("menu_variety"));
                          u.setSpeed_of_service(rs.getString("speed_of_service"));
                           u.setTaste(rs.getString("taste"));
                            u.setOrder_accuracy(rs.getString("order_accuracy"));
                             u.setPrice(rs.getString("price"));
                           //   u.setOverall_experience(rs.getString("overall_experience"));
                               u.setComments(rs.getString("comments"));
                               
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
