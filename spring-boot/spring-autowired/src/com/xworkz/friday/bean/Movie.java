package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

	@Autowired
	private Director director;

	@Autowired
	private Producer producer;

	public void movieRef() {

		System.out.println("Created Director by movieRef");
		System.out.println(director.hashCode()); 

		System.out.println("Created Director by movieRef");
		System.out.println(producer.hashCode());

	}
}
