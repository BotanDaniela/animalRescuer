package org.fasttrackit;

public class Fishes extends Animal {
    private String species;

    public Fishes(String name, String species) {
        super(name);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
