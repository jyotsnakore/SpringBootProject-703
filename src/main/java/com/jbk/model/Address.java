package com.jbk.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Address {
	
	@Min(1)
	@Max(4)
	private long addressId;
	
	@NotBlank(message="City Nameshould not be blank")
	@Pattern(regexp="^[a-zA-Z]+$",message="Invalid City Name")
	private String city;
	
	@NotBlank(message="Distict should not be blank")
	@Pattern(regexp="^[a-zA-Z]+$",message="District Name should be Alphabetical character")
	private String district;
	
	@NotBlank(message="Distict should not be blank")
	@Pattern(regexp="^[a-zA-Z]+$",message="District Name should be Alphabetical character")
	private String state;
	
	@Pattern(regexp="^[0-9]+$",message="Invalid Pincode")
	@Size(min=6,max=6,message="PinCode Should be 6 digit")
	private String pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(long addressId, String city, String district, String state, String pincode) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", district=" + district + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	
	

}
