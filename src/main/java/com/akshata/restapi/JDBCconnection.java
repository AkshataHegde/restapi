package com.akshata.restapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCconnection {
	
	public Connection getConnection()
	{
		Connection connection=null;
		
		try {
			
		String connectionURL="jdbc:mysql://localhost:3306/mydatabase";
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		connection = DriverManager.getConnection(connectionURL, "root", "root");
		
		    }
		 catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e)
		{
			 
			e.getLocalizedMessage();
		}
		
		return connection;
		
		
	}
	
	
	

}
