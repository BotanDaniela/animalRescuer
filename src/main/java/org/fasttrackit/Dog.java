package org.fasttrackit;

public class Dog extends Animal {
    private String race;

    public Dog(String name, String race) {
        super(name);
        this.race = race;
    }

    @Override
    public void Mood() {
        System.out.println(" Cainele " + getName() + " din rasa " + getRace() + " da din coada ");
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
