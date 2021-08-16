package com.udacity.dog.service;

import com.udacity.dog.entity.Dog;

import java.util.List;

public interface DogService {

    List<String> retrievDogBreeds();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();

}
