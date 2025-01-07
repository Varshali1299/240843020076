package com.knowit.ProjectRestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowit.ProjectRestAPI.entities.City;
import com.knowit.ProjectRestAPI.repositories.CityRepository;

@Service
public class CityService {
	@Autowired
	CityRepository crepo;
	
	public List<City> getAll() {
		return crepo.findAll();
	}

}
