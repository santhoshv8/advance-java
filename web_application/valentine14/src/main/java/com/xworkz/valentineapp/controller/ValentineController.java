package com.xworkz.valentineapp.controller;

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

import com.xworkz.valentineapp.dto.ValentineDTO;
import com.xworkz.valentineapp.service.ValentineService;
 
@Controller
@RequestMapping("/")
public class ValentineController {

	@Autowired
	private ValentineService valentineService;
	
	public ValentineController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	} 
	
	private List<String> places = Arrays.asList("BTM","jp nagar","Rajajinagar","koramangala");
	private List<String> gifts = Arrays.asList("trddy","chocalte","saree"); 
	
	@GetMapping("/vale")
	public String onValentine(Model model) {
		System.out.println("Running onValentine on getmapping");
		model.addAttribute("places", places);
		model.addAttribute("gifts",gifts);
		return "Valentine";
	}
	
	@GetMapping("/search")
	public String onSearch(@RequestParam int id , Model model) {
		
		System.out.println("Running on search for id "+id);
		
		ValentineDTO dto = this.valentineService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
		}else {
			model.addAttribute("message","Data not found"); 
		}
		return "ValentineSearch";
	}
	
	@PostMapping("/vale")
	public String onValentine(ValentineDTO dto , Model model) {
		Set<ConstraintViolation<ValentineDTO>> constraintViolations = this.valentineService.saveAndValidate(dto);
		if(constraintViolations.isEmpty()) {
			System.out.println("Validate sucess");
			System.out.println(dto);
			 
			return "Sucess";
		}
		model.addAttribute("places", places);
		model.addAttribute("gifts",gifts);
		
		model.addAttribute("constraintViolations" , constraintViolations);
		System.out.println(dto);
		System.err.println("violation in controller");
		model.addAttribute("error",constraintViolations);
		return "Valentine";
	} 
}
