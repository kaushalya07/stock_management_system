package com.stock;

import java.sql.Connection;
import java.sql.DriverManager;

public class connect {
	private static String url = "jdbc:mysql://localhost:3306/mystocklevel";
	private static String user = "root";
	private static String pass = "sliitY2S1#";
	private static Connection con;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);

		} catch (Exception e) {
			System.out.println("Database Connection is not successful!");
		}
		return con;
	}
}
