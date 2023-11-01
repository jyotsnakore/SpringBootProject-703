package com.jbk.model;

public class Category {

	private long categoryid;
	private String categoryName;
	private String description;
	private int discount;
	private int gst;
	private double deliveryCharges;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(long categoryid, String categoryName, String description, int discount, int gst,
			double deliveryCharges) {
		super();
		this.categoryid = categoryid;
		this.categoryName = categoryName;
		this.description = description;
		this.discount = discount;
		this.gst = gst;
		this.deliveryCharges = deliveryCharges;
	}
	public long getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(long categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	public double getDeliveryCharges() {
		return deliveryCharges;
	}
	public void setDeliveryCharges(double deliveryCharges) {
		this.deliveryCharges = deliveryCharges;
	}
	@Override
	public String toString() {
		return "Category [categoryid=" + categoryid + ", categoryName=" + categoryName + ", description=" + description
				+ ", discount=" + discount + ", gst=" + gst + ", deliveryCharges=" + deliveryCharges + "]";
	}
	
}
