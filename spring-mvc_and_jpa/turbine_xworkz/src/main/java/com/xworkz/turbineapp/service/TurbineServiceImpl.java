package com.xworkz.turbineapp.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.turbineapp.dto.TurbineDTO;
import com.xworkz.turbineapp.entity.TurbineEntity;
import com.xworkz.turbineapp.repository.TurbineRepository;

@Service
public class TurbineServiceImpl implements TurbineService {

	@Autowired
	public TurbineRepository turbineRepository;
	
	public TurbineServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<TurbineDTO>> saveAndValidate(TurbineDTO dto) {
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<TurbineDTO>> violations = validator.validate(dto);
		
		if(violations!=null && !violations.isEmpty())
		{
			System.out.println("Violations in dto "+dto);
			return violations;
		}else {
			
			System.out.println("Violations is not there in dto can save");
			
	        TurbineEntity entity = new TurbineEntity();
	        
	        entity.setCompany(dto.getCompany());
	        entity.setName(dto.getName());
	        entity.setCost(dto.getCost());
	        entity.setType(dto.getType());
	        entity.setCountry(dto.getCountry()); 
	        
	        boolean saved = this.turbineRepository.save(entity);
	        System.out.println("Entity data is saved "+saved);
	        return Collections.emptySet();
		}
		
	}
	
	@Override
	public TurbineDTO findById(int id) {
		if(id>0) {
			
			TurbineEntity entity = this.turbineRepository.findById(id);
			if(entity!=null) {
			System.out.println("Entity is found in service for id "+id);
			
			TurbineDTO dto = new TurbineDTO();
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
