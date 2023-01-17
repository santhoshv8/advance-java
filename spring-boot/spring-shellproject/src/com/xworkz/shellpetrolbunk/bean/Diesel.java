package com.xworkz.shellpetrolbunk.bean;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel{
	
	
	public Diesel() {
		
		System.out.println("Creataing diesel usiing no args constructor");
	}

	@Override
	public void consume() {
		
		System.out.println("Running consume in Diesel");
		 
	}
}
