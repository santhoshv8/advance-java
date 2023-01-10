package com.xworkz.mansoon.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	@Value("Druva Sarja")
	private String name;
	@Value("Kannada")
	private String language;
	@Value("35")
	private int age;

	public Actor() {	

	   System.out.println("Created Actor using default constructr");
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public int getAge() {
		return age;
	}





}
