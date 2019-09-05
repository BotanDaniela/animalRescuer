package org.fasttrackit;

public class Adopter extends People {
    double moneyAvailable;
    String home;
    // aici ma refer la ce tip de personalitate are : coleric, linistit, etc si in functie de asta sa stim cu ce tip de animal s-ar intelege
    String personality;


    public void feed(Animal animal, AnimalFood animalFood) {

        System.out.println(name + " give some " + animalFood.name + " to " + animal.name);

        int hungry = --animal.levelOfHunger;

        System.out.println(" The feeling of hunger after feeding " + animal.name + " fell to " + hungry + " % ");

    }

    public void playActivities (Animal animal, AnimalAccessories animalAccessories) {
        System.out.println(name + " play " + animal.recreationActivity + " with " + animal.name + " using a " + animalAccessories.name );

        int happines = ++ animal.levelOfSpirit;

        System.out.println(animal.name+"'s" + " mood after playing " + animal.recreationActivity + " with " + name + " increased to " + happines + " % ");

    }



}
