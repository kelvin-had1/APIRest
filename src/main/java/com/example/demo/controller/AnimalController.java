package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Animal;
import com.example.demo.services.AnimalService;

@RestController
public class AnimalController {

	@Autowired
	AnimalService animalService;
	
	@GetMapping(value="/animal")
	public List<Animal> animalList(){
		return animalService.getAnimalList();
		
		
	}
	
}
