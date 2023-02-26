package com.xworkz.aeroplaneapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.aeroplaneapp.entity.AeroplaneEntity;

@Repository
public class AeroplaneRepositoryImpl implements AeroplaneRepository {

	@Autowired
	public EntityManagerFactory entityManagerFactory; 
	
	public AeroplaneRepositoryImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(AeroplaneEntity entity) {
		System.out.println("Running save in repository");
		EntityManager entityManager =  this.entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =  entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(entity);
		entityTransaction.commit();
		entityManager.close();
		return false;
	}

	@Override
	public AeroplaneEntity findById(int id) {
		System.out.println("Find By id in Repository... "+id);
		EntityManager entityManager = this.entityManagerFactory.createEntityManager();
		AeroplaneEntity feromDb = entityManager.find(AeroplaneEntity.class, id);
		entityManager.close();
		return feromDb;
	} 

}
