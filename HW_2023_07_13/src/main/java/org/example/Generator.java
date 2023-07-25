package org.example;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    static List<Developer> developers = new ArrayList<>();
    static List<Car> cars = new ArrayList<>();



    public static void generateDeveloper(int quantity) {
        for (int i = 0; i < quantity; i++) {
            developers.add(new Developer(DataStorage.getName(), DataStorage.getSurame(), DataStorage.getAge(),
                    DataStorage.getSalary(), DataStorage.getGender(),
                    generateCar(quantity).get(i)));
        }
    }

    public static List<Car> generateCar(int quantity) {
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            cars.add(new Car(DataStorage.getColor(), DataStorage.getIsSport(), DataStorage.getCarModel(),
                    DataStorage.getMaxSpeed()));
        }
        return cars;
    }


}
