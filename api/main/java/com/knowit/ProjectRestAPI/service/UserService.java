package com.knowit.ProjectRestAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.knowit.ProjectRestAPI.entities.Role;
import com.knowit.ProjectRestAPI.entities.User;
import com.knowit.ProjectRestAPI.repositories.UserRepository;


@Service
public class UserService {
	@Autowired
	UserRepository urepo;
	
	public User getUser(String uname,String pwd)
	{
		User u;
		Optional<User>ol=urepo.getUser(uname,pwd);
	
	try
	{
		u=ol.get();
		
	}
	catch(Exception e)
	{
		u=null;
	}
	return u;
}
	public List<User> getAll() {
		return urepo.findAll();
	}
	
	
//public User login(String uname,String pwd)
//{
//	return UserRepository.findByNameAndPassword(uname,pwd);
//}

//public User createUser(User user)
//{
//	return UserRepository.save(user);
//}
}

//package com.knowit.ProjectRestAPI.services;
//
//import com.knowit.ProjectRestAPI.entities.User;
//import com.knowit.ProjectRestAPI.entities.Role;
//import com.knowit.ProjectRestAPI.repositories.UserRepository;
//import com.knowit.ProjectRestAPI.repositories.RoleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RoleRepository roleRepository;
//
//    public User createUser(User user) {
//        // Validate that the role exists
//        Optional<Role> roleOptional = roleRepository.findById(user.getRid().getRid());
//        if (roleOptional.isEmpty()) {
//            throw new IllegalArgumentException("Role not found");
//        }
//
//        // If role exists, save the user
//        return userRepository.save(user);
//    }
//
//    public User updateUser(int uid, User user) {
//        // Check if the user exists
//        Optional<User> existingUser = userRepository.findById(uid);
//        if (existingUser.isEmpty()) {
//            throw new IllegalArgumentException("User not found");
//        }
//
//        // Validate that the role exists
//        Optional<Role> roleOptional = roleRepository.findById(user.getRid().getRid());
//        if (roleOptional.isEmpty()) {
//            throw new IllegalArgumentException("Role not found");
//        }
//
//        // Set the new role and save the updated user
//        User updatedUser = existingUser.get();
//        updatedUser.setRid(user.getRid());
//        updatedUser.setUname(user.getUname());
//        updatedUser.setPwd(user.getPwd());
//
//        return userRepository.save(updatedUser);
//    }
//}
