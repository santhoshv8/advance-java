package com.xworkz.shellpetrolbunk.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Airtel implements Provider{

	@Autowired
	@Qualifier("chrome")
	private Browser browser;
	
	public Airtel() {

		System.out.println("creating airtel using no args constructor");
	}
	
	@Override
	public void connect() {
	
		System.out.println("Running connect method by airtel");
		browser.browse();
	}

}
