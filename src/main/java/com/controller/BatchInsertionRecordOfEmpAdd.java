package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.AddressEmp;
import com.entity.Employee;

import HibernateConfigurationFile.HibernateCfg;

public class BatchInsertionRecordOfEmpAdd {

	public static void main(String[] args) {
		
		SessionFactory Factory = HibernateCfg.sessionFactoryconfigure();
		  Session session=Factory.openSession();
		  
		 Employee employee1=new Employee();
		 employee1.setEid(4);
		 employee1.setFname("nikita");
		 employee1.setEmail("nikita@123");
		 employee1.setLname("dethe");
		 employee1.setPhoneNo("12345666");
		 
		 
		 
		 Employee emp=new Employee();
		 emp.setEid(5);
		 emp.setFname("riya");
		 emp.setEmail("riya@123");
	     emp.setLname("sawale");
		 emp.setPhoneNo("5943829");
		 
		 
		 AddressEmp address=new AddressEmp();
		 address.setAid(4);
		 address.setCity("kolkata");
		 address.setCountry("newzland");
		 address.setState("pachimbangal");
		 address.setZipCode(68849);
		 
		 employee1.setAddress(address);
		  
		 
		 AddressEmp add=new AddressEmp();
		 add.setAid(5);
		 add.setCity("lakhanaw");
		 add.setCountry("irac");
		 add.setState("Up");
		 add.setZipCode(4758);
		 emp.setAddress(add);
		 
		 session.save(employee1);
		 session.save(emp);
		 
		 session.beginTransaction().commit();
		 
		 System.out.println("done");
	}

}
