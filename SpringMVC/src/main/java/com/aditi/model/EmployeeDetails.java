package com.aditi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeDetails {
	
	@Id
	private int employee_id;
	private String company_name;
	private double monthly_income;
	private int work_experience;
	private String type_of_emp;
	private int existing_emi;
	private int user_id;
	
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDetails(int employee_id, String company_name, double monthly_income, int work_experience,
			String type_of_emp, int existing_emi, int user_id) {
		super();
		this.employee_id = employee_id;
		this.company_name = company_name;
		this.monthly_income = monthly_income;
		this.work_experience = work_experience;
		this.type_of_emp = type_of_emp;
		this.existing_emi = existing_emi;
		this.user_id = user_id;
	}

	
	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public double getMonthly_income() {
		return monthly_income;
	}

	public void setMonthly_income(double monthly_income) {
		this.monthly_income = monthly_income;
	}

	public int getWork_experience() {
		return work_experience;
	}

	public void setWork_experience(int work_experience) {
		this.work_experience = work_experience;
	}

	public String getType_of_emp() {
		return type_of_emp;
	}

	public void setType_of_emp(String type_of_emp) {
		this.type_of_emp = type_of_emp;
	}

	public int getExisting_emi() {
		return existing_emi;
	}

	public void setExisting_emi(int existing_emi) {
		this.existing_emi = existing_emi;
	}


	@Override
	public String toString() {
		return "EmployeeDetails [employee_id=" + employee_id + ", company_name=" + company_name + ", monthly_income="
				+ monthly_income + ", work_experience=" + work_experience + ", type_of_emp=" + type_of_emp
				+ ", existing_emi=" + existing_emi + ", user_id=" + user_id + "]";
	}

	
	
	

}
