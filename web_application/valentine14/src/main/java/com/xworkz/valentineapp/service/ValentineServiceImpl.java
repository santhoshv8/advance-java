package com.xworkz.valentineapp.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentineapp.dto.ValentineDTO;
import com.xworkz.valentineapp.entity.ValentineEntity;
import com.xworkz.valentineapp.repository.ValentineRepository;

@Service 
public class ValentineServiceImpl implements ValentineService {

	@Autowired
	public ValentineRepository ValentineRepository;
	
	public ValentineServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDTO>> saveAndValidate(ValentineDTO dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<ValentineDTO>> violations = validator.validate(dto);
		
		if(violations !=null && !violations.isEmpty()) {
			System.out.println("violation in dto "+dto);
			return violations;
		}else {
			System.out.println("valiadtion is not there in dto, can save");
			
			ValentineEntity entity = new ValentineEntity();
		
			entity.setName(dto.getName());
			entity.setValntineName(dto.getValentineName());
			entity.setPlace(dto.getPlace());
			entity.setGift(dto.getGift());
			
			boolean saved = this.ValentineRepository.save(entity);
			System.out.println("Entity Data is saved "+saved); 
			return Collections.emptySet();
		}
	}

	@Override
	public ValentineDTO findById(int id) {
		
		if(id>0) {
			
		  ValentineEntity entity = this.ValentineRepository.findById(id);
		  if(entity!=null) {
			  System.out.println("Entity is found in service for id "+id);
			  
			  ValentineDTO dto = new ValentineDTO();
			  dto.setName(entity.getName());
			  dto.setValentineName(entity.getValntineName());
			  dto.setPlace(entity.getPlace());
			  dto.setGift(entity.getGift());
			  dto.setId(entity.getId()); 
			  return dto;
		  }
		}
		return null;
	}

} 
