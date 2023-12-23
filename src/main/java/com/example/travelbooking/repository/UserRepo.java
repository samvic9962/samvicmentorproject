package com.example.Beautyproducts.repository;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Beautyproducts.entites.user;


@Repository

public interface UserRepo extends JpaRepository<user, Integer> {

	@Query(value =  "select * from user where email =?" , nativeQuery = true)
	user findByEmail(String email);

	
	

}






