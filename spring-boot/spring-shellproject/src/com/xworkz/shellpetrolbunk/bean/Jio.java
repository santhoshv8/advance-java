package com.xworkz.shellpetrolbunk.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider{

	public Jio() {

		System.out.println("creating jio using no args constructor");
	}
	
	@Override
	public void connect() {

		System.out.println("Running connect method by jio");
	}

}
