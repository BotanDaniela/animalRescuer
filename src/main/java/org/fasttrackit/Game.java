package org.fasttrackit;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;


public class Game {

    Adopter adopter;
    Veterinarian veterinarian;
    Animal dog;
    private List<AnimalFood> availableAnimalFood = new ArrayList<>();
    private RecreationalActivity[] availableRecreationalActivity = new RecreationalActivity[3];

    public void start() {
        initFood();
        initActivities();
        displayActivity();

    }

    private void initFood() {
        AnimalFood food1 = new AnimalFood();
        food1.setName("Pedigree");
        AnimalFood food2 = new AnimalFood();
        food2.setName(" Chicken");
        System.out.println(" Felurile disponibile de mancare sunt: ");
        availableAnimalFood.add(food1);
        availableAnimalFood.add(food2);
        for (AnimalFood animalFood : availableAnimalFood) {

        }
        System.out.println(food1 + "," + food2);
    }

    private void initActivities() {
        RecreationalActivity firstActivity = new RecreationalActivity();
        firstActivity.setName("football");
        availableRecreationalActivity[0] = firstActivity;

        RecreationalActivity secondActivity = new RecreationalActivity();
        secondActivity.setName("walk");
        availableRecreationalActivity[1] = secondActivity;

        RecreationalActivity thirdActivity = new RecreationalActivity();
        thirdActivity.setName("running");
        availableRecreationalActivity[2] = thirdActivity;

    }

    public void displayActivity() {
        System.out.println("Activitatile de recreere sunt: ");

        for (int i = 0; i < availableRecreationalActivity.length; i++) {
            System.out.println(availableRecreationalActivity[i].getName());
        }

    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}


