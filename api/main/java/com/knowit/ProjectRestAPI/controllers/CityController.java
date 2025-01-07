package com.knowit.ProjectRestAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knowit.ProjectRestAPI.entities.City;
import com.knowit.ProjectRestAPI.service.CityService;



//@CrossOrigin(origins="http://localhost:3000")
@RestController

public class CityController {

	@Autowired
	CityService cservice;
	
	@GetMapping("/getAllCities")
	public List<City> getAllCities() {
		return cservice.getAll();
	}
}
