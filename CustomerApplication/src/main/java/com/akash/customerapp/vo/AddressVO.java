package com.akash.customerapp.vo;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;


public class AddressVO { 
		@NotEmpty
		private String street;
		@NotEmpty
		private String city;
		@NotEmpty
		private String district;
		@NotNull
		private Integer pinNo;
		@NotEmpty
		private String state;
		@NotEmpty
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
