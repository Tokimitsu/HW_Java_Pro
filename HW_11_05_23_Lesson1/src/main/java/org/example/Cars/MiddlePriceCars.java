package org.example.Cars;

import org.example.dealership.Dealership;

public class MiddlePriceCars extends Dealership {
    @Override
    public void sell() {
        System.out.println("I'm selling a middle-price car");
    }

    @Override
    public void buy() {
        System.out.println("I'm buying a middle-price car");
    }
}
