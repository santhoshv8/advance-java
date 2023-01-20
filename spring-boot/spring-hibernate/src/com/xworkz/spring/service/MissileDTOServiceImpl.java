package com.xworkz.spring.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.MissileDTO;
import com.xworkz.spring.repo.MissileDTORepo;

@Component
public class MissileDTOServiceImpl implements MissileDTOService {

	@Autowired
	private  Validator validator;
	private MissileDTORepo missileDtoRepo;

	@Autowired
	public MissileDTOServiceImpl(MissileDTORepo missileDtoRepo) {
		this.missileDtoRepo= missileDtoRepo;
	}

	@Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("MissileDTO : "+dto);
		Set<ConstraintViolation<MissileDTO>> violation = this.validator.validate(dto);

		if(!violation.isEmpty()) {
			System.out.println("There is Error\n");
			violation.forEach(v -> {System.out.println("Violation message is : "+v.getMessage());});
			return false;
		}
		else {
			System.out.println("Data is Saved");
			return true;
		}

	}

}
