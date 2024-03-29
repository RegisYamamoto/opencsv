package com.regis.opencsv.model;

public class CSVUser {

	private String name;
	private String email;
	private String phoneNo;
	private String country;
	
	public CSVUser() {
	}

	public CSVUser(String name, String email, String phoneNo, String country) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "CSVUser [name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", country=" + country + "]";
	}

}