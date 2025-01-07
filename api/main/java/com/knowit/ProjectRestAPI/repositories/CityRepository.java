package com.knowit.ProjectRestAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knowit.ProjectRestAPI.entities.City;

public interface CityRepository extends JpaRepository<City, Integer> {

}
