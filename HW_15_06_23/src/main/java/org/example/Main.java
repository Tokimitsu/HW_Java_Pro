package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Methods mtd = new Methods();
        Map<String, Integer> map = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        System.out.println("Filling maps with data...");
        mtd.fillMap(map);
        mtd.fillMap2(map2);
        System.out.println("Map 1 :");
        System.out.println(map);
        System.out.println("Map 2 :");
        System.out.println(map2);
        System.out.println("-".repeat(50));

        System.out.println("Вывести все ключи из мапы на экран.");
        mtd.printKeys(map);
        System.out.println("-".repeat(50));

        System.out.println("Проверить, содержит ли мапа определенное значение.");
        mtd.containsTargetValue(map, 4);
        System.out.println("-".repeat(50));

        System.out.println("Найти ключ, связанный с определенным значением.");
        mtd.findTargetValuesKey(map, 3);
        System.out.println("-".repeat(50));

        System.out.println("Вывести на экран все ключи, у которых значение начинается с определенной буквы.");
        mtd.findKeysByStartLetter(map, 'a');
        System.out.println("-".repeat(50));

        System.out.println("Проверить, содержит ли мапа определенный ключ.");
        mtd.containsTargetKey(map, "c");
        System.out.println("-".repeat(50));

        System.out.println("Найти ключ с максимальным значением.");
        mtd.findMaxValueKey(map);
        System.out.println("-".repeat(50));

        System.out.println("Подсчитать количество ключей, значение которых содержит определенное слово.");
        mtd.countKeysByWord(map, "a");
        System.out.println("-".repeat(50));

        System.out.println("Найти все ключи, значение которых состоит только из цифр.");
        mtd.findKeysByOnlyNumbers(map2);
        System.out.println("-".repeat(50));

        System.out.println("Подсчитать сумму числовых значений в мапе.");
        mtd.sumValueNumbers(map2);
        System.out.println("-".repeat(50));

        System.out.println("Подсчитать количество ключей, у которых длина значения превышает определенную границу.");
        mtd.countKeysByLength(map2, 4);
        System.out.println("-".repeat(50));


        System.out.println("Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.");
        mtd.createNewMap(map);
        System.out.println("-".repeat(50));

        System.out.println("Очистить мапу и вывести сообщение о ее пустом состоянии.");
        mtd.clearMap(map);
        System.out.println("-".repeat(50));

        System.out.println("Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.");
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        mtd.printList(list);
        System.out.println("-".repeat(50));

        System.out.println("Затем перебрать список и вывести элементы в обратном порядке.");
        mtd.printListReverse(list);
        System.out.println("-".repeat(50));

        System.out.println("Вычислить сумму всех элементов в массиве int[] и вывести результат.");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        mtd.sumArray(array);
        System.out.println("-".repeat(50));

        System.out.println("Найти наименьший и наибольший элементы в массиве int[] и вывести их.");
        mtd.minMaxArray(array);
        System.out.println("-".repeat(50));

        System.out.println("Подсчитать количество четных элементов в массиве int[] и вывести результат.");
        mtd.countEvenArray(array);
        System.out.println("-".repeat(50));

        System.out.println("Отсортировать массив int[] в порядке убывания и вывести отсортированный массив.");
        mtd.sortReverseArray(array);
        System.out.println("-".repeat(50));

        System.out.println("Подсчитать сумму квадратов всех элементов в массиве int[] и вывести результат.");
        mtd.sumSquareArray(array);
        System.out.println("-".repeat(50));

        System.out.println("Посчитать сумму всех элементов во всем массиве.[][]");
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        mtd.sumAllArray(array2);
        System.out.println("-".repeat(50));

        System.out.println("Найти максимальное значение в каждой строке и вывести его.[][]");
        mtd.maxValueInArrayRow(array2);
        System.out.println("-".repeat(50));

        System.out.println("Найти среднее значение элементов в каждом столбце и вывести его.[][]");
        mtd.averageValueInArrayColumn(array2);
        System.out.println("-".repeat(50));

        System.out.println("Посчитать количество элементов, кратных заданному числу, во всем массиве.[][]");
        mtd.countTargetElementsInArray(array2, 3);
        System.out.println("-".repeat(50));

        System.out.println("Найти сумму элементов только в нечетных строках массива.[][]");
        mtd.sumOddRowsInArray(array2);
        System.out.println("-".repeat(50));
    }


}