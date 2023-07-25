package org.example;

public class Developer {
    private String name;
    private String surName;
    private int age;
    private int salary;
    private char sex;
    private Car car;

    public Developer(String name, String surName, int age, int salary, char sex, Car car) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
        this.sex = sex;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", sex=" + sex +
                ", car=" + car +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public char getSex() {
        return sex;
    }

    public Car getCar() {
        return car;
    }
}
