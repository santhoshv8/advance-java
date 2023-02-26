package com.xworkz.eggapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.eggapp.dto.EggDTO;
import com.xworkz.eggapp.repository.EggRepository;

@Service
public class EggServiceImpl implements EggService {

	@Autowired
	private EggRepository eggRepository;
	
	public EggServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean saveAndValidate(EggDTO dto) {
		System.out.println("Running saveAndValidate in EggService");
		boolean saved = this.eggRepository.save(dto);
		System.out.println("saved "+saved);
		return false;
	}
}
