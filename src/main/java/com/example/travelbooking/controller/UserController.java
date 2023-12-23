package com.example.Beautyproducts.controller;


	import org.apache.catalina.User;
    import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestHeader;
	import org.springframework.web.bind.annotation.RestController;

import com.example.Beautyproducts.entites.user;
import com.example.Beautyproducts.services.Userservices;
    @RestController
	public class UserController {

		@Autowired
		Userservices userServices;
		
		@GetMapping("/login")
		public user login(@RequestHeader String email ,@RequestHeader String password) {
			return userServices.login(email,password); 
		}
		
		@PostMapping("/post")
		public user addUserServices(@RequestBody user user) {
			
			return userServices.addUser(user);
		}
		
		@PutMapping("/update")
		public user update(@RequestHeader String email ,@RequestBody user user) {
			
			return userServices.updateDb(email,user); 
		}
		@DeleteMapping("/delete")
		public String delete(@RequestHeader String email) {
			userServices.deleteDb(email);
			return "data deleted";
		}
		
		
	}


