package com.example.Beautyproducts.servicesimpl;


	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.Beautyproducts.entites.user;
import com.example.Beautyproducts.exception.ResourceNotFoundException;
import com.example.Beautyproducts.repository.UserRepo;
import com.example.Beautyproducts.services.Userservices;

	
	@Service
	public class Userservicesimpl implements Userservices {


		@Autowired
       UserRepo userRepo;	
		public user login(String email, String password) {

			 user u= userRepo.findByEmail(email);

			 

			 if(u!=null) {

				 if(u.getPassword().equals(password)) {

					 return u;

				 }else {

					throw new ResourceNotFoundException();

				}

			 }else {

				 throw new ResourceNotFoundException();

			 }

		  

		}

		public user addUser(user user) {
			return  userRepo.save(user);
		}

		public user updateDb(String email,user user ) {
		user  s1 = userRepo.findByEmail(email);

			

			if(s1!=null) {

				s1.setFirstName(user.getFirstName());   // old to new set

				s1.setLastName(user.getLastName());

				s1.setPassword(user.getPassword());

			return userRepo.save(s1);

			} 

			else 

			{

				throw new ResourceNotFoundException();

			}
		}
		
			

		public void deleteDb(String email) {
		
			
			user s2 = userRepo.findByEmail(email);

			

			if(s2!=null) {

				userRepo.delete(s2);

			}

			else {

				throw new ResourceNotFoundException();

			}		 

		}	
}