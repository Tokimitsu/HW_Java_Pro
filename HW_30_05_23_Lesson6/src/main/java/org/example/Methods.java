package org.example;

import java.util.*;

public class Methods {
    Random rnd = new Random();

    // Array creation method
    public int[] intArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
        }
        System.out.println("Array elments are : " + Arrays.toString(array));
        return array;
    }

    public ArrayList<Integer> uniqueNumbers(int[] array) {
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (!uniqueNumbers.contains(array[i])) {
                uniqueNumbers.add(array[i]);
            }


        }
        System.out.println("Unique elements are : " + uniqueNumbers);
        System.out.println("==================================================");
        return uniqueNumbers;
    }

    public ArrayList<Integer> reverseNumbers(int[] array) {
        ArrayList<Integer> reverseNumbers = new ArrayList<>();

        for (int i = array.length - 1; i >= 0; i--) {
            reverseNumbers.add(array[i]);
        }

        System.out.println("Reverse elements are : " + reverseNumbers);
        System.out.println("==================================================");

        return reverseNumbers;
    }

    public Set<Integer> intersectionNumbers(int[] arr, int[] arr1) {
        Set<Integer> intersectionNumbers = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    intersectionNumbers.add(arr[i]);
                }
            }
        }
        System.out.println("Intersecting elements are : " + intersectionNumbers);
        System.out.println("==================================================");

        return intersectionNumbers;
    }

    public int uniqueNumbersCount(int[] arr) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        int uniqueNumbersCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!uniqueNumbers.contains(arr[i])) {
                uniqueNumbers.add(arr[i]);
                uniqueNumbersCount++;
            }
        }
        System.out.println("Unique elements are : " + uniqueNumbers);
        System.out.println("Unique elements count is : " + uniqueNumbersCount);
//        System.out.println(uniqueNumbers.size());

        System.out.println("==================================================");

        return uniqueNumbersCount;
    }
}
