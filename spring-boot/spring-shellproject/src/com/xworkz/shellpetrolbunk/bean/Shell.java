package com.xworkz.shellpetrolbunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {

	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;//Interface : petrol or diesel
	
	public Shell() {
		System.out.println("Creating Shell using no args constructor");
	}
	
	public void purchase() {
		
		System.out.println("Running purchase in Shell");
		fuel.consume();
	}
}
