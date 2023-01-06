package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Bus extends Object{

	public Bus() { 
		super();
		System.out.println("Created Bus by Spring...");
	}
}
