package org.fasttrackit;

import java.util.zip.DataFormatException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal = new Animal();
        animal.nameAnimalClassis = "caine";
        animal.age = 4;
        animal.levelOfHealth = 6;
        animal.NameOfYourFavoriteRecreationActivity = "running";
        animal.theLevelOfTheSpirit = 10;
        animal.theLevelOfTheFeelingOfHunger = 9;
        animal.theNameOfYourFavoriteFood = "bones";
        animal.subcategoriesAnimalClassis = "mamifer";
        animal.sexOfAnimal = "masculin";
        animal.colorOfAnimal = "broun";
        animal.nameAnimal = "Luky";

        Adopter adopter = new Adopter();
        adopter.name = "Elena";
        adopter.moneyAvailable = 350.7;

        AnimalFood animalFood = new AnimalFood();
        animalFood.name = "Pedigree";
        animalFood.price = 20;
        animalFood.amount = 5;
        animalFood.availabilityInStock = 10;

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.name = "Football";

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Popescu Andrei";
        veterinarian.specialization = "Vet";




    }
}
