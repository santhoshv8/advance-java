package com.xworkz.aeroplaneapp.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.aeroplaneapp.dto.AeroplaneDTO;
import com.xworkz.aeroplaneapp.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	public AeroplaneService aeroplaneService;
	
	public AeroplaneController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	private List<String> type = Arrays.asList("Commercial Airplanes","Private Jets","Propeller Planes");
	
	private List<String> country = Arrays.asList("India" , "USA" , "UK");
		
	@GetMapping("/rese")
	public String onAeroplane(Model model) {
		System.out.println("Running onAeroplane on getmapping");
		model.addAttribute("type",type);
		model.addAttribute("country", country);
		return "Register"; 
	}
	
	@PostMapping("/rese")
	public String onAeroplane(AeroplaneDTO dto , Model model) {
	   Set<ConstraintViolation<AeroplaneDTO>> constraintViolations = this.aeroplaneService.saveAndValidate(dto);
	    if(constraintViolations.isEmpty()) {
	    	System.out.println("Data Entered Sucessfully");
	    	System.out.println(dto);
	    	return "Register";
	    }
	   model.addAttribute("type", type);
	   model.addAttribute("country",country);
	    
	   model.addAttribute("constraintViolations",constraintViolations);
	   System.out.println(dto);
	   
	   System.err.println("violations in controller");
	   model.addAttribute("error",constraintViolations);
	 
	   return "Register";
	}	
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id , Model model) {
		
		System.out.println("Running on search for id "+id);
		
		AeroplaneDTO dto = this.aeroplaneService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message","Data not found"); 
		}
		return "AeroplaneSearch";
	}
} 
