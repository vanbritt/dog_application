package com.udacity.dog.service;

import com.udacity.dog.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService{
    @Autowired
    private DogRepository dogRepository;

   public List<String> retrievDogBreeds(){
        return  (List<String>) dogRepository.retrievDogBreeds();
    };

   public String retrieveDogBreedById(Long id){
            return  (String) dogRepository.retrieveDogBreedById(id);
    };

    public  List<String> retrieveDogNames(){
        return  (List<String>) dogRepository.retrieveDogNames();
    };
}
