package com.xworkz.aeroplaneapp.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplaneapp.dto.AeroplaneDTO;
import com.xworkz.aeroplaneapp.entity.AeroplaneEntity;
import com.xworkz.aeroplaneapp.repository.AeroplaneRepository;

@Service
public class AeroplaneServiceImpl implements AeroplaneService {

	@Autowired
	public AeroplaneRepository aeroplaneRepository;
	
	public AeroplaneServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> saveAndValidate(AeroplaneDTO dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<AeroplaneDTO>> violations = validator.validate(dto);
		
		if(violations !=null && !violations.isEmpty()) {
			System.out.println("Violations in dto "+dto);
			return violations;
		}else {
			System.out.println("Violations is not there in dto can save");
			
			AeroplaneEntity entity = new AeroplaneEntity();
			
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setCountry(dto.getCountry());
			 
			boolean saved = this.aeroplaneRepository.save(entity);
			System.out.println("Entity Data is saved "+saved);
			return Collections.emptySet(); 
		}
	}

	@Override
	public AeroplaneDTO findById(int id) {
		if(id>0) {
			
			 AeroplaneEntity entity = this.aeroplaneRepository.findById(id);
			  if(entity!=null) {
				  System.out.println("Entity is found in service for id "+id);
				  
                   AeroplaneDTO dto = new AeroplaneDTO();
                   dto.setCompany(entity.getCompany());
				   dto.setName(entity.getName());
				   dto.setCost(entity.getCost());
				   dto.setType(entity.getType());
				   dto.setCountry(entity.getCountry());
				   dto.setId(entity.getId()); 
				  return dto;
			  }
			}
			return null;
	}

}
