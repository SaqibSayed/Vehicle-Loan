package com.aditi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aditi.model.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {

}
