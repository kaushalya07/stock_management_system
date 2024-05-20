package com.stock;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userDBUtil {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	//  validating a user's login credentials.
	public static boolean validate(String username, String password) {

		try {
			//database connection
			con = connect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from user where UserName='" + username + "' and Password='" + password + "'";
			rs = stmt.executeQuery(sql);

			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;
	}

	// Method for retrieving user information based on username.
	public static List<Users> getUser(String userName) {

		ArrayList<Users> user = new ArrayList<>();

		try {

			con = connect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from user where UserName='" + userName + "'";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				
				String id = rs.getString(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String username = rs.getString(4);
				String password = rs.getString(5);
				String phone = rs.getString(6);
				String type = rs.getString(7);

				Users u = new Users(id, name, email, username, password, phone, type);
				user.add(u);
			}

		} catch (Exception e) {

		}

		return user;
	}
	
	
}


