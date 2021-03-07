package com.aditi.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class LoanDetails {
	
	@Id
	private int loanid;
	private int loan_amount;
	private int loan_tenure;
	private int roi;
	private int emi;
	private String account_type;
	private int processing_fee;
	private String application_status;
	private String remarks;
	private int user_id;
//	
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable =  false, updatable = false)
//	private UserDetails userDetails;
	
	public LoanDetails() {
		// TODO Auto-generated constructor stub
	}

	public LoanDetails(int loanid, int loan_amount, int loan_tenure, int roi, int emi, String account_type,
			int processing_fee, String application_status, String remarks, int user_id) {
		super();
		this.loanid = loanid;
		this.loan_amount = loan_amount;
		this.loan_tenure = loan_tenure;
		this.roi = roi;
		this.emi = emi;
		this.account_type = account_type;
		this.processing_fee = processing_fee;
		this.application_status = application_status;
		this.remarks = remarks;
		this.user_id = user_id;
		
	}

	public int getLoanid() {
		return loanid;
	}

	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}

	public int getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(int loan_amount) {
		this.loan_amount = loan_amount;
	}

	public int getLoan_tenure() {
		return loan_tenure;
	}

	public void setLoan_tenure(int loan_tenure) {
		this.loan_tenure = loan_tenure;
	}

	public int getRoi() {
		return roi;
	}

	public void setRoi(int roi) {
		this.roi = roi;
	}

	public int getEmi() {
		return emi;
	}

	public void setEmi(int emi) {
		this.emi = emi;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public int getProcessing_fee() {
		return processing_fee;
	}

	public void setProcessing_fee(int processing_fee) {
		this.processing_fee = processing_fee;
	}

	public String getApplication_status() {
		return application_status;
	}

	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

//	public UserDetails getUserDetails() {
//		return userDetails;
//	}
//
//	public void setUserDetails(UserDetails userDetails) {
//		this.userDetails = userDetails;
//	}

	@Override
	public String toString() {
		return "LoanDetails [loanid=" + loanid + ", loan_amount=" + loan_amount + ", loan_tenure=" + loan_tenure
				+ ", roi=" + roi + ", emi=" + emi + ", account_type=" + account_type + ", processing_fee="
				+ processing_fee + ", application_status=" + application_status + ", remarks=" + remarks + ", user_id="
				+ user_id + "]";
	}
	
}