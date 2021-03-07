package com.aditi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aditi.dao.FileDao;

import com.aditi.model.UploadFile;

@Service
public class FileService {

	@Autowired
	private FileDao fileDao;
	
	public void save(UploadFile uploadFile) {
		fileDao.save(uploadFile);
	}
}
