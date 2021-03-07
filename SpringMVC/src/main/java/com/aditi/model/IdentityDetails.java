package com.aditi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class IdentityDetails {

	@Id
	private int indentity_id;
	private String adhaar_card;
	private String pan_card;
	private String photo;
	private String paySlip;
	private int  user_id;
	
	public IdentityDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public IdentityDetails(int indentity_id, String adhaar_card, String pan_card, String photo, String paySlip, int user_id) {
		super();
		this.indentity_id = indentity_id;
		this.adhaar_card = adhaar_card;
		this.pan_card = pan_card;
		this.photo = photo;
		this.paySlip = paySlip;
		this.user_id = user_id;
	}

	
	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getIndentity_id() {
		return indentity_id;
	}

	public void setIndentity_id(int indentity_id) {
		this.indentity_id = indentity_id;
	}

	public String getAdhaar_card() {
		return adhaar_card;
	}

	public void setAdhaar_card(String adhaar_card) {
		this.adhaar_card = adhaar_card;
	}

	public String getPan_card() {
		return pan_card;
	}

	public void setPan_card(String pan_card) {
		this.pan_card = pan_card;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPaySlip() {
		return paySlip;
	}

	public void setPaySlip(String paySlip) {
		this.paySlip = paySlip;
	}


	@Override
	public String toString() {
		return "IdentityDetails [indentity_id=" + indentity_id + ", adhaar_card=" + adhaar_card + ", pan_card="
				+ pan_card + ", photo=" + photo + ", paySlip=" + paySlip + ", user_id=" + user_id + "]";
	}

	
	





}
