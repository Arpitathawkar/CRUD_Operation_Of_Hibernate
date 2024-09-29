package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	private int eid;
	private String fname;
	private String lname;
	private String email;
	private String phoneNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private AddressEmp address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	

	public Employee(int eid, String fname, String lname, String email, String phoneNo, AddressEmp address) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}



	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public AddressEmp getAddress() {
		return address;
	}

	public void setAddress(AddressEmp address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", phoneNo="
				+ phoneNo + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
}
