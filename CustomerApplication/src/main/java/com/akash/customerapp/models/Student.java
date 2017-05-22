package com.akash.customerapp.models;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	//@NotEmpty
	private String firstName;
	//@NotEmpty
	private String lastName;
	//@NotEmpty
	private String gender;
	//@Past
	private Date dateOfBirth;
	//@NotNull
	//@Pattern(regexp="^[789][0-9]{9}")
	private long mobileNo;
	//@Email
	private String email;	
	//@NotEmpty
	private String stream;
	//@NotEmpty
	private ArrayList<String> cource;
	//@NotEmpty
	private Address address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public ArrayList<String> getCource() {
		return cource;
	}
	public void setCource(ArrayList<String> cource) {
		this.cource = cource;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
} 