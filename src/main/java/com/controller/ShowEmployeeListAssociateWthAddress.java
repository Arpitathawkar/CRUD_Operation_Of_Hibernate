package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.Employee;

import HibernateConfigurationFile.HibernateCfg;

public class ShowEmployeeListAssociateWthAddress {

	public static void main(String[] args) {

		
		
SessionFactory factory = HibernateCfg.sessionFactoryconfigure();
		
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> list=criteria.list();
		
		for(Employee employee:list)
		{
			System.out.println(employee);
			
		}
		
	}

}
