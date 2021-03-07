package com.aditi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	//User(user_id ,f_name, l_name, password, age, gender, emailid, mobile_no, address, role)
	@Id
	private int user_id;
	private String f_name;
	private String m_name;
	private String l_name;
	private String password;
	private int age;
	private String email_id;
	private long mobile_no;
	private String role;
	
	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

	

	public UserDetails(int user_id, String f_name, String m_name, String l_name, String password, int age,
			String email_id, long mobile_no, String role) {
		super();
		this.user_id = user_id;
		this.f_name = f_name;
		this.m_name = m_name;
		this.l_name = l_name;
		this.password = password;
		this.age = age;
		this.email_id = email_id;
		this.mobile_no = mobile_no;
		this.role = role;
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * public String getGender() { return gender; }
	 * 
	 * public void setGender(String gender) { this.gender = gender; }
	 */

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", f_name=" + f_name + ", m_name=" + m_name + ", l_name=" + l_name
				+ ", password=" + password + ", age=" + age  + ", email_id=" + email_id
				+ ", mobile_no=" + mobile_no + ", role=" + role + "]";
	}
	
	
}
