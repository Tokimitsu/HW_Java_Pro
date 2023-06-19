package org.example._2023_06_15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.example._2023_06_15.Main.*;

public class Methods {


    public static void fillMaps() {
        map1.put("Developer", new Person("Andrew Kolbovski", 28));
        map1.put("QA Specialist", new Person("Eugene Sorokin", 19));
        map1.put("Manager", new Person("Helen Doron", 23));
        map2.put("HR Manager", new Person("John Cena", 33));
        map2.put("Coffee Guy", new Person("Lena Oxford", 22));
        map2.put("CEO", new Person("Will Smith", 42));
        map3.put("John", "Peters");
        map3.put("Andrew", "Kolbovski");
        map3.put("Eugene", "Sorokin");
    }

    public static void printMap(Map<String, Person> map1, Map<String, Person> map2) {
        for (Map.Entry<String, Person> entry : map1.entrySet()) {
            System.out.println("Name: " + entry.getValue().getName() + " Age: " + entry.getValue().getAge());
        }
        for (Map.Entry<String, Person> entry : map2.entrySet()) {
            System.out.println("Name: " + entry.getValue().getName() + " Age: " + entry.getValue().getAge());
        }
    }

    public static void printNames(Map<String, Person> map1, Map<String, Person> map2) {
        for (Map.Entry<String, Person> entry : map1.entrySet()) {
            System.out.println(entry.getValue().getName());
            System.out.println(entry.getValue().getAge());
        }
        for (Map.Entry<String, Person> entry : map2.entrySet()) {
            System.out.println(entry.getValue().getName());
        }
    }

    public static void concatPerson(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            entry.setValue(entry.getValue() + " is a person");
            System.out.println(entry.getValue());
        }
    }

    public static void printAvgAge(Map<String, Person> map1, Map<String, Person> map2) {
        int sumAge = 0;
        int personCount = 0;
        for (Map.Entry<String, Person> entry : map1.entrySet()) {
            sumAge += (entry.getValue().getAge());
            personCount++;
        }
        for (Map.Entry<String, Person> entry : map2.entrySet()) {
            sumAge += (entry.getValue().getAge());
            personCount++;
        }

        System.out.println("Average Person age is : " + (sumAge / personCount));
    }

    public static void newMap(Map<String, Person> map1, Map<String, Person> map2) {
        Map<String, String> newMap = new HashMap<>();

        for (Map.Entry<String, Person> entry : map1.entrySet()) {
            newMap.put(entry.getValue().getName(), String.valueOf(entry.getValue().getAge()));
        }
        for (Map.Entry<String, Person> entry : map2.entrySet()) {
            newMap.put(entry.getValue().getName(), String.valueOf(entry.getValue().getAge()));
        }
        System.out.println(newMap);
    }


// Array methods

    public static int[][] createArray() {
        Random rnd = new Random();
        int[][] arr = new int[rnd.nextInt(4) + 2][rnd.nextInt(4) + 2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(6) + 5;
            }
        }
        System.out.println("Created random array elements are: " +
                Arrays.deepToString(arr));
        return arr;
    }

    public static void sumArray(int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println("Sum of array is : " + sum);
    }

    public static void findLargestElements(int[][] arr) {
      int [] max = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
          max[i] = arr[i][0];
          for (int j = 0; j < arr[i].length; j++) {
              if (arr[i][j] > max[i]) {
                  max[i] = arr[i][j];
              }
          }
      }
        System.out.println("Largest elements are: " + Arrays.toString(max));
    }

    public static void sortArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.deepToString(arr));
    }

    public static void countElements(int[][] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    count++;
                }
            }
        }
        System.out.println("Count of elements is: " + count);
    }
}
