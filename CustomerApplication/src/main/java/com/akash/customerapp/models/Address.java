package com.akash.customerapp.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;


 @Embeddable
public class Address {
	 
	 
	@Column(length=20)
	private String street;
	@Column(length=20)
	private String city;
	@Column(length=20)
	private String district;
	@Column(length=10)
	private Integer pinNo;
	@Column(length=20)
	private String state;
	@Column(length=20)
	private String country;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Integer getPinNo() {
		return pinNo;
	}
	public void setPinNo(Integer pinNo) {
		this.pinNo = pinNo;
	}
	
}
