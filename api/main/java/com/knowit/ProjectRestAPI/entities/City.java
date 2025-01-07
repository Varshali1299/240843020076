package com.knowit.ProjectRestAPI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="city")

public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cid;
	String cname;
	
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}


	public City(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}
	
	
	
	
	
}
