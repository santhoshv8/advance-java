package com.xworkz.valentineapp.repository;

import com.xworkz.valentineapp.entity.ValentineEntity;

public interface ValentineRepository {

	 boolean save(ValentineEntity entity); 
	 
	 ValentineEntity findById(int id);
}

