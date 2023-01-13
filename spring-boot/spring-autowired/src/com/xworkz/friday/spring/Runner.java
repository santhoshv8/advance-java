package com.xworkz.friday.spring;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.friday.configuration.MovieConfiguration;
import com.xworkz.friday.bean.CameraMan;
import com.xworkz.friday.bean.Company;
import com.xworkz.friday.bean.Director;
import com.xworkz.friday.bean.Lens;
import com.xworkz.friday.bean.Movie;
import com.xworkz.friday.bean.Producer;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(MovieConfiguration.class);
		
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Company company = container.getBean(Company.class);
		company.com();
		
		Producer pro = container.getBean(Producer.class);
		pro.producerRef();
		
		Lens lens = container.getBean(Lens.class);
		lens.lensRef();
		
		CameraMan cameraMan = container.getBean(CameraMan.class);
		cameraMan.CameraManRef();
		
		Director director = container.getBean(Director.class);
		director.directorRef();
		
		Movie movie = container.getBean(Movie.class);
		movie.movieRef();
	}
}
