package com.knowit.ProjectRestAPI.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name="user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   int uid;
   String uname;

	String pwd;
	
String fname;
String lname;

@JsonIgnoreProperties("user")
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="rid")
Role rid;
String email;
String address;

@JsonIgnoreProperties("user")
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="cid")
City cid;
String contact;
String adhaar;

// getters and setters

public User() {
super();
	// TODO Auto-generated constructor stub
}

public User(String uname, String pwd, String fname, String lname, Role rid, String email, String address, City cid,
		String contact, String adhaar) {
	super();
	this.uname = uname;
	this.pwd = pwd;
	this.fname = fname;
	this.lname = lname;
	this.rid = rid;
	this.email = email;
	this.address = address;
	this.cid = cid;
	this.contact = contact;
	this.adhaar = adhaar;
}

public int getUid() {
	return uid;
}

public void setUid(int uid) {
	this.uid = uid;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
	}

public String getPwd() 
{		return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public Role getRid() {
	return rid;
}

public void setRid(Role rid) {
	this.rid = rid;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public City getCid() {
	return cid;
}

public void setCid(City cid) {
	this.cid = cid;
	}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public String getAdhaar() {
	return adhaar;
}

public void setAdhaar(String adhaar) {
	this.adhaar = adhaar;
}
//
//   
//
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="rid")
//	Role rid;
//  String email;
//	String address;

//	public User() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public User(String uname, String pwd) {
//		super();
//		this.uname = uname;
//		this.pwd = pwd;
//	}
//
//	public int getUid() {
//		return uid;
//	}
//
//	public void setUid(int uid) {
//		this.uid = uid;
//	}
//
//	public String getUname() {
//		return uname;
//	}
//
//	public void setUname(String uname) {
//		this.uname = uname;
//	}
//
//	public String getPwd() {
//		return pwd;
//	}
//
//	public void setPwd(String pwd) {
//		this.pwd = pwd;
//}	
	

	
	
	

	
}