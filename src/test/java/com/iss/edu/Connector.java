package com.iss.edu;

import java.sql.*;

public class Connector {
	
	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "asdf1020";
		try {
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			rs = st.executeQuery("SELECT VERSION()");
			if (rs.next())
				System.out.println(rs.getString(1));
		} catch (SQLException sqlEX) {
			System.out.println(sqlEX);
		} finally {
			try {
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException sqlEX) {
				System.out.println(sqlEX);
			}
		}
	}
}
