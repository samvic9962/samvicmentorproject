package com.example.Beautyproducts.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.Beautyproducts.entites.Payment;
import com.example.Beautyproducts.services.Paymentservices;

@RestController
public class PaymentController {
	
	
     @Autowired
     Paymentservices  paymentServices;
		
		@GetMapping("/payment/{Id}")
		public Payment getPaymentById(@PathVariable int paymentId) {
			return paymentServices.getPaymentById(paymentId); 
		}
		
		@PostMapping("/addpayment")
		public Payment addPayment(@RequestBody Payment payment) {
			
			return paymentServices.addPayment(payment);
		}
		
		@PutMapping("/updatepayment")
		public Payment update(@RequestHeader int paymentId ,@RequestBody Payment payment) {
			
			return paymentServices.updateDb( paymentId ,payment); 
		}
		@DeleteMapping("/deletepayment")
		public String delete(@RequestHeader int paymentId ) {
			paymentServices.deleteDb(paymentId );
			return "data deleted";
		}
		
		
	}



