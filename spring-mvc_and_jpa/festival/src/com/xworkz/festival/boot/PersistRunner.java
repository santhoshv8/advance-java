package com.xworkz.festival.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.festival.entity.FestivalEntity;

public class PersistRunner {

	public static void main(String[] args) {
		
	  EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	  
	  EntityManager manager = factory.createEntityManager();
	  
	  EntityTransaction transaction = manager.getTransaction();
	  
	  FestivalEntity entity1 = new FestivalEntity("New Year", "Hindu", 1, "Cake", "god");
	  FestivalEntity entity2 = new FestivalEntity("Sankranti", "Hindu", 1, "Atrasa", "All gods");
	  FestivalEntity entity3 = new FestivalEntity("Pongal", "Hindu", 1, "payasam", "All gods");
	  FestivalEntity entity4 = new FestivalEntity("Maha Shivratri", "Hindu", 1, "mirchi, buggi", "Shiva");
	  FestivalEntity entity5 = new FestivalEntity("Holi", "Hindu", 1, "laddu", "rama");
	  FestivalEntity entity6 = new FestivalEntity("Janmashtmi", "Hindu", 1, "butter", "krishna");
	  FestivalEntity entity7 = new FestivalEntity("Independence Day", "Hindu", 1, "chocalate", "Fredom Fighters");
	  FestivalEntity entity8 = new FestivalEntity("Ganesh Chaturthi", "Hindu", 1, "modaka", "Ganesha");
	  FestivalEntity entity9 = new FestivalEntity("Navratri", "Hindu", 9, "savige", "Durga Devi");
	  FestivalEntity entity10 = new FestivalEntity("Dussehra", "Hindu", 1, "Olige", "Chamundeswari");
	  FestivalEntity entity11 = new FestivalEntity("Diwali", "Hindu", 1, "badusha", "lakshmi");
	  FestivalEntity entity12 = new FestivalEntity("moharam", "Hindu and Muslim", 1, "maldi", "muslim god");
	  FestivalEntity entity13 = new FestivalEntity("bakrid", "Muslim", 1, "Biriyani", "allah");
	  FestivalEntity entity14 = new FestivalEntity("ramjan", "Muslim", 1, "keer", "allah");
	  FestivalEntity entity15 = new FestivalEntity("Christmas", "Cristeyans", 1, "cake", "jesus");
      
	  transaction.begin();
	  
	  manager.persist(entity1);
	  manager.persist(entity2);
	  manager.persist(entity3);
	  manager.persist(entity4);
	  manager.persist(entity5);
	  manager.persist(entity6);
	  manager.persist(entity7);
	  manager.persist(entity8);
	  manager.persist(entity9);
	  manager.persist(entity10);
	  manager.persist(entity11);
	  manager.persist(entity12);
	  manager.persist(entity13);
	  manager.persist(entity14);
	  manager.persist(entity15);
	  
	  transaction.commit();
	  
	  manager.close();
	}
}
