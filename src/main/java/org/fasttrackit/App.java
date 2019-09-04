package org.fasttrackit;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Animal animal = new Animal(" ");
        animal.levelOfHealth = 7;
        animal.age = 2;
        animal.name = "caine";
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

        AnimalAccessories animalAccessories = new AnimalAccessories("");
        animalAccessories.name = "ball";
        animalAccessories.price = 50;

        AnimalFood animalFood = new AnimalFood(" ");
        animalFood.name = "Pedigree";
        animalFood.price = 20;
        animalFood.amount = 5;
        animalFood.availabilityInStock = true;
        animalFood.expirationData = LocalDate.now();

        RecreationalActivity recreationalActivity = new RecreationalActivity(" ");
        recreationalActivity.name = "Football";
        recreationalActivity.place = "park";
        recreationalActivity.time = 1;

        Veterinarian veterinarian = new Veterinarian(3);
        veterinarian.name = "Popescu Andrei";
        veterinarian.specialization = "Vet";
        veterinarian.experience = 3;

        Birds birds = new Birds("", "");
        birds.name = "parrot";
        birds.race = "cockatoo";

        Cats cats = new Cats(" ", " ");
        cats.name = "Lisa";
        cats.race = "feral";

        Dog dog = new Dog(" ", " ");
        dog.name = "Darck";
        dog.race = "beagle";

        Fishes fishes = new Fishes(" ", " ");
        fishes.species = "carp";
        fishes.name = "mirror carp";

        People people = new People();
        people.gender = "male";
        people.age = 26;
        people.name = "Mircea";


    }
}
