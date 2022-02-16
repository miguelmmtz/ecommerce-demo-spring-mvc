package com.ecommerce.app.entity;

public class Product {
	private Integer productId;
	private String productName;
	private String productCategory;
	private Double productPrice;
	private Double productQuantity;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Double getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(Double productQuantity) {
		this.productQuantity = productQuantity;
	}
	
}
