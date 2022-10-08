package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Animal;
import com.example.demo.repository.AnimalRepository;

@Service
public class AnimalService {
	
	@Autowired
	AnimalRepository repository;
	
	public List<Animal> getAnimalList(){
		
		return repository.findAll();
	}
	
	public Animal saveAnimal(Animal animal) {
		Animal newAnimal = new Animal(animal.getName(), animal.getColor());
		repository.save(newAnimal);
		
		
		return newAnimal;
	}

	public ResponseEntity<Animal> deleteAnimal(long animalId) {
		Optional<Animal> existingAnimal = repository.findById(animalId);
		if(existingAnimal != null) {
			repository.deleteById(animalId);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}

	public Optional<Animal> getAnimal(long animalId) {
		Optional<Animal> animal = repository.findById(animalId);
		if(animal != null) {
			return repository.findById(animalId);
		}
		return Optional.empty();
	}

	public ResponseEntity<Animal> updateAnimal(Animal animalToUpdate) {
		
		Optional<Animal> existingAnimal = repository.findById(animalToUpdate.getId());
		
		if(existingAnimal != null) {
			Animal animalToSave = new Animal(animalToUpdate.getName(), animalToUpdate.getColor());
			animalToSave.setId(animalToUpdate.getId());
			repository.save(animalToSave);
			
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.notFound().build();
	}
}
