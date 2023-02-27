package com.xworkz.turbineapp.repository;

import com.xworkz.turbineapp.entity.TurbineEntity;

public interface TurbineRepository {

	boolean save(TurbineEntity entity);
	
	TurbineEntity findById(int id);
	
}
