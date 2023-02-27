package com.xworkz.turbineapp.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.turbineapp.entity.TurbineEntity;

@Repository
public class TurbineRepositoryImpl implements TurbineRepository {

	@Autowired
	public EntityManagerFactory entityManagerFactory;
	
	public TurbineRepositoryImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean save(TurbineEntity entity) {
		System.out.println("Running save in Repository");
		
		EntityManager manager =  this.entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		
		return false;
	}

	@Override
	public TurbineEntity findById(int id) {

		System.out.println("Find By Id IN Repository..."+id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		TurbineEntity fronDb = manager.find(TurbineEntity.class, id);
		manager.close();
		return fronDb; 
				
	}

}
