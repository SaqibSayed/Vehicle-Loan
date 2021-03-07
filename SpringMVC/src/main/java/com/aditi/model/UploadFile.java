package com.aditi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class UploadFile {

	@Id
	@GeneratedValue
	@Column(name = "FILE_ID")
	private int id;
	@Column(name = "FILE_NAME")
	private String fileName;
	@Column(name = "FILE_DATA")
	@Lob
	private byte[] data;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	
	

}
