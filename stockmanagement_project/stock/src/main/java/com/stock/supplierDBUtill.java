package com.stock;



import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class supplierDBUtill {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean insertsupplier(String Supplier_ID,String Supplier_Name,String email,String phone,String Address) {
		
		boolean isSuccess=false;
		
		//create db connection
		String url="jdbc:mysql://localhost:3306/mystocklevel";
		String user="root";
		String password="sliitY2S1#";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url, user, password);
			
			Statement stat=con.createStatement();
			
			String sql="insert into supplier values('"+Supplier_ID+"','"+Supplier_Name+"','"+email+"','"+phone+"','"+Address+"')";
			
			int rs=stat.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else
			{
				isSuccess=false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	//validate method
    public static List<supplier> validate(String s_id){
		
		ArrayList<supplier> supplier=new ArrayList<>();
		
		//create database connection
		
		String url="jdbc:mysql://localhost:3306/mystocklevel";
		String user="root";
		String password="sliitY2S1#";
		
		//validate
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection con=DriverManager.getConnection(url, user, password);
					
					Statement stat=con.createStatement();
					
					String sql="select * from supplier where supplier_id='"+s_id+"'";
					
					ResultSet rs=stat.executeQuery(sql);
					
					if(rs.next()) {
						String supplier_id=rs.getString(1);
						String supplier_name=rs.getString(2);
						String email=rs.getString(3);
						String phonenumber=rs.getString(4);
						String address=rs.getString(5);
						
						supplier s=new supplier(supplier_id,supplier_name,email,phonenumber,address);
						
						supplier.add(s);
					}
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		return supplier;
    }
    
    //listSupplierDetails method
    public static List<supplier> listSupplierDetails() {
		ArrayList<supplier> sup = new ArrayList<>();

		try {
			con = connect.getConnection();
			stmt = con.createStatement();

			String sql = "Select * From supplier";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String supplier_id=rs.getString(1);
				String supplier_name=rs.getString(2);
				String email=rs.getString(3);
				String phonenumber=rs.getString(4);
				String address=rs.getString(5);
				
				supplier s=new supplier(supplier_id,supplier_name,email,phonenumber,address);
				sup.add(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sup;
	}

    //updatesupplier method
    	public static boolean updatesupplier(String s_id,String s_name,String s_email,String s_phonnumber,String s_address) {
    		String url="jdbc:mysql://localhost:3306/mystocklevel";
    		String user="root";
    		String password="sliitY2S1#";
    		try {
    			
    			Class.forName("com.mysql.jdbc.Driver");
				
				Connection con=DriverManager.getConnection(url, user, password);
				
				Statement stat=con.createStatement();
				
				String sql="update supplier set supplier_id='"+s_id+"',supplier_name='"+s_name+"',email='"+s_email+"',phonenumber='"+s_phonnumber+"',address='"+s_address+"'"+
								"where supplier_id='"+s_id+"'";
				
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
    	
    	//getsupplierDetails method
    	public static List<supplier> getsupplierDetails(String sid){
    		String url="jdbc:mysql://localhost:3306/mystocklevel";
    		String user="root";
    		String password="sliitY2S1#";
    		
    		ArrayList<supplier> supplier=new ArrayList<>();
    		
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
				
				Connection con=DriverManager.getConnection(url, user, password);
				
				Statement stat=con.createStatement();
				
				String sql="select * from supplier where supplier_id='"+sid+"'";
				 ResultSet rs = stat.executeQuery(sql);
				
				while(rs.next()) {
					String supplier_id=rs.getString(1);
					String supplier_name=rs.getString(2);
					String email=rs.getString(3);
					String phonenumber=rs.getString(4);
					String address=rs.getString(5);
					
					supplier sup=new supplier(supplier_id,supplier_name,email,phonenumber,address);
					supplier.add(sup);
				}
    		}
    		catch(Exception e) {
    			e.printStackTrace();
    		}
    		return supplier;
    	}
    	//deletesupplier method
    	public static boolean deletesupplier(String sid) {
    		String url="jdbc:mysql://localhost:3306/mystocklevel";
    		String user="root";
    		String password="sliitY2S1#";
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
				
				Connection con=DriverManager.getConnection(url, user, password);
				
				Statement stat=con.createStatement();
				
				String sql="delete from supplier where supplier_id='"+sid+"'";
    			int r=stat.executeUpdate(sql);
    			
    			if(r>0) {
    				isSuccess=true;
    			}
    			else {
    				isSuccess=false;
    			}
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    		return isSuccess;
    	}
    	
}