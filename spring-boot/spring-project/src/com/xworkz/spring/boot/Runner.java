package com.xworkz.spring.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[] beanNames = {"santhosh", "akthar","sachin", "shubham" , "rahil"};
		System.out.println(Arrays.toString(beanNames)); 
		
		Boolean[] beanbooleanvalues = {false , true , true , false , true};
		System.out.println(Arrays.toString(beanbooleanvalues));
		 
		Double [] beandoublevalues=  {12.02,45.58,568.25,466.874,52.0};
		System.out.println(Arrays.toString(beandoublevalues));
		
		List<Integer> arrays = new ArrayList<Integer>();
		arrays.add(145);
		arrays.add(258);
		arrays.add(453);
		arrays.add(563);
		arrays.add(785); 
		System.out.println(arrays); 
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("chocolate", 1);
		map.put("city", 2);
		map.put("mall", 3);
		map.put("patient", 4);
		map.put("temple", 5);
		System.out.println(map);
	}
}
