package com.xworkz.aeroplaneapp.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.aeroplaneapp.entity.AeroplaneEntity;

public interface AeroplaneRepository {

	boolean save (AeroplaneEntity entity);
	
	boolean update(AeroplaneEntity entity);
	
	AeroplaneEntity findById(int id);
	
	default List<AeroplaneEntity> findByCompany(String company) {
		return Collections.emptyList(); 
	}
	
	default AeroplaneEntity deleteById(int id) {
		return null;
	}
}
