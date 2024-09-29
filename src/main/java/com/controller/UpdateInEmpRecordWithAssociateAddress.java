package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.AddressEmp;
import com.entity.Employee;

import HibernateConfigurationFile.HibernateCfg;

public class UpdateInEmpRecordWithAssociateAddress {

	public static void main(String[] args) {

		SessionFactory Factory = HibernateCfg.sessionFactoryconfigure();
	     Session session=Factory.openSession();
	     AddressEmp addressEmp=new AddressEmp(1, "gulatiroad", "pune", "maharastra", 2445, "uk");
	     Employee employee=new Employee(1, "john","lumin","john@123", "23423443", addressEmp);
	     
	     session.update(employee);
	     
	     session.beginTransaction().commit();
	     System.out.println("done");
		
		
	}

}
