package com.jsp.servlets_project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProjectConnection {
	
	public static Connection getProjectConnection() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url ="jdbc:mysql://localhost:3306/project-servlets";
			String user ="root";
			String pass ="0786";
			
		  return	DriverManager.getConnection(url, user, pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	   
	}

}
