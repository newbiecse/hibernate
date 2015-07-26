package com.mkyong.stock;

public class StockAddress {
	private Integer addressId;
	private String address;
	private Stock stock;
	
	public StockAddress() {
	}
	
	
	public StockAddress(Integer addressId, String address, Stock stock) {
		this.addressId = addressId;
		this.address = address;
		this.stock = stock;
	}
	
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
}
