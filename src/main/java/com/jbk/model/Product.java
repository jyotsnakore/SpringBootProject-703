package com.jbk.model;

import java.sql.Date;

public class Product {
  
	private long productId;
	private String productName;
	private double productPrice;
	private int productQty;
	private String productDescription;
	private Date mfdate;
	private Date expdate;
	private Supplier supplier;
	private Category category;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long productId, String productName, double productPrice, int productQty, String productDescription,
			Date mfdate, Date expdate, Supplier supplier, Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty = productQty;
		this.productDescription = productDescription;
		this.mfdate = mfdate;
		this.expdate = expdate;
		this.supplier = supplier;
		this.category = category;
	}
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Date getMfdate() {
		return mfdate;
	}
	public void setMfdate(Date mfdate) {
		this.mfdate = mfdate;
	}
	public Date getExpdate() {
		return expdate;
	}
	public void setExpdate(Date expdate) {
		this.expdate = expdate;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQty=" + productQty + ", productDescription=" + productDescription + ", mfdate=" + mfdate
				+ ", expdate=" + expdate + ", supplier=" + supplier + ", category=" + category + "]";
	}
	
	
}