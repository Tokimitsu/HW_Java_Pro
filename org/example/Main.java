package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Boolean> students = new HashMap<>();
        students.put("Gary", true);
        students.put("Olena", false);
        students.put("Igor", true);
        students.put("Andrew", false);
        students.put("Mustafa", false);


        Map<String, Boolean> products = new HashMap<>();
        products.put("Apple", true);
        products.put("Orange", false);
        products.put("Banana", true);
        products.put("Pear", false);
        products.put("Grapes", false);


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");


        List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");


        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[][] arr1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String[] words1 = {"cat", "dog", "bunny", "cat", "rat", "dog"};


        Set<String> words2 = new HashSet<>();
        words2.add("cat");
        words2.add("Cheetah");
        words2.add("bunny");
        words2.add("Hedgehog");
        words2.add("rat");


        Set<String> words2_2 = new HashSet<>();
        words2_2.add("cat");
        words2_2.add("Grizzly");
        words2_2.add("bunny");
        words2_2.add("Deer");
        words2_2.add("rat");


        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("banana");
        stringSet.add("apple");
        stringSet.add("Banana");

        // Methods calls

        Main main = new Main();

        main.findLosers(students);
        System.out.println("-".repeat(50));

        main.productsNotInSctock(products);
        System.out.println("-".repeat(50));

        main.namesStartingWith(names, "C");
        System.out.println("-".repeat(50));

        main.findPalindrome(words);
        System.out.println("-".repeat(50));

        main.sumArr(arr);
        System.out.println("-".repeat(50));

        main.arrAvg(arr);
        System.out.println("-".repeat(50));

        main.findSum2(arr1);
        System.out.println("-".repeat(50));

        main.findMax(arr1);
        System.out.println("-".repeat(50));

        main.findUnique(words1);
        System.out.println("-".repeat(50));

        main.reverseStrings(words1);
        System.out.println("-".repeat(50));

        main.startsWithCapital(words2);
        System.out.println("-".repeat(50));

        main.findDuplicates(words2, words2_2);
        System.out.println("-".repeat(50));

        main.dulicatesIgnoringCase(stringSet);
        System.out.println("-".repeat(50));


    }
// Напишите функцию, которая находит и возвращает имена студентов, не сдавших экзамен.
    public List<String> findLosers(Map<String, Boolean> map) {
        List<String> losers = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (!entry.getValue()) {
                losers.add(entry.getKey());
            }
        }
        System.out.println(losers);
        return losers;
    }
// Напишите функцию, которая подсчитывает количество продуктов, которых нет в наличии.
    public int productsNotInSctock(Map<String, Boolean> map) {
        int count = 0;
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            if (!entry.getValue()) {
                count++;
            }
        }
        System.out.println("Products not in stock : " + count);
        return count;
    }
// Напишите программу, которая выводит все имена, начинающиеся на определенную букву.
    public void namesStartingWith(List<String> names, String target) {
        for (String name : names) {
            if (name.startsWith(target)) {
                System.out.println(name);
            }
        }
    }
// Напишите программу, которая находит все пары слов, в которых первое слово является обратным написанию второго слова.
    public void findPalindrome(List<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).equals(new StringBuilder(words.get(i + 1)).reverse().toString())) {
                System.out.println(words.get(i) + " -> " + words.get(i + 1));
            }
        }
    }
// -Напишите программу, которая находит сумму всех элементов в заданном массиве arr и выводит ее значение.
    public void sumArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
// Напишите программу, которая находит среднее арифметическое значение элементов в заданном массиве arr и выводит его.
    public void arrAvg(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum / arr.length);
    }
// Напишите программу, которая возвращает сумму всех элементов в [][] массиве.
    public void findSum2(int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println(sum);
    }
// Напишите программу, которая возвращает максимальное значение в [][] массиве.
    public void findMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        System.out.println(max);
    }
// возвращает новый массив, содержащий только уникальные строки из исходного массива
    public String[] findUnique(String[] arr) {
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set);
        return set.toArray(String[]::new);
    }
// возвращает новый массив строк, в котором все строки перевернуты задом наперёд.
    public String[] reverseStrings(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
// возвращает новый Set<String>, содержащий только те строки, которые начинаются с заглавной буквы.
    public Set<String> startsWithCapital(Set<String> words) {

        Set<String> result = new HashSet<>();
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                result.add(word);
            }
        }
        System.out.println(result);
        return result;

    }
// возвращает новый Set<String>, содержащий только те строки, которые присутствуют в обоих наборах.
    public Set<String> findDuplicates(Set<String> words, Set<String> words2) {
        Set<String> result = new HashSet<>();
        for (String word : words) {
            if (words2.contains(word)) {
                result.add(word);
            }
        }
        System.out.println(result);
        return result;
    }
// возвращает новый Set<String>, содержащий только уникальные строки, игнорируя регистр символов
    public Set<String> dulicatesIgnoringCase(Set<String> words) {
        Set<String> result = new HashSet<>();
        Set<String> temp = new HashSet<>();
        for (String word : words) {
            if (!temp.add(word.toLowerCase())) {
                result.add(word);
            }
        }
        System.out.println(result);
        return result;
    }
}