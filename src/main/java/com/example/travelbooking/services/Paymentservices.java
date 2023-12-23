package com.example.Beautyproducts.services;

import com.example.Beautyproducts.entites.Payment;

public interface Paymentservices {
	Payment getPaymentById(int paymentId );
	Payment addPayment(Payment payment);
	Payment updateDb(int paymentId, Payment payment);
	void deleteDb(int paymentId);
	
}


