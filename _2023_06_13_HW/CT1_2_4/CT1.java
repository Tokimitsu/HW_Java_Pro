package org.example._2023_06_13_HW.CT1_2_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CT1 {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> base = new ArrayList<>();

        base.add("Hello");
        base.add("World");
        base.add("World");
        base.add("Hello");
        base.add("Hello");
        findDup(base);
        System.out.println("-".repeat(50));
        System.out.println(findString(base, "Hello"));
        System.out.println("-".repeat(50));
        System.out.println(findSum(set));
        System.out.println("-".repeat(50));
        System.out.println(findSubString(base, "H"));
        System.out.println("-".repeat(50));
    }

    //Найти все дубликаты в List<String> и вернуть их в виде нового списка.
    public static List<String> findDup(List<String> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    result.add(list.get(i));
                }
            }
        }
        System.out.println(result);
        return result;
    }


    //Проверить, содержит ли List<String> заданную строку
    // и вернуть ее индекс. Если строка не найдена, вернуть -1.
    public static int findString(List<String> list, String s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(s)) {
                return i;
            }
        }
        return -1;
    }

    //Найти сумму всех элементов в Set<Integer>, которые являются четными числами.
    public static Integer findSum(Set<Integer> set) {
        int sum = 0;
        for (Integer el : set) {
            if (el % 2 == 0) {
                sum += el;
            }
        }
        return sum;
    }

    //Проверить, содержит ли List<String> хотя бы
    // одну строку, которая начинается с заданного префикса.
    public static boolean findSubString(List<String> list, String prefix) {
        for (String el : list) {
            if (el.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }


    //Получить все возможные комбинации из List<String> и Set<Integer>,
    //где каждая комбинация представляет собой строку и число, объединенные вместе.
    public List<String> mergeFindDup(List<String> list, Set<Integer> set) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            for (Integer x : set) {
                result.add(s + x);
            }
        }
        return result;
    }


}