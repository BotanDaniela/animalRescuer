package org.fasttrackit;

public class Cats extends Animal {
    private String race;

    public Cats(String name, String race) {
        super(name);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
