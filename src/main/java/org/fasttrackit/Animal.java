package org.fasttrackit;

public class Animal {
    private String name;
    private int age;
    private int levelOfHealth;
    private int levelOfHunger;
    private int levelOfSpirit;
    private String favoriteFood;
    private String recreationActivity;
    private String color;
    private String height;
    private double weight;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevelOfHealth() {
        return levelOfHealth;
    }

    public void setLevelOfHealth(int levelOfHealth) {
        this.levelOfHealth = levelOfHealth;
    }

    public int getLevelOfHunger() {
        return levelOfHunger;
    }

    public void setLevelOfHunger(int levelOfHunger) {
        this.levelOfHunger = levelOfHunger;
    }

    public int getLevelOfSpirit() {
        return levelOfSpirit;
    }

    public void setLevelOfSpirit(int levelOfSpirit) {
        this.levelOfSpirit = levelOfSpirit;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getRecreationActivity() {
        return recreationActivity;
    }

    public void setRecreationActivity(String recreationActivity) {
        this.recreationActivity = recreationActivity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


}
