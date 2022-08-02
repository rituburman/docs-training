package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GetConnection {

	public static Connection getSql() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null; 
		
	}
	
	public static void main(String[] args) {
		System.out.println(getSql());
	}
	
}
			
