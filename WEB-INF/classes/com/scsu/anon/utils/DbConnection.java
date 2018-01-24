package com.scsu.anon.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	String databaseUrl = "jdbc:mysql://localhost:3306/test";
	String userName = "root";
	String password = "root";
	
	public Connection createNewConnection() {
		
		Connection connection = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = (Connection) DriverManager.getConnection(databaseUrl, userName, password);
			System.out.println("Connection: "+connection);
		}
		catch(SQLException sqle)
		{
			System.err.println("SQLException: "+sqle);
			return null;
		}
		catch(ClassNotFoundException cnfe)
		{
			System.err.println("ClassNotFoundException: "+cnfe);
			return null;
		}

		return connection;
	}


}
