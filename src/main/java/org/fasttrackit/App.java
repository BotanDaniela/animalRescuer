package org.fasttrackit;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal("Lesy");
        animal.setLevelOfHealth(7);
        animal.setAge(2);
        animal.setColor("brown");
        animal.setFavoriteFood("meat");
        animal.setHeight("medium");
        animal.setLevelOfHunger(8);
        animal.setLevelOfSpirit(6);
        animal.setRecreationActivity("football");
        animal.setWeight(10.5);

        Adopter adopter = new Adopter();
        adopter.setName("Elena");
        adopter.setMoneyAvailable(350.7);
        adopter.setAge(27);
        adopter.setGender("female");
        adopter.setHome("house");
        adopter.setPersonality("angry");

        AnimalAccessories animalAccessories = new AnimalAccessories("ball");
        animalAccessories.setPrice(50);

        AnimalFood animalFood = new AnimalFood(" Pedigree ");
        animalFood.setPrice(20);
        animalFood.setAmount(5);
        animalFood.setAvailabilityInStock(true);
        animalFood.setExpirationData(LocalDate.of(2019,10,15));

        System.out.println(animalFood.getExpirationData());

        RecreationalActivity recreationalActivity = new RecreationalActivity("Football ");
        recreationalActivity.setPlace("park");
        recreationalActivity.setTime(1);

        Veterinarian veterinarian = new Veterinarian(3);
        veterinarian.setName("Popescu Andrei");
        veterinarian.setSpecialization("Vet");

        Birds birds = new Birds("parrot", "cockatoo");

        System.out.println("Numele pasarii este " + birds.getName() + " si face parte din rasa " + birds.getRace());

        Cats cats = new Cats("Lisa ", "feral ");

        Dog dog = new Dog(" Darck", " beagle");

        Fishes fishes = new Fishes(" carp", " mirror carp");

        People people = new People();
        people.setGender("male");
        people.setAge(26);
        people.setName("Mircea");

        adopter.feed(animal, animalFood);
        adopter.playActivities(animal, animalAccessories);



    }


}
