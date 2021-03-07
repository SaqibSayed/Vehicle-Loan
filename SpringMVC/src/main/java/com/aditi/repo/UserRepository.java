package com.aditi.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.aditi.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails, Integer>{

	@Transactional
	@Query(value="select f_name from UserDetails user where user.user_id =:user_id")
	List<UserDetails> fetchAllUser(@Param ("user_id") String user_id);
	
	@Query(value = "SELECT * FROM userDetails u WHERE u.email_id = :email_id", nativeQuery = true)
    UserDetails findUserByEmail(@Param("email_id") String email);

}
