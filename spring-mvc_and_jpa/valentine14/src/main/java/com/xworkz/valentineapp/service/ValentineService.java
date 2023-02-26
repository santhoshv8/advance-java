package com.xworkz.valentineapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.valentineapp.dto.ValentineDTO;

public interface ValentineService {

	Set<ConstraintViolation<ValentineDTO>> saveAndValidate(ValentineDTO dto);
	
	ValentineDTO findById(int id);
}
