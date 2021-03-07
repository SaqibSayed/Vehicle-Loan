package com.aditi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aditi.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

	@Query(value="select e.adminPassword from Admin e where e.adminLoginId=:adminLoginId")
	String getPassword(@Param("adminLoginId") int adminLoginId);

}
