package com.xworkz.aeroplaneapp.repository;

import com.xworkz.aeroplaneapp.entity.AeroplaneEntity;

public interface AeroplaneRepository {

	boolean save (AeroplaneEntity entity);
	
	AeroplaneEntity findById(int id);
}
