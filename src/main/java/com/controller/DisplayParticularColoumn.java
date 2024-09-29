package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.entity.Employee;

import HibernateConfigurationFile.HibernateCfg;

public class DisplayParticularColoumn {

	public static void main(String[] args) {

		SessionFactory Factory = HibernateCfg.sessionFactoryconfigure();
		
		Session session=Factory.openSession();
		Criteria  criteria=session.createCriteria(Employee.class);
		 ProjectionList projectionList=Projections.projectionList();
		 projectionList.add(Projections.property("lname"));
		 projectionList.add(Projections.property("lname"));
		 projectionList.add(Projections.property("email"));
		 
		 criteria.setProjection(projectionList);
		 
		 List<Object[]> list=criteria.list();
		 
		 for (Object[] obj : list) {
			System.out.print(obj[0]+"\t");
			System.out.print(obj[1]+"\t");
			System.out.println(obj[2]+"\t");
		}
		 
		 
		

	}

}
