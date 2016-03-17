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
	List<String> bought;
	List<String> wished;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public List<String> getBought() {
		if(bought == null || bought.size()==0)
			return new ArrayList<String>();
		else
			return bought;
	}

	public void setBought(List<String> bought) {
		if(bought == null || bought.size()==0)
			this.bought = new ArrayList<String>();
		else 
			this.bought = bought;
	}

	public List<String> getWished() {
		if(wished == null || wished.size()==0)
			return new ArrayList<String>();
		else
			return wished;
	}

	public void setWished(List<String> wished) {
		if(wished == null || wished.size()==0)
			this.wished = new ArrayList<String>();
		else 
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
