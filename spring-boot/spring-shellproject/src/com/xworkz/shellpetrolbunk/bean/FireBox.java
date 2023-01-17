package com.xworkz.shellpetrolbunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class FireBox implements Browser {

	@Autowired
	@Qualifier("jio")
	private Provider provider;
	
	public FireBox() {

		System.out.println("creating firebox using no args constructor");
	}

	@Override
	public void browse() {

		System.out.println("Running browse method by firebox");
		provider.connect();
	}
}
