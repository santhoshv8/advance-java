package com.xworkz.shellpetrolbunk.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.shellpetrolbunk")
public class PetrolBunkCongiguration {

	
	public PetrolBunkCongiguration() {

		System.out.println("Creating PetrolBunkCongiguration by no args constructor...");
	}
}
