package com.xworkz.friday.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CameraMan {

	@Autowired
	private Camera camera;
	
	@Autowired
	private Lens lens;
	
	public void CameraManRef() {

		System.out.println("Created Camera by CameraManRef....");
		System.out.println(camera.hashCode());
		
		System.out.println("Created lens by CameraManRef....");
		System.out.println(lens.hashCode());
	} 
}
