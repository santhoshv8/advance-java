package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindTotalDaysByNameRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createNamedQuery("findTotalDaysByName");
		
		query.setParameter("byName", "Holi");
		
		int days=(int) query.getSingleResult();
		
		System.out.println(days);
		
		manager.close();
	}
}
