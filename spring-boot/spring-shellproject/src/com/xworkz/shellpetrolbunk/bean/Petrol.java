package com.xworkz.shellpetrolbunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {

	@Autowired 
	private PetrolBunk petrolBunk; 
	 
	public Petrol() {
		System.out.println("Created Petrol using no args constructor ");
	}
	
	public void consume() {
		
		System.out.println("Running consume in petrol");
       
	}
}
