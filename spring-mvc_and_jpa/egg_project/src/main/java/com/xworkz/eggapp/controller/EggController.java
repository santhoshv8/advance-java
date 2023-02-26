package com.xworkz.eggapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.eggapp.dto.EggDTO;
import com.xworkz.eggapp.service.EggService;

@Controller
@RequestMapping("/")
public class EggController {

	@Autowired
	private EggService eggService;
	
	public EggController() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@PostMapping("/egg")
	public String onOrder(EggDTO dto , Model model) {
		System.out.println("Running onOrder "+dto);
		model.addAttribute("hotelName",dto.getHotelName());
		model.addAttribute("dishName" , dto.getDishName());
		model.addAttribute("type" , dto.getType());
		model.addAttribute("price" , dto.getPrice());
		model.addAttribute("quantity" , dto.getQuantity());
		model.addAttribute("takeAway" , dto.getTakeAway());
		boolean saved = this.eggService.saveAndValidate(dto);
		System.out.println("Saved "+saved); 
		return "Egg"; 
	}
}
