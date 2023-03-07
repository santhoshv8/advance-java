package com.xworkz.aeroplaneapp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

	@Override
	public List<AeroplaneDTO> findByCompany(String company) {

		System.out.println("Running findByCompany in service "+company);

		if(company!=null && !company.isEmpty()) {
			System.out.println("Company is valid.... calling repository");

			List<AeroplaneEntity> entities = this.aeroplaneRepository.findByCompany(company);
			//list<E>-->list<D>
			List<AeroplaneDTO> listOfDTO = new ArrayList<AeroplaneDTO>();
			for (AeroplaneEntity entity : entities) {
				AeroplaneDTO dto = new AeroplaneDTO();
				dto.setCompany(entity.getCompany());
				dto.setName(entity.getName());
				dto.setCost(entity.getCost());
				dto.setType(entity.getType());
				dto.setCountry(entity.getCountry());
				dto.setId(entity.getId()); 
				listOfDTO.add(dto);//adding to list
			}
			System.out.println("size of dto "+listOfDTO.size());
			System.out.println("size of entities "+entities.size()); 
			return listOfDTO; 
		}else {
			System.err.println("Company is invalid");
		}
		return AeroplaneService.super.findByCompany(company);
	}

	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndUpdate(AeroplaneDTO dto) {

		System.out.println("Running Validate And Update in service "+dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> violations = validator.validate(dto);

		if(violations!=null && !violations.isEmpty()) {

			System.err.println("violations in dto, can not save");
			return violations;
		}else {
			System.out.println("No violations in dto can save in controller "+dto);

			AeroplaneEntity entity = new AeroplaneEntity();
			entity.setId(dto.getId());
			entity.setCompany(dto.getCompany());
			entity.setName(dto.getName());
			entity.setCost(dto.getCost());
			entity.setType(dto.getType());
			entity.setCountry(dto.getCountry());

			boolean saved = this.aeroplaneRepository.update(entity);
			System.out.println("Entity Data Is Saved "+saved);
			return Collections.emptySet();
		}	
	}

	@Override
	public AeroplaneDTO deleteById(int id) {
		System.out.println("Running Delete By id in service ");
		AeroplaneEntity entity = this.aeroplaneRepository.deleteById(id);
		if (entity!=null) {
			AeroplaneDTO dto = new AeroplaneDTO();
			dto.setId(entity.getId());
			dto.setCompany(entity.getCompany());
			dto.setName(entity.getName());
			dto.setCost(entity.getCost());
			dto.setType(entity.getType());
			dto.setCountry(entity.getCountry());
			return dto; 
		}else {
			System.err.println("Delete is invalid");
		}
		return AeroplaneService.super.deleteById(id);
	}
}
