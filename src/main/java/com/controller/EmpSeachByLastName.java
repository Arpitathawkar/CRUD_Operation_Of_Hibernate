package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.entity.Employee;

import HibernateConfigurationFile.HibernateCfg;

public class EmpSeachByLastName {

	public static void main(String[] args) {

		
		
		SessionFactory Factory = HibernateCfg.sessionFactoryconfigure();
		
		Session session=Factory.openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		criteria.add(Restrictions.ilike("lname", "%si"));
		  List<Employee> list=criteria.list();
		  
		   for (Employee employee : list) {
			System.out.println(employee);
		}
		  
		
		
	}

}
