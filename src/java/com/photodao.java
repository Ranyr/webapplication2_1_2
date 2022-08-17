
package com;

import static com.ConnectionUtil.con;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;


public class photodao 
{
 



public static int save(photobean u)
 {
	int k=0;
	System.out.println("in save");
	try
	{
		if(con==null)
		{
                       con=ConnectionUtil.getConnection();

		} //id=category
		PreparedStatement ps=con.prepareStatement("INSERT INTO products3(fooditem,id,quantity,price,photo)values(?,?,?,?,?)");
		ps.setString(1,u.getFooditem());
               //ps.setString(2,u.getId());//here save ctnm instead of ctid
               
          //get categorynm by catid*********** firstly we recevied cid from dropdown menu from prodform1.jsp page************************************
              int id=Integer.parseInt(u.getId());
             catdao ct=new catdao();
             catbean ans= ct.getRecordByid(id);   
               String cnm=ans.getname();
          //**********************************************************************
		ps.setString(2,cnm);
		ps.setInt(3,u.getQuantity());
                ps.setDouble(4,u.getPrice());
		ps.setString(5,u.getPhoto()) ;//just save photoname in database
                k=ps.executeUpdate();
                

	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return k;
}  


public static List<photobean> getdata()
{
List<photobean> list=new ArrayList<photobean>();
try{
if(con==null)
		{
                       con=ConnectionUtil.getConnection();

		} //id=category
 PreparedStatement ps=con.prepareStatement("select * from products3");
           ResultSet rs=ps.executeQuery();
           while(rs.next())
		{
			photobean u=new photobean();
                        
                        
			u.setPid(rs.getInt("pid"));
			
                        u.setFooditem(rs.getString("fooditem"));
                        u.setId(rs.getString("id"));
			u.setQuantity(rs.getInt("quantity"));
                        u.setPrice(rs.getDouble("price"));
			u.setPhoto(rs.getString("photo"));
			list.add(u);
		}


}

catch(Exception e){}

return list;
}

public static List<photobean> getdatabyctg(String ctg)
{
 photobean u=null;
       List<photobean> list=new ArrayList<photobean>();
	System.out.println("int getRecordByID");
	try
	{
		if(con==null)
		{
			con=ConnectionUtil.getConnection();
		}
		PreparedStatement ps=con.prepareStatement("select * from products3 where id=?");
		ps.setString(1,ctg);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			u=new photobean();
			u.setPid(rs.getInt("pid"));
			u.setFooditem(rs.getString("fooditem"));
			u.setId(rs.getString("id"));
                        u.setQuantity(rs.getInt("quantity"));
			u.setPrice(rs.getDouble("price"));
			u.setPhoto(rs.getString("photo"));
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
