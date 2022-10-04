package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Animal;

@RestController
public class AnimalController {

	@GetMapping(value="/animal")
	public List<Animal> animalList(){
		
		Animal animal = new Animal("Cachorro", "Branco");
		Animal animal2 = new Animal("Vaca", "Preta");
		Animal animal3 = new Animal("Gato", "Pardo");
		
		List<Animal> animals = new ArrayList<>();
		animals.add(animal);
		animals.add(animal2);
		animals.add(animal3);
		
		return animals;
		
	}
	
}
