package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.Animal;

@Service
public class AnimalService {
	
	public List<Animal> getAnimalList(){
		Animal animal = new Animal("Cachorro", "Branco");
		Animal animal2 = new Animal("Vaca", "Preta");
		Animal animal3 = new Animal("Gato", "Pardo");
		Animal animal4 = new Animal("Galinha", "Amarela");
		
		List<Animal> animals = new ArrayList<>();
		animals.add(animal);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		
		return animals;
	}
}
