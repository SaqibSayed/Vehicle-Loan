package com.aditi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VehicleDetails {
	
	@Id
	private int vehicle_id;
	private String vehicle_company;
	private String vehicle_model;
	private int ex_showroom_price;
	private int on_road_price;
	private int  loan_id;
	
	public VehicleDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public VehicleDetails(int vehicle_id, String vehicle_company, String vehicle_model, int ex_showroom_price,
			int on_road_price, int loan_id) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_company = vehicle_company;
		this.vehicle_model = vehicle_model;
		this.ex_showroom_price = ex_showroom_price;
		this.on_road_price = on_road_price;
		this.loan_id = loan_id;
	}

	
	public int getLoan_id() {
		return loan_id;
	}


	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}


	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getVehicle_company() {
		return vehicle_company;
	}

	public void setVehicle_company(String vehicle_company) {
		this.vehicle_company = vehicle_company;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public int getEx_showroom_price() {
		return ex_showroom_price;
	}

	public void setEx_showroom_price(int ex_showroom_price) {
		this.ex_showroom_price = ex_showroom_price;
	}

	public int getOn_road_price() {
		return on_road_price;
	}

	public void setOn_road_price(int on_road_price) {
		this.on_road_price = on_road_price;
	}


	@Override
	public String toString() {
		return "VehicleDetails [vehicle_id=" + vehicle_id + ", vehicle_company=" + vehicle_company + ", vehicle_model="
				+ vehicle_model + ", ex_showroom_price=" + ex_showroom_price + ", on_road_price=" + on_road_price
				+ ", loan_id=" + loan_id + "]";
	}

	
	

}
