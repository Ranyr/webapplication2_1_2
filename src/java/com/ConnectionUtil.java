package com;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil 
{
	static Connection con=null;
	public static Connection getConnection()
	{     
               try{

                  Class.forName("com.mysql.jdbc.Driver");
                  System.out.println("driver loaded successfully");
                  con=DriverManager.getConnection("jdbc:mysql://localhost:3307/project","root","root");
                  System.out.println("connection done");

                  }
            
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}

}

