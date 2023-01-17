package com.xworkz.shellpetrolbunk;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.shellpetrolbunk.bean.Airtel;
import com.xworkz.shellpetrolbunk.bean.Browser;
import com.xworkz.shellpetrolbunk.bean.Chrome;
import com.xworkz.shellpetrolbunk.bean.Diesel;
import com.xworkz.shellpetrolbunk.bean.FireBox;
import com.xworkz.shellpetrolbunk.bean.Fuel;
import com.xworkz.shellpetrolbunk.bean.PetrolBunk;
import com.xworkz.shellpetrolbunk.bean.Provider;
import com.xworkz.shellpetrolbunk.configuration.PetrolBunkCongiguration;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(PetrolBunkCongiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		PetrolBunk bunk = container.getBean(PetrolBunk.class);
		bunk.purchase(); 
		
		Fuel fuel = container.getBean(Diesel.class);
		fuel.consume();
		
		Browser browser = container.getBean(Chrome.class);
		browser.browse();
		
		FireBox fireBox = container.getBean(FireBox.class);
		fireBox.browse();
		
		Provider provider = container.getBean(Airtel.class);
		provider.connect();
		}
}
