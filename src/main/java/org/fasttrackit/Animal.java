package org.fasttrackit;

public class Animal extends AnimalClassis {
    String nameAnimal;
    int age;
    int levelOfHealth;
    int theLevelOfTheFeelingOfHunger;
    String NameOfYourFavoriteRecreationActivity;
    String colorOfAnimal;

    public Animal(String nameAnimalClassis, String nameAnimal) {
        super(nameAnimalClassis);
        this.nameAnimal = nameAnimal;
    }

    public Animal() {
        super();
    }
}
