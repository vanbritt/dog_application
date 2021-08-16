package com.udacity.dog.web;

import com.udacity.dog.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private DogService dogService;

    @Autowired
    private void setDogService(DogService dogService){ this.dogService = dogService; }

    @GetMapping("/breeds")
    public ResponseEntity<List<String>> retrieveDogBreeds(){
        List <String> list = dogService.retrievDogBreeds();
        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }

    @GetMapping("/breeds/{id}")
    public ResponseEntity<String> retrieveDogBreedById(@PathVariable Long id){
        String breed= dogService.retrieveDogBreedById(id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }

    @GetMapping("/names")
    public ResponseEntity<List<String>> retrieveDogNames(){
        List <String> list = dogService.retrieveDogNames();

        return new ResponseEntity<List<String>>(list, HttpStatus.OK);
    }



}
