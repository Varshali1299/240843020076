package com.knowit.ProjectRestAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.knowit.ProjectRestAPI.entities.Role;
import com.knowit.ProjectRestAPI.entities.User;
import com.knowit.ProjectRestAPI.entities.UserCheck;
import com.knowit.ProjectRestAPI.repositories.UserRepository;
import com.knowit.ProjectRestAPI.service.UserService;




@CrossOrigin(origins="http://localhost:3000")
@RestController
	
public class UserController {
	@Autowired
	
	UserService uservice;
	
	
	@PostMapping("/chkUser")
	
	public User chkUser(@RequestBody UserCheck ucheck)
	{
		return uservice.getUser(ucheck.getUname(), ucheck.getPwd());
	}
//@PostMapping("/chkUser")
//	
//	public User chkUser(@RequestBody UserCheck ucheck)
//	{
//	   User loggedInUser=uservice.l
//		return uservice.getUser(ucheck.getUname(), ucheck.getPwd());
//	}

	@GetMapping("/getAllUser")
	public List<User> getAll(){
		return uservice.getAll();
	}
	
//	@PostMapping("/ChkLogin")
//	
//	public ResponseEntity<String> login(@RequestBody User user) {
//	    
//	    User loggedInUser = UserService.User(user.getUname(), user.getPwd());
//	    
//	    
//	    if (loggedInUser != null) {
//	        
//	        String rname = loggedInUser.getRid().getRname();  
//	        
//	        
//	        return ResponseEntity.ok("Login successful. Role: " + rname);
//	    } else {
//	       
//	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password.");
//	    }
//	}
//		
		
	}

	
