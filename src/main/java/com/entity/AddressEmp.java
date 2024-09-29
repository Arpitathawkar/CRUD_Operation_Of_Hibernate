package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddressEmp {

	@Id
	private int aid;
	private String street;
	private String city;
	private  String state;
	private int ZipCode;
	private String country;
	
	public AddressEmp() {
		
	}
	
	public AddressEmp(int aid, String street, String city, String state, int zipCode, String country) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
		this.state = state;
		ZipCode = zipCode;
		this.country = country;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return ZipCode;
	}

	public void setZipCode(int zipCode) {
		ZipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "AddressEmp [aid=" + aid + ", street=" + street + ", city=" + city + ", state=" + state + ", ZipCode="
				+ ZipCode + ", country=" + country + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
