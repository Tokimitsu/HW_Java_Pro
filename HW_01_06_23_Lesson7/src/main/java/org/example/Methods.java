package org.example;
import java.util.*;

public class Methods {
    static Random rnd = new Random();

    /**
     * Method for deviding different blocks of code.
     */
    public void devide() {
        System.out.println();
        System.out.println("====================================================================================");
        System.out.println();
    }


    /**
     * First task methods
     */
    public void stringSorting(String str) {
        stringSortingHelper("", str);
    }

    private void stringSortingHelper(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char currentChar = remaining.charAt(i);
            String newPrefix = prefix + currentChar;
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            stringSortingHelper(newPrefix, newRemaining);
        }
    }


    /**
     * Second task method
     */
    public static boolean isAnagramm(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            int index = str2.indexOf(ch);
            if (index == -1) {
                return false;
            }
            str2 = str2.substring(0, index) + str2.substring(index + 1);
        }
        return str2.isEmpty();
    }


    /**
     * Third task method
     */
    public void stringSubstring(String s) {
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(s.substring(i, j));
            }
        }

    }


    /**
     * Fourth task method
     */
    public boolean isReversed(String str1, String str2) {

        if (str2.length() != str1.length()) {
            return false;
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str2.toLowerCase().charAt(i) != str1.toLowerCase().charAt(str1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }


    /**
     * Fifth task method
     */
    public void stringCombinations(String str) {
        List<String> combinations = new ArrayList<>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);
                combinations.add(substring);
            }
        }

        combinations.sort(Comparator.comparingInt(String::length));

        for (String combination : combinations) {
            System.out.println(combination);
        }
    }


    /**
     * Seventh task method
     *
     */
    public <T> T[] swap (T[] arr, int firstIndex, int secondIndex) {
        System.out.println("Initial array: " + Arrays.toString(arr));
        T temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
        System.out.println("Modified array: " +Arrays.toString(arr));
        return arr;
    }


    /**
     * Ninth task method
     *
     */
    public void printArray(Object[] objects) {
        System.out.println(Arrays.toString(objects));
    }


}
