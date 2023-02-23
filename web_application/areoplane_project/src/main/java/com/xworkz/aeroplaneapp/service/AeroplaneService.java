package com.xworkz.aeroplaneapp.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.aeroplaneapp.dto.AeroplaneDTO;


public interface AeroplaneService {

   Set<ConstraintViolation<AeroplaneDTO>> saveAndValidate(AeroplaneDTO dto);
   
   AeroplaneDTO findById(int id);
}
