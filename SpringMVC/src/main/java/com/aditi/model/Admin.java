package com.aditi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	private int adminLoginId;
	private String adminPassword;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminLoginId, String adminPassword) {
		super();
		this.adminLoginId = adminLoginId;
		this.adminPassword = adminPassword;
	}

	public int getAdminLoginId() {
		return adminLoginId;
	}

	public void setAdminLoginId(int adminLoginId) {
		this.adminLoginId = adminLoginId;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminLoginId=" + adminLoginId + ", adminPassword=" + adminPassword + "]";
	}
	

}
