package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Autowired
	private Area area;
	
	@Autowired
	private Location location;
	
	public void com() {
		
		System.out.println("created area ref....");
		System.out.println(area.hashCode());
		
		System.out.println("created location ref...");
		System.out.println(location.hashCode()); 
	}
}
