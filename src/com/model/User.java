package com.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private int customerId;
	private String pword;
	private String name;
	private String email;
	private String phone;
	private String gender;
	List<String> bought = new ArrayList<>();
	List<String> wished = new ArrayList<>();
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public List<String> getBought() {
			return bought;
	}

	public void setBought(List<String> bought) {
			this.bought = bought;
	}

	public List<String> getWished() {
			return wished;
	}

	public void setWished(List<String> wished) {
			this.wished = wished;
	}

	public User(){}
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String isGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}

}
