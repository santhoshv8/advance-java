package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuration.SpringConfiguration;
import com.xworkz.spring.dto.FirstAidDTO;
import com.xworkz.spring.dto.MissileDTO;
import com.xworkz.spring.dto.ResortDTO;
import com.xworkz.spring.service.FirstAidDTOService;
import com.xworkz.spring.service.MissileDTOService;
import com.xworkz.spring.service.ResortDTOServiceImpl;

public class Runner {


	public static void main(String[] args) {

		ApplicationContext far = new AnnotationConfigApplicationContext(SpringConfiguration.class);

		FirstAidDTOService service = far.getBean(FirstAidDTOService.class);
		MissileDTOService ser = far.getBean(MissileDTOService.class);
		ResortDTOServiceImpl rdr = far.getBean(ResortDTOServiceImpl.class);

		FirstAidDTO d1 = new FirstAidDTO("Te", "Bandage", "Scissors", "Tweezers");
		boolean saved = service.updateAndSave(d1);
		System.out.println("Saved Data : " + saved);
		
		FirstAidDTO d2 = new FirstAidDTO("Termometer", "Bandage", "Scissors", "Tweezers");
		boolean saves = service.updateAndSave(d2);
		System.out.println("Saved Data : " + saves);

		MissileDTO m1 = new MissileDTO("Agni-I", "India", "Medium-range ballistic missile","Bharat Dynamics Limited");
		boolean ms1 = ser.validateAndSave(m1);
		System.out.println("Saved missile data : " + ms1);
		
		MissileDTO m2 = new MissileDTO("Agni", "Ind", "Medium-range ballistic missile","Bharat Dynamics Limited");
		boolean ms2= ser.validateAndSave(m2);
		System.out.println("Saved missile data : " + ms2);

		ResortDTO rd = new ResortDTO(" moutain vally", "sandur ", 53234.0);
		boolean rdm = rdr.validateAndUpdate(rd);
		System.out.println("Saved resort data : " + rd);
		
		ResortDTO rd1 = new ResortDTO("VRR Hotels", "Banglore ", 8300.0);
		boolean rdm1 = rdr.validateAndUpdate(rd1);
		System.out.println("Saved resort data : " + rdm1);

	}
}
