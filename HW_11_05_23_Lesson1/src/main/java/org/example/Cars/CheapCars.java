package org.example.Cars;

import org.example.dealership.Dealership;

public class CheapCars extends Dealership {


    @Override
    public void sell() {
        System.out.println("I'm selling a cheap car");
    }

    @Override
    public void buy() {
        System.out.println("I'm buying a cheap car");
    }
}

