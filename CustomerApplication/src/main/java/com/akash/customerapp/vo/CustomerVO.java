package com.akash.customerapp.vo;



	import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
	public class CustomerVO {
		     
		    @NotEmpty
		    @Pattern(regexp="[^0-9]*",message="First Name must not contain digits")
			private String firstName;
			private String middleName;
			@NotEmpty
			@Pattern(regexp="[^0-9]*",message="First Name must not contain digits")
			private String lastName;
			@NotEmpty
			private String gender;
			@Past(message="date Should be Past")
			private Date dateOfBirth;
			@NotEmpty
			private String panNo;
			@Email
			private String email;	
			@NotEmpty
			@Pattern(regexp="^[789][0-9]{9}")
			//@Size(min=10, max=10,message="mobile no must be 10 digit")
			private String mobileNo;
			
			private AddressVO address;
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
			public String getMobileNo() {
				return mobileNo;
			}
			public void setMobileNo(String mobileNo) {
				this.mobileNo = mobileNo;
			}
			public AddressVO getAddress() {
				return address;
			}
			public void setAddress(AddressVO address) {
				this.address = address;
			}
}
