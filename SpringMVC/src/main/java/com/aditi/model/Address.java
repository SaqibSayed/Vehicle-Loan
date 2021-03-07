package com.aditi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address {

	@Id
	private int address_id;
	private String address_line1;
	private String state;
	private String city;
	private int pincode;
	private int user_id;
	
	public Address(int address_id, String address_line1, String state, String city, int pincode,int user_id) {
		super();
		this.address_id = address_id;
		this.address_line1 = address_line1;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.user_id = user_id;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	
	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", address_line1=" + address_line1 + ", state=" + state + ", city="
				+ city + ", pincode=" + pincode + ", user_id=" + user_id + "]";
	}

	
	
}
