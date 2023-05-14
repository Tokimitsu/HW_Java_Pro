package org.example.Cars;

import org.example.dealership.Dealership;

public class ExpensiveCars extends Dealership {
    @Override
    public void sell() {
        System.out.println("I'm selling an expensive car");
    }

    @Override
    public void buy() {
        System.out.println("I'm buying an expensive car");
    }
}