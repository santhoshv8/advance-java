package com.xworkz.aeroplaneapp.service;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.aeroplaneapp.dto.AeroplaneDTO;

public interface AeroplaneService {

	Set<ConstraintViolation<AeroplaneDTO>> saveAndValidate(AeroplaneDTO dto);

	Set<ConstraintViolation<AeroplaneDTO>> validateAndUpdate(AeroplaneDTO dto);

	AeroplaneDTO findById(int id);

	default List<AeroplaneDTO> findByCompany(String company) {
		return Collections.emptyList(); 
	}

	default AeroplaneDTO deleteById(int id) {
		return null;
	}
}
