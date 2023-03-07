package com.xworkz.aeroplaneapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
		AeroplaneEntity fromDb = entityManager.find(AeroplaneEntity.class, id);
		entityManager.close();
		return fromDb;
	}   

	@Override
	public List<AeroplaneEntity> findByCompany(String company) {
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByCompany");
			query.setParameter("com", company);
			List<AeroplaneEntity> list = query.getResultList();

			return list;
		}finally { 
			manager.close();
			
		}

	}	

	@Override
	public boolean update(AeroplaneEntity entity) {

		System.out.println("Running update in repository "+entity);
		EntityManager manager = this.entityManagerFactory.createEntityManager();

		try {
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(entity);
			transaction.commit();

		} finally {
			manager.close();
		}
		return false;
	} 

	@Override
	public AeroplaneEntity deleteById(int id) {

		System.out.println("Delete By Id ...."+id);
		EntityManager manager = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction transaction = manager.getTransaction();
			AeroplaneEntity entity = manager.find(AeroplaneEntity.class, id);
			if (entity!=null) {
				transaction.begin();
				manager.remove(entity);
				transaction.commit();
				return entity;
			}
		} finally {
			manager.close();
			
		}
		return AeroplaneRepository.super.deleteById(id);
	}
}
