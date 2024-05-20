package com.stock;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class stocklistDBUtill {
	private static boolean isSuccess;
	public static List<stock> validate(String p_id){
		
		ArrayList<stock> stock=new ArrayList<>();
		
		//create database connection
		
		String url="jdbc:mysql://localhost:3306/mystocklevel";
		String user="root";
		String password="sliitY2S1#";
		
		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, user, password);
			
			Statement stat=con.createStatement();
			
			String sql="select * from stocklist where product_id='"+p_id+"'";
			
			ResultSet rs=stat.executeQuery(sql);
			
			if(rs.next()) {
				String product_id=rs.getString(1);
				String product_type=rs.getString(2);
				String product_name=rs.getString(3);
				double product_unit_price=rs.getDouble(4);
				int total_stock=rs.getInt(5);
				
				stock s=new stock(product_id,product_type,product_name,product_unit_price,total_stock);
				
				stock.add(s);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return stock;
	}
	//updatestock method
	public static boolean updatestock(String p_id,String p_type,String p_name,String p_unitprice,String p_stock) {
		String url="jdbc:mysql://localhost:3306/mystocklevel";
		String user="root";
		String password="sliitY2S1#";
		try {
			

			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, user, password);
			
			Statement stat=con.createStatement();
			
			String sql="update stocklist set product_id='"+p_id+"',product_type='"+p_type+"',product_name='"+p_name+"',product_unit_price='"+p_unitprice+"',total_stock='"+p_stock+"'"
					+"where product_id='"+p_id+"'";
			
			int rs=stat.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//getstockDetails method
	public static List<stock> getstockDetails(String pid){
		String url="jdbc:mysql://localhost:3306/mystocklevel";
		String user="root";
		String password="sliitY2S1#";
		
		ArrayList<stock> stock=new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, user, password);
			
			Statement stat=con.createStatement();
			
			String sql="select * from stocklist where product_id='"+pid+"'";
			 ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				String product_id=rs.getString(1);
				String product_type=rs.getString(2);
				String product_name=rs.getString(3);
				double product_unit_price=rs.getDouble(4);
				int total_stock=rs.getInt(5);
				
				stock s=new stock(product_id,product_type,product_name,product_unit_price,total_stock);
				stock.add(s);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return stock;
	}
	
}
