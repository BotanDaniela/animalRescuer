package org.fasttrackit;

public class Cats extends Animal {
    private String race;

    public Cats(String name, String race) {
        super(name);
        this.race = race;
    }

    @Override
    public void Mood() {
        System.out.println(" Pisica " + getName() + "din rasa " + getRace()  + " toarce ");
        return;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
