package com.knowit.ProjectRestAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowit.ProjectRestAPI.entities.Role;
import com.knowit.ProjectRestAPI.service.RoleService;

@RestController
public class RoleController {
	@Autowired
	RoleService rservice;
	
	@GetMapping("/getAllRoles")
	public List<Role> getAllRoles()
	{
		return rservice.getAll();
	}
	
	

}
