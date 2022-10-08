package com.example.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Animal;
import com.example.demo.services.AnimalService;

@RestController
@RequestMapping("/animal")
public class AnimalController {

	@Autowired
	AnimalService service;
	
	@GetMapping()
	public List<Animal> getAnimalList(){
		return service.getAnimalList();
				
	}
	
	@GetMapping("/{id}")
	public Optional<Animal> getAnimal(@PathVariable("id") long animalId){
		return service.getAnimal(animalId);
				
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Animal> updateAnimal(@PathVariable("id") long animalId, @RequestBody Animal animal){
		Animal animalToUpdate = new Animal(animal.getName(), animal.getColor());
		animalToUpdate.setId(animalId);
		
		return service.updateAnimal(animalToUpdate);
		
	}
	
	@PostMapping
	public Animal createAnimal(@RequestBody Animal animal) {
		return service.saveAnimal(animal);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Animal> deleteAnimal(@PathVariable("id") long animalId){
		return service.deleteAnimal(animalId);
	}
}
