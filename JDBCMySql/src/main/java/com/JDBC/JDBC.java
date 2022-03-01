package com.JDBC;
import java.sql.*;


public class JDBC {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/workers", "root", "Password@123");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT locate('a',First_Name,2) AS FindPos from worker_table WHERE First_Name='Amitabh'");
		
		while(rs.next()) {
		
		
		String FindPosition=rs.getString("FindPos");
		
		System.out.println("The position of a in Amitabh is "+FindPosition);
		}
		
		st.close();
		con.close();
		
	}

}
