package com.xworkz.mansoon.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.mansoon.bean.Season;
import com.xworkz.mansoon.configuration.SeasonConfiguration;

public class SeasonRunner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(SeasonConfiguration.class);
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Season refOfSeason = container.getBean("season" , Season.class);
		System.out.println(refOfSeason);
		System.out.println(refOfSeason.getName());
		System.out.println(refOfSeason.getDuration());
		System.out.println(refOfSeason.getStartingMonth()); 
	}
}
