package org.example.dealership;

import org.example.Cars.CheapCars;
import org.example.Cars.ExpensiveCars;
import org.example.Cars.MiddlePriceCars;

public class Operational {


    public static void main(String[] args) {

        CheapCars CC = new CheapCars();
        MiddlePriceCars MC = new MiddlePriceCars();
        ExpensiveCars EC = new ExpensiveCars();

        CC.buy();
        CC.sell();

        MC.buy();
        MC.sell();

        EC.buy();
        EC.sell();

    }

}
