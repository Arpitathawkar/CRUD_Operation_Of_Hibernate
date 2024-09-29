package com.controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.AddressEmp;
import com.entity.Employee;

import HibernateConfigurationFile.HibernateCfg;

public class OneToOneAddEmployee {

	
	public static void main(String[] args) {
		
		SessionFactory factory = HibernateCfg.sessionFactoryconfigure();
		
		Session session=factory.openSession();
		
	      AddressEmp addressEmp=new AddressEmp(1,"sambhajiRoad","Amravati","maharastra", 392002, "india");
	      Employee employee=new Employee(1, "john","wilili","arpita@110","93020202", addressEmp);
	      
	      session.save(employee);
	      session.beginTransaction().commit();
		
		System.out.println(" done !");
		
		
	}
	
	
	
}
