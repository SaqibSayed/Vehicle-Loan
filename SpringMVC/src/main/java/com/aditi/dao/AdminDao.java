package com.aditi.dao;

import java.util.List;

import com.aditi.model.Admin;
import com.aditi.model.UserDetails;

public interface AdminDao {

	Admin checkPassword(int adminLoginId);

	List<UserDetails> fetchUser(String status);

}