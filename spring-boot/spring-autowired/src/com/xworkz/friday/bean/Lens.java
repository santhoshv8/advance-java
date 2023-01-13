package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Lens {

	@Autowired
	private Battary battary;
	
	@Autowired
	private Capacity capacity;
	
	public void lensRef() {
		
		System.out.println("created battary by lensRef");
		System.out.println(battary.hashCode());
		
		System.out.println("Created Capacity by lensRef");
		System.out.println(capacity.hashCode());
	}
}
