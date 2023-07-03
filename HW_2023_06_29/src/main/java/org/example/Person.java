package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private static List<Person> friends = new ArrayList<>();


    public static void main(String[] args) {
        friends.add(new Person("Anton", 20));
        friends.add(new Person("Bella", 26));
        friends.add(new Person("Zorro", 30));
        friends.add(new Person("Candy", 40));
        friends.add(new Person("Igor", 60));


    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public static List<Person> getFriends() {
        friends.add(new Person("Anton", 20));
        friends.add(new Person("Bella", 26));
        friends.add(new Person("Zorro", 30));
        friends.add(new Person("Candy", 40));
        friends.add(new Person("Igor", 60));
        return friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }
}
