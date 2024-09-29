package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;

import HibernateConfigurationFile.HibernateCfg;

public class DeleteEmployeeAssociate {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateCfg.sessionFactoryconfigure();
		
		Session session=factory.openSession();
		Employee employee = session.load(Employee.class, 4);
		session.delete(employee);
		session.beginTransaction().commit();;
		System.out.println("done!");

	}

}
