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
			
//			return DriverManager.getConnection("jdbc:mysql://localhost:3306/sapientdb", "root", "kanchan@1");
//
//			String userName = "scott";
//			String password = "tiger";
//			
//			Connection con = DriverManager.getConnection(url, userName, password);
//			
//			Statement stmt = con.createStatement();
//			
//			ResultSet rs = stmt.executeQuery("select * from product");
//			
//			while(rs.next()) {
//				System.out.println("Prod Id: "+rs.getString(1)+ " Prod Name: "+rs.getString(2));
//			}
//			
//		} catch (ClassNotFoundException e) {
//			
//			e.printStackTrace();
//		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//}