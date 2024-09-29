package com.controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.entity.Employee;

import HibernateConfigurationFile.HibernateCfg;

public class fetchEmployeeByAssociateRecord {

	public static void main(String[] args) {
	
		SessionFactory factory = HibernateCfg.sessionFactoryconfigure();
		Session session=factory.openSession();
		//Criteria criteria=session.createCriteria(Employee.class);
		Employee employee = session.load(Employee.class, 1);
		
		System.out.println(employee);

	}

}
