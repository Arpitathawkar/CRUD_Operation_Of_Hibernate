package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp2 {
	
	
	@Id
	private int id;
	private String name;
	private int salary;
	
	public Emp2() {
		// TODO Auto-generated constructor stub
	}

	public Emp2(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
