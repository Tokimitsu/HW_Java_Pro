package org.example.Cars;

import org.example.dealership.Creative;

public class Garage implements Creative {
    @Override
    public void createBike() {
        System.out.println("We have a new bike today");
    }

    @Override
    public void createCar() {
        System.out.println("We have a new car today");
    }
}
