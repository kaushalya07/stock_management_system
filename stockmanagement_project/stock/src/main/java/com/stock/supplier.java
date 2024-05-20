package com.stock;

public class supplier {

	private String supplier_id;
	private String supplier_name;
	private String email;
	private String phonenumber;
	private String address;
	public supplier(String supplier_id, String supplier_name, String email, String phonenumber, String address) {
		
		this.supplier_id = supplier_id;
		this.supplier_name = supplier_name;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
	}
	public String getSupplier_id() {
		return supplier_id;
	}
	public String getSupplier_name() {
		return supplier_name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public String getAddress() {
		return address;
	}
	
	
}
