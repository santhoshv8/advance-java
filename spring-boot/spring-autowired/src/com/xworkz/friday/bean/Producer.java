package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

	@Autowired
	private Assistant assistant;
	
	@Autowired 
	private Company company;
	
	public void producerRef() {
		System.out.println("Created assistant by producerRef..");
		System.out.println(assistant.hashCode());
		
		System.out.println("crreated company by producerRef...");
		System.out.println(company.hashCode());
	}
}
