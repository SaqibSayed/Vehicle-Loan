package com.aditi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aditi.model.UploadFile;
import com.aditi.repo.FileRepository;

@Repository
@EnableJpaRepositories("com.aditi.repo")
public class FileDao {

	@Autowired
	private FileRepository fileRepo;
	
	@Transactional
	public void save(UploadFile uploadFile) {
		fileRepo.save(uploadFile);
		
	}

}
