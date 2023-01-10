package com.xworkz.mansoon.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mansoon.bean.Rocket;
import com.xworkz.mansoon.configuration.RocketConfiguration;

public class RocketRunner {

	public static void main(String[] args) {
	
		ApplicationContext container = new AnnotationConfigApplicationContext(RocketConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames())); 
		
		Rocket refOfRocket = container.getBean("rocket", Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget()); 
		
		Rocket refOfRocket2 = container.getBean("rocket2", Rocket.class);
		System.out.println(refOfRocket2);
		System.out.println(refOfRocket2.getCountry());
		System.out.println(refOfRocket2.getName());
		System.out.println(refOfRocket2.getBudget()); 
	}
}
