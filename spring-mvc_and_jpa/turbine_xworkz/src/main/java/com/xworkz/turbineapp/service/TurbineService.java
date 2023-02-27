package com.xworkz.turbineapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.turbineapp.dto.TurbineDTO;

public interface TurbineService {
 
	Set<ConstraintViolation<TurbineDTO>> saveAndValidate(TurbineDTO dto);
	
	TurbineDTO findById(int id);
} 
