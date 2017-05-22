package com.akash.customerapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
@Table(name="customer")
public class Customer {
	    @GenericGenerator(name = "sequence_cust_id", strategy = "com.akash.customerapp.util.MyIdGenerator")
	    @GeneratedValue(generator = "sequence_cust_id") 
	     @Id
	     @Column(length=10)
	     private String customerId;
	    @NotEmpty
	    @Column(length=20)
		private String firstName;
	    @Column(length=20)
		private String middleName;
		@NotEmpty
		@Column(length=20)
		private String lastName;
		@NotEmpty
		@Column(length=10)
		private String gender;
		@Past
		@Temporal(TemporalType.DATE)
		private Date dateOfBirth;
		@NotEmpty
		@Column(length=10)
		private String panNo;
		@Email
		@Column(length=30)
		private String email;	
		@NotNull
		@Pattern(regexp="^[789][0-9]{9}")
		@Column(length=10)
		private Long mobileNo;
		
		@NotEmpty
		@Embedded
		private Address address;
		
		public String getCustomerId() {
			return customerId;
		}
		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
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
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getPanNo() {
			return panNo;
		}
		public void setPanNo(String panNo) {
			this.panNo = panNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(Long mobileNo) {
			this.mobileNo = mobileNo;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
}
