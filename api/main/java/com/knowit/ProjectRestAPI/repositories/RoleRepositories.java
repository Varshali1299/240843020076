package com.knowit.ProjectRestAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.knowit.ProjectRestAPI.entities.Role;

@Repository
public interface RoleRepositories extends JpaRepository<Role, Integer> {

}
