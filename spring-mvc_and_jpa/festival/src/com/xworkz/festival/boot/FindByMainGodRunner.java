package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.festival.entity.FestivalEntity;

public class FindByMainGodRunner {

	public static void main(String[] args) {

		EntityManagerFactory factory =  Persistence.createEntityManagerFactory("com.xworkz");

		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createNamedQuery("findByMainGod");
		
		query.setParameter("mainGod", "Shiva");
		
		FestivalEntity entity =(FestivalEntity) query.getSingleResult(); 
		
		System.out.println(entity);
		
		manager.close();
	}

}
