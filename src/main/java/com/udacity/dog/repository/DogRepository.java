package com.udacity.dog.repository;

import com.udacity.dog.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("select  d.breed from Dog d")
    List<String> retrievDogBreeds();

    @Query("select d.breed from Dog d where  d.id = :id")
    //@Query("select d.breed from Dog d where  d.id = ?1")
    String retrieveDogBreedById(@Param("id") Long id);

    @Query("select d.name from Dog d")
    List<String> retrieveDogNames();
}
