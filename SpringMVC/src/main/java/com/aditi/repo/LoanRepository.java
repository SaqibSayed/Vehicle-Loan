package com.aditi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aditi.model.LoanDetails;


public interface LoanRepository extends JpaRepository<LoanDetails, Integer>{

	@Query(value="select * from LoanDetails where application_status = :status", nativeQuery = true)
	List<LoanDetails> fetchLoans(@Param("status") String status);
	
}
