package org.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("Oracle.jdbc.driver.OracleDriver");
		
		Connection c = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521.xe", "hr", "sqlsetup");
		
	
		String S ="Select * from employees";
		
		PreparedStatement PrepareStatement = c.prepareStatement(S);
		
		ResultSet rs  = PrepareStatement.executeQuery();
		
		  while (rs.next()) {
			String string = rs.getString("First_Name");
			String string2 = rs.getString("Last_Name");
			
			System.out.println(string);
			System.out.println(string2);
			
		}
		   c.close();
	}

}
