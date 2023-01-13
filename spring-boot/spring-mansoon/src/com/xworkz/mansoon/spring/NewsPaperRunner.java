package com.xworkz.mansoon.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mansoon.bean.Engine;
import com.xworkz.mansoon.bean.Ghost;
import com.xworkz.mansoon.bean.NewsPaper;
import com.xworkz.mansoon.bean.Snake;
import com.xworkz.mansoon.configuration.NewsPaperConfiguration;

public class NewsPaperRunner {

	public static void main(String[] args) {
		ApplicationContext npr = new AnnotationConfigApplicationContext(NewsPaperConfiguration.class);

		NewsPaper newspaper = npr.getBean(NewsPaper.class);
		System.out.println(newspaper);
		
		System.out.println("\n");
		Snake snake = npr.getBean(Snake.class);
		System.out.println(snake);

		System.out.println("\n");
		Engine engine = npr.getBean(Engine.class);
		System.out.println(engine);
		 
		System.out.println("\n");
		Ghost ghost = npr.getBean(Ghost.class);
		System.out.println(ghost);
	
	}
} 
