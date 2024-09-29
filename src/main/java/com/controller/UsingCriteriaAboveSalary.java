package com.controller;

import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.entity.Emp2;

import HibernateConfigurationFile.HibernateCfg;

public class UsingCriteriaAboveSalary {

	public static void main(String[] args) {

		
		SessionFactory factory = HibernateCfg.sessionFactoryconfigure();
		Session session=factory.openSession();
		 Criteria criteria=session.createCriteria(Emp2.class);
		 
		 criteria.add(Restrictions.gt("salary", 39000));
		 
		 List<Emp2> list=criteria.list();
		 
		 for (Emp2 emp2 : list) {
			 
			 System.out.println(emp2);
			
		}
		
	}

}
