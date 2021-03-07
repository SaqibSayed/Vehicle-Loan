package com.aditi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Login {

	@Id
	private int userid;
	private String password;
	private String name;

	@JsonProperty
	private boolean locked;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(int userid, String password, String name, boolean locked) {
		super();
		this.userid = userid;
		this.password = password;
		this.name = name;
		this.locked = locked;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	@Override
	public String toString() {
		return "Login [userid=" + userid + ", password=" + password + ", name=" + name + ", locked=" + locked + "]";
	}

}
