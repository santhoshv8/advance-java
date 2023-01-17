package com.xworkz.shellpetrolbunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Chrome implements Browser {
	
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	
	public Chrome() {

		System.out.println("creating chrome using no args constructor");
	
	}

	@Override
	public void browse() {

		System.out.println("Running browse method by chrome");
	//provider.connect();
	}

}
