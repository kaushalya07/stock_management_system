package com.stock;

public class stock {
	
	private String product_id;
	private String product_type;
	private String product_name;
	private Double product_unit_price;
	private int total_stock;
	
	public stock(String product_id, String product_type, String product_name, Double product_unit_price, int total_stock) {
		
		this.product_id = product_id;
		this.product_type = product_type;
		this.product_name = product_name;
		this.product_unit_price = product_unit_price;
		this.total_stock = total_stock;
	}

	public String getProduct_id() {
		return product_id;
	}

	public String getProduct_type() {
		return product_type;
	}

	public String getProduct_name() {
		return product_name;
	}


	public Double getProduct_unit_price() {
		return product_unit_price;
	}

	public int getTotal_stock() {
		return total_stock;
	}


}