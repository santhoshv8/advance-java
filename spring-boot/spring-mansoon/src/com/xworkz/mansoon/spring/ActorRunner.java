package com.xworkz.mansoon.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mansoon.bean.Actor;
import com.xworkz.mansoon.configuration.ActorConfiguration;

public class ActorRunner {

	public static void main(String[] args) {
	
		ApplicationContext container = new AnnotationConfigApplicationContext(ActorConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Actor refOfActor = container.getBean("actor",Actor.class);
		System.out.println(refOfActor); 
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLanguage());
		System.out.println(refOfActor.getAge()); 
				
		Actor refOfActor2 = container.getBean("actor2",Actor.class);
		System.out.println(refOfActor2);
		System.err.println(refOfActor2.getName());
		System.out.println(refOfActor2.getLanguage());
		System.out.println(refOfActor2.getAge()); 
	   	
	}
}
 