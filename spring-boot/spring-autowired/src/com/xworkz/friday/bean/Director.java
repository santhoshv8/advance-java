package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {

	@Autowired
	private Experience experience;
	
	@Autowired
	private Skill skill;
	
	public void directorRef() {
		
		System.out.println("Created Experience by directorRef");
		System.out.println(experience.hashCode());
		
		System.out.println("Created Skill by directorRef");
		System.out.println(skill.hashCode());
	}
}
