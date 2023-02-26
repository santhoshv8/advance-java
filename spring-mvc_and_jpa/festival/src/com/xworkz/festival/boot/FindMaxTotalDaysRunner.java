package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMaxTotalDaysRunner {

	public static void main(String[] args) {
		
EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createNamedQuery("findMaxTotalDays");
		
		Object object = query.getSingleResult();
		
		System.out.println(object);
		manager.close();
	}
}
