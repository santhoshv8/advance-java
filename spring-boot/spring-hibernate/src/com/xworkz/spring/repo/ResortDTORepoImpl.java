package com.xworkz.spring.repo;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.ResortDTO;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class ResortDTORepoImpl implements ResortDTORepo{

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Saved DTO is : "+dto);
		return true;
	}
	
}
