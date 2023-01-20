package com.xworkz.spring.repo;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dto.FirstAidDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class FirstAidRepoImpl implements FirstAidRepo{

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("Running save ");
		System.out.println("Saved DTO is : "+dto);
		return true;
	}
}
