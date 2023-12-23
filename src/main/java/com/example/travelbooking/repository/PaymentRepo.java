package com.example.Beautyproducts.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Beautyproducts.entites.Payment;

@Repository
	public interface PaymentRepo extends JpaRepository<Payment, Integer> {

		@Query(value =  "select * from Payment where pId =?" , nativeQuery = true)
		Payment findById(int paymentId);

		
		
		
	}

