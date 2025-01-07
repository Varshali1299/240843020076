package com.knowit.ProjectRestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowit.ProjectRestAPI.entities.City;
import com.knowit.ProjectRestAPI.entities.Role;
import com.knowit.ProjectRestAPI.repositories.RoleRepositories;

@Service
public class RoleService {
	
	@Autowired
	 RoleRepositories rrepo;
	
	public List<Role> getAll() {
		return rrepo.findAll();
	}

}
