package com.example.Beautyproducts.servicesimpl;
    
	import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

import com.example.Beautyproducts.entites.Payment;
import com.example.Beautyproducts.exception.ResourceNotFoundException;
import com.example.Beautyproducts.repository.PaymentRepo;
import com.example.Beautyproducts.services.Paymentservices;
	
	@Service
	public class Paymentservicesimpl implements Paymentservices {

		@Autowired
		PaymentRepo paymentRepo;
		
		@Override
		public Payment getPaymentById(int paymentId ) {
			Optional<Payment> pay=Optional.ofNullable(paymentRepo.findById(paymentId));

			Payment p;
			if(pay.isPresent())
           {

				 p=pay.get();

			}

	else {

				throw new ResourceNotFoundException();

			}

			return p;

}

		@Override
		public Payment addPayment(Payment payment) {
			return  paymentRepo.save(payment);
		}

		@Override
		public Payment updateDb(int paymentId, Payment payment) {
		Payment s1 = paymentRepo.findById(paymentId);
			
			if(s1!=null) {
				s1.setUserId(payment.getUserId());   
				s1.setPaymentMode(payment.getPaymentMode());
				s1.setTotalPrice(payment.getTotalPrice());
			return paymentRepo.save(s1);
			} 
			else 
			{
				throw new ResourceNotFoundException();
			} 
		}

		@Override
		public void deleteDb(int paymentId) {
		
			
			Payment s2 = paymentRepo.findById(paymentId);
	
			if(s2!=null) {
				paymentRepo.delete(s2);
			}
			else {
				throw new ResourceNotFoundException();
			}		 
		

		
		
	}

		}
