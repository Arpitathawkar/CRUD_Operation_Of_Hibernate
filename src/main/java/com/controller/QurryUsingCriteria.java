package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

import com.entity.Emp2;
import com.entity.Employee;

import HibernateConfigurationFile.HibernateCfg;

public class QurryUsingCriteria {

	public static void main(String[] args) {
	
		
		SessionFactory factory = HibernateCfg.sessionFactoryconfigure();
		
		Session  session=factory.openSession();
		Criteria criteria=session.createCriteria(Emp2.class);
		Query<Employee> query=session.createQuery("select * employee");
		query.setProperties(Projections.max("salary"));
		
		List list=query.list();
		
		System.out.println(list);

	}

}
