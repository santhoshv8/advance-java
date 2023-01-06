package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.thing.Application;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.Bus;
import com.xworkz.spring.thing.Chocolate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.God;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Road;
import com.xworkz.spring.thing.Temple;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Road ref1 = spring.getBean(Road.class);
		System.out.println(ref1);
		
		Bus ref2 = spring.getBean(Bus.class);
		System.out.println(ref2);
		
		Cycle ref3 = spring.getBean(Cycle.class);
		System.out.println(ref3);
	
		Girl ref4 = spring.getBean(Girl.class);
		System.out.println(ref4); 
		
		Milk ref5 = spring.getBean(Milk.class);
		System.out.println(ref5);
		
		Mask ref6 = spring.getBean(Mask.class);
		System.out.println(ref6);
		
		Patient ref7 = spring.getBean(Patient.class);
		System.out.println(ref7);
		
		Chocolate ref8 = spring.getBean(Chocolate.class);
		System.out.println(ref8);
		
		Area ref9 = spring.getBean(Area.class);
		System.out.println(ref9);
		
		City ref10 = spring.getBean(City.class);
		System.out.println(ref10);
		
		Fish ref11 = spring.getBean(Fish.class);
		System.out.println(ref11);
		
		Temple ref12 = spring.getBean(Temple.class);
		System.out.println(ref12);
		
		God ref13 = spring.getBean(God.class);
		System.out.println(ref13);
		
		Park ref14 = spring.getBean(Park.class);
		System.out.println(ref14);
		
		Mall ref15 = spring.getBean(Mall.class);
		System.out.println(ref15);
		
		Application ref16 = spring.getBean(Application.class);
		System.out.println(ref16);
		
	}    
} 
