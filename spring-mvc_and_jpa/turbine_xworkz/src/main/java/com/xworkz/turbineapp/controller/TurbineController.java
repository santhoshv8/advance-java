package com.xworkz.turbineapp.controller;

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

import com.xworkz.turbineapp.dto.TurbineDTO;
import com.xworkz.turbineapp.service.TurbineService;

@Controller
@RequestMapping("/")
public class TurbineController {

	@Autowired
	public TurbineService turbineService ;
	
	public TurbineController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	public List<String> type = Arrays.asList("Impulse Turbines","Reaction Turbines","Pelton Turbines","Francis Turbines","Kaplan  Turbines");
	
	public List<String> country = Arrays.asList("India","New York","California","USA");
	
	@GetMapping("/turb")
	public String onTurbine(Model model) {
		System.out.println("Running onTurbine in GetMapping");
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		return "Details" ;
	} 
	
	@PostMapping("/turb")
	public String onTurbine(TurbineDTO dto , Model model) {
		
		Set<ConstraintViolation<TurbineDTO>> constraintViolations = this.turbineService.saveAndValidate(dto);
		
		if(constraintViolations.isEmpty()) {
			System.out.println("Data Entered Sucessfully "+dto);
			return "Details" ;
		}
		model.addAttribute("type",type);
		model.addAttribute("country",country);
		
		model.addAttribute("constraintViolations",constraintViolations);
		System.out.println(dto);
		
		model.addAttribute("error",constraintViolations);
		System.err.println("violations in controller");
		
		return "Details";
		
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id , Model model) {
      System.out.println("Running on search for id "+id);
      
		TurbineDTO dto = this.turbineService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message", "Data Not Found");
		}
		return "TurbineSearch";
	}
}
