package org.example._2023_06_15;

import java.util.HashMap;
import java.util.Map;

import static org.example._2023_06_15.Methods.*;

public class Main {

    static Map<String, Person> map1 = new HashMap<>();
    static Map<String, Person> map2 = new HashMap<>();
    static Map<String, String> map3 = new HashMap<>();

    public static void main(String[] args) {
        fillMaps();
        printMap(map1, map2);
        System.out.println("=".repeat(50));
        concatPerson(map3);
        System.out.println("=".repeat(50));
        printAvgAge(map1, map2);
        System.out.println("=".repeat(50));
        newMap(map1, map2);
        System.out.println("=".repeat(50));
        System.out.println("Array Tasks");
        System.out.println("=".repeat(50));
        sumArray(createArray());
        System.out.println("=".repeat(50));
        findLargestElements(createArray());
        System.out.println("=".repeat(50));
        sortArray(createArray());
        System.out.println("=".repeat(50));
        countElements(createArray(),5);
        System.out.println("=".repeat(50));

    }
}
