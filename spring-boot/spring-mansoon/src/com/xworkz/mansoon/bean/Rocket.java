package com.xworkz.mansoon.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Rocket {

	private String country;
	private String name;
	private long budget;

	public Rocket(@Value("india")String country,@Value("Vikram") String name ,@Value("452787031") long budget) {

		this.country = country;
		this.name = name;
		this.budget = budget;

	}

	public String getCountry() {
		return country;
	}
	
	public String getName() {
		return name;
	}
	
	public long getBudget() {
		return budget;
	}
}
