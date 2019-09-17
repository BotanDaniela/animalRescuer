package org.fasttrackit;

public class Birds extends Animal {

    private String race;

    public Birds(String name, String race) {
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
