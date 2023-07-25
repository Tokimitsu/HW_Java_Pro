package org.example;

public class Car {
    private String color;
    private boolean isSport;
    Model Model;
    private int maxSpeed;


    public Car(String color, boolean isSport, org.example.Model model, int maxSpeed) {
        this.color = color;
        this.isSport = isSport;
        Model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", isSport=" + isSport +
                ", Model=" + Model +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getColor() {
        return color;
    }

    public boolean isSport() {
        return isSport;
    }

    public org.example.Model getModel() {
        return Model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
