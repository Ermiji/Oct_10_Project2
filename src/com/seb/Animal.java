package com.seb;

public class Animal {
    private String animalName;

    //a constructor is a method that has same name as class
    public Animal(){
        System.out.println("This is a constructor");
    }

    //an overloaded constructor contains different singnature
    public Animal(String value){
        this.animalName = value;
        System.out.println("This is the overloaded constructor");
    }
    public String sleep(){
        return "An animal sleeps...";
    }

    public String eat(){
        return "An animal eats...";
    }

    public String getAnimalName(){
        return animalName;
    }

    public void setAnimalName(String value){
        this.animalName = value;
    }
    //private method is not available outside class
    private String thoughts(){
        return "I'm hungry";
    }

    //public method can access the private method
    public String mythoughts(){
        String output = thoughts();
        return output;
    }
}
