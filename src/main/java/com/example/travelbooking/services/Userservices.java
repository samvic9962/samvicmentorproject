package com.example.Beautyproducts.services;

import org.apache.catalina.User;

import com.example.Beautyproducts.entites.user;

public interface Userservices { 
	    user login(String email, String password );
        user addUser(user user);
        user updateDb(String email,user user);
        void deleteDb(String email);
}


