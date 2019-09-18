package org.fasttrackit;


import java.time.LocalDate;

public class AnimalFood {
    private String name;
    private double price;
    private double amount;
    private java.time.LocalDate expirationData;
    private boolean availabilityInStock;

    public AnimalFood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getExpirationData() {
        return expirationData;
    }

    public void setExpirationData(LocalDate expirationData) {
        this.expirationData = expirationData;
    }

    public boolean isAvailabilityInStock() {
        return availabilityInStock;
    }

    public void setAvailabilityInStock(boolean availabilityInStock) {
        this.availabilityInStock = availabilityInStock;
    }

}




