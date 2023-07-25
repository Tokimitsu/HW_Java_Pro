package org.example;

import java.util.List;
import java.util.Random;

public class DataStorage {
    static List<String> names = List.of("James", "John", "Robert", "Michael", "William", "David",
            "Richard", "Joseph", "Charles", "Thomas", "Christopher", "Daniel", "Matthew", "Anthony",
            "Mark", "Donald", "Steven", "Paul", "Andrew", "Kenneth", "Joshua", "Kevin", "Brian", "George",
            "Edward", "Mary", "Patricia", "Jennifer", "Linda", "Elizabeth", "Barbara", "Susan", "Jessica",
            "Sarah", "Karen", "Nancy", "Lisa", "Margaret", "Betty", "Sandra", "Ashley", "Dorothy",
            "Kimberly", "Emily", "Donna", "Michelle", "Carol", "Amanda", "Melissa", "Deborah");


    static   List<String> surnames = List.of("Smith", "Johnson", "Williams", "Jones", "Brown", "Davis",
            "Miller", "Wilson", "Taylor", "Clark", "Lewis", "Allen", "Lee", "Scott", "Young", "Adams",
            "Hill", "Baker", "Garcia", "Martinez", "Roberts", "King", "Murphy", "Cook", "Morgan");

    static    List<Integer> ages = List.of(18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34,
            35, 36, 37, 38, 39, 40, 41, 42, 43, 44);

    static   List<Integer> salaries = List.of(3600, 4000, 4200, 4500, 5000, 5300, 5600, 6000, 6200, 6500, 7000,
            7300, 7600, 8000, 8300, 8600, 9000, 9300, 9450);

    static  List<Character> gender = List.of('M', 'F');
    static   List<String> colors = List.of("Red", "Blue", "Green", "Yellow", "Orange",
            "Purple", "Pink", "Brown", "Black", "White");

    static  List<Boolean> isSport = List.of(true, false);

    static   List<Integer> maxSpeed = List.of(180, 200, 220, 240, 260, 280, 300, 320, 340, 360, 380,
            400, 420, 440, 460, 480, 500);

    static  Random rnd = new Random();


    public  static String getName() {
        return names.get(rnd.nextInt(names.size()));
    }

    public static String getSurame() {
        return surnames.get(rnd.nextInt(surnames.size()));
    }

    public static int getAge() {
        return ages.get(rnd.nextInt(ages.size()));
    }

    public static int getSalary() {
        return salaries.get(rnd.nextInt(salaries.size()));
    }

    public  static char getGender() {
        return gender.get(rnd.nextInt(gender.size()));
    }

    public  static String getColor() {
        return colors.get(rnd.nextInt(colors.size()));
    }

    public static Boolean getIsSport() {
        return isSport.get(rnd.nextInt(isSport.size()));
    }

    public static Model getCarModel() {
        Model[] models = Model.values();
        int randomIndex = rnd.nextInt(models.length);
        return models[randomIndex];
    }

    public static int getMaxSpeed() {
        return maxSpeed.get(rnd.nextInt(maxSpeed.size()));
    }


}