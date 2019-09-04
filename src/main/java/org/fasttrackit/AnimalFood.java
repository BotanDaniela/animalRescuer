package org.fasttrackit;

import javax.xml.crypto.Data;

public class AnimalFood {
    String name;
    double price;
    double amount;
    java.util.Date expirationData;
    double availabilityInStock;

    public AnimalFood(String name) {
        this.name = name;
    }

    public AnimalFood() {

    }
}
