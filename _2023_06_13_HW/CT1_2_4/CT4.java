package org.example._2023_06_13_HW.CT1_2_4;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CT4 {
    public static void main(String[] args) {


// Задача 1: Перебрать и вывести все элементы Map<String, Integer> с использованием Iterator.

Map<String, Integer> map = new HashMap<>();
        map.put("Kyiv", 1);
        map.put("Rome", 2);
        map.put("Athens", 3);
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("=".repeat(50));

// Задача 2: Перебрать и вывести все элементы Set<String> с использованием Iterator.
        Set<String> set = new HashSet<>();
        set.add("Kyiv");
        set.add("Rome");
        set.add("Athens");

        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("=".repeat(50));



// Задача 3: Перебрать и вывести все элементы List<String> с использованием ListIterator в обратном порядке.
        List<String> list = new ArrayList<>();
        list.add("Kyiv");
        list.add("Rome");
        list.add("Athens");
        ListIterator<String> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("=".repeat(50));

}
 }