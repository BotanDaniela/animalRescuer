package org.fasttrackit;

public class Adopter extends People {
    private double moneyAvailable;
    private String home;
    // aici ma refer la ce tip de personalitate are : coleric, linistit, etc si in functie de asta sa stim cu ce tip de animal s-ar intelege
    private String personality;

    public void feed(Animal animal, AnimalFood animalFood) {

        System.out.println(getName() + " give some " + animalFood.getName() + " to " + animal.getName());
        animal.setLevelOfHunger(animal.getLevelOfHunger()-1);

        int hungry =animal.getLevelOfHunger();

        System.out.println(" The feeling of hunger after feeding " + animal.getName() + " fell to " + hungry + " % ");

    }

    public void playActivities (Animal animal, AnimalAccessories animalAccessories) {
        System.out.println(getName() + " play " + animal.getRecreationActivity() + " with " + animal.getName() + " using a " + animalAccessories.getName());
        animal.setLevelOfSpirit(animal.getLevelOfSpirit()+1);

        int happines = animal.getLevelOfSpirit();

        System.out.println(animal.getName()+"'s" + " mood after playing " + animal.getRecreationActivity() + " with " + getName() + " increased to " + happines + " % ");

    }

    public double getMoneyAvailable() {
        return moneyAvailable;
    }

    public void setMoneyAvailable(double moneyAvailable) {
        this.moneyAvailable = moneyAvailable;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }


}
