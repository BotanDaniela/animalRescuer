package org.fasttrackit;

import javax.swing.*;

public class Adopter extends People {
    private double moneyAvailable;
    private String home;
    // aici ma refer la ce tip de personalitate are : coleric, linistit, etc si in functie de asta sa stim cu ce tip de animal s-ar intelege
    private String personality;

    public void feed(Animal animal, AnimalFood animalFood) {

        if (animal.getFavoriteFood().equals(animalFood.getName())) {
            animal.setLevelOfSpirit(animal.getLevelOfSpirit() + 1);
            int happines = animal.getLevelOfSpirit();

            System.out.println(" Noul nivel al starii de spirit este: " + happines + " la % ");

        } else {
            System.out.println("Nu e preferat");
        }

        System.out.println(" Nivelul de foame a animalului este : " + animal.getLevelOfHunger() + " la % ");


        System.out.println(getName() + " give some " + animalFood.getName() + " to " + animal.getName());
        animal.setLevelOfHunger(animal.getLevelOfHunger() - 1);

        int hungry = animal.getLevelOfHunger();

        System.out.println(" The feeling of hunger after feeding " + animal.getName() + " fell to " + hungry + " % ");

    }

    public void playActivities(Animal animal, RecreationalActivity recreationalActivity) {

        System.out.println(" Nivelul de spirit a animalului este : " + animal.getLevelOfSpirit() + " la % ");
        // System.out.println(getName() + " play " + animal.getRecreationActivity() + " with " + animal.getName());

        if (animal.getFavoriteActivity().equals(recreationalActivity.getName())) {
            animal.setLevelOfSpirit(animal.getLevelOfSpirit() + 2);
            int happines = animal.getLevelOfSpirit();

            System.out.println(" Noul nivel al starii de spirit este: " + happines + " la % ");

        } else {
            animal.setLevelOfSpirit(animal.getLevelOfSpirit() + 1);
            int happines = animal.getLevelOfSpirit();
            System.out.println("Nu e preferat deci nivelul de spirit este: " + happines);
        }
        System.out.println(getName() + " play " + animal.getRecreationActivity() + " with " + animal.getName());
        // animal.setLevelOfSpirit(animal.getLevelOfSpirit() + 1);

        //int happines = animal.getLevelOfSpirit();

        //System.out.println(animal.getName() + "'s" + " mood after playing " + animal.getRecreationActivity() + " with " + getName() + " increased to " + happines + " % ");

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
