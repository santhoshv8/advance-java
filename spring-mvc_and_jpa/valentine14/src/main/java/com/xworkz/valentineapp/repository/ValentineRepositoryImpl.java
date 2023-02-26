package com.xworkz.valentineapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.valentineapp.entity.ValentineEntity;

@Repository
public class ValentineRepositoryImpl implements ValentineRepository {

	@Autowired
	public EntityManagerFactory entityManegerFactory;
	
	public ValentineRepositoryImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(ValentineEntity entity) {
		
		System.out.println("Running save in repository");
		EntityManager em = this.entityManegerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(entity);
		et.commit();
		em.close();
		return false;
	}

	@Override
	public ValentineEntity findById(int id) {
		System.out.println("Find By id in Repository... "+id);
		EntityManager entityManager = this.entityManegerFactory.createEntityManager();
		ValentineEntity feromDb = entityManager.find(ValentineEntity.class, id);
		entityManager.close();
		return feromDb; 
	}
}
