package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindRegionAndMainGodByNameAndIdRunning {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createNamedQuery("findRegionAndMainGodByNameAndId");
		
		query.setParameter("byName", "Janmashtmi");
		query.setParameter("byId", 6);
		
		Object result = query.getSingleResult();
		
		Object[] array = (Object[])result;
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		manager.close();
	}
}
