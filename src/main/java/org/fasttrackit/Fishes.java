package org.fasttrackit;

public class Fishes extends Animal {
    private String species;

    public Fishes(String name, String species) {
        super(name);
        this.species = species;
    }

    @Override
    public void Mood() {
        super.Mood();

        System.out.println(" Pestele " + getName() + " din rasa " + getSpecies() + " inoata ");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
