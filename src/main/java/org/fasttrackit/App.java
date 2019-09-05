package org.fasttrackit;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {

        Animal animal = new Animal("Lesy");
        animal.levelOfHealth = 7;
        animal.age = 2;
        animal.name = "Lesy";
        animal.color = "brown";
        animal.favoriteFood = "meat";
        animal.height = "medium";
        animal.levelOfHunger = 8;
        animal.levelOfSpirit = 6;
        animal.recreationActivity = "football";
        animal.weight = 10.5;

        Adopter adopter = new Adopter();
        adopter.name = "Elena";
        adopter.moneyAvailable = 350.7;
        adopter.age = 27;
        adopter.gender = "female";
        adopter.home = "house";
        adopter.personality = "angry";

        AnimalAccessories animalAccessories = new AnimalAccessories("ball");
        animalAccessories.name = "ball";
        animalAccessories.price = 50;

        AnimalFood animalFood = new AnimalFood(" Pedigree ");
        animalFood.name = "Pedigree";
        animalFood.price = 20;
        animalFood.amount = 5;
        animalFood.availabilityInStock = true;
        animalFood.expirationData = LocalDate.of(2019, 10, 15);

        System.out.println(animalFood.expirationData);

        RecreationalActivity recreationalActivity = new RecreationalActivity("Football ");
        recreationalActivity.name = "Football";
        recreationalActivity.place = "park";
        recreationalActivity.time = 1;

        Veterinarian veterinarian = new Veterinarian(3);
        veterinarian.name = "Popescu Andrei";
        veterinarian.specialization = "Vet";
        veterinarian.experience = 3;

        Birds birds = new Birds("parrot", "cockatoo");
        birds.name = "parrot";
        birds.race = "cockatoo";

        System.out.println("Numele pasarii este " + birds.name + " si face parte din rasa " + birds.race);

        Cats cats = new Cats("Lisa ", "feral ");
        cats.name = "Lisa";
        cats.race = "feral";

        Dog dog = new Dog(" Darck", " beagle");
        dog.name = "Darck";
        dog.race = "beagle";

        Fishes fishes = new Fishes(" carp", " mirror carp");
        fishes.species = "carp";
        fishes.name = "mirror carp";

        People people = new People();
        people.gender = "male";
        people.age = 26;
        people.name = "Mircea";

        adopter.feed(animal, animalFood);
        adopter.playActivities(animal, animalAccessories);



    }


}
