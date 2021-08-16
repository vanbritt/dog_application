package com.udacity.dog.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private String breed;
    private String origin;
    private String name;

    public  Dog(Long id, String name,  String breed){
        this.id= id;
        this.name = name;
        this.breed = breed;
    }
    public Dog(String name,String breed){
        this.name =name;
        this.breed = breed;
    }
    public Dog(){

    }

    public String getBreed(){
        return  this.breed;
    }
    public  String getOrigin(){
        return this.origin;
    }

    public String getName(){
        return  this.name;
    }

    public  void setId(Long id){
        this.id= id;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }
}
