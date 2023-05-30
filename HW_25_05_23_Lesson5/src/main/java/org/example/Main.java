package org.example;

public class Main {


    public static void main(String[] args) {
        Methods mtd = new Methods();

        //Задача 1 : Напишите программу, которая находит сумму всех элементов в заданном массиве.
        mtd.arrSum(mtd.array(15, 15));

        // Задача 2 : Напишите программу, которая находит наименьшее и наибольшее значение в заданном массиве.
        mtd.arrMinMax(mtd.array(15, 15));

        // Задача 3 : Напишите программу, которая находит второй по величине элемент в заданном массиве.
        mtd.secondMax(mtd.array(15, 15));

        // Задача 4 : Напишите программу, которая находит наиболее часто встречающийся элемент в заданном массиве.
        mtd.mostFrequent(mtd.array(15, 15));

        // Задача 5 : Напишите программу, которая проверяет, является ли заданный массив палиндромом.
        mtd.isPalindrome(mtd.palindromeArray());

        // Задача 6 : Напишите программу, которая суммирует только положительные элементы в заданном массиве.
        mtd.positiveSum(mtd.array(15, 15));

        //  Задача 7 : Напишите программу, которая определяет, содержит ли заданный массив заданное значение.
        mtd.contains(mtd.array(15, 15), 5);

        System.out.println("///////////////////////////////LIST TASKS///////////////////////////////");
        System.out.println();

        // Задача 1 : Напишите метод для нахождения суммы всех элементов в ArrayList<Integer>.
        mtd.listSum(mtd.arrayList());

        // Задача 2 : Напишите метод для поиска наибольшего числа в ArrayList<Integer>.
        mtd.listMax(mtd.arrayList());

        // Задача 3 : Напишите метод для удаления всех четных чисел из ArrayList<Integer>.
        mtd.listRemoveEven(mtd.arrayList());

        //  Задача 4 : Напишите метод для определения количества положительных чисел в ArrayList<Integer>
        mtd.listPositiveCount(mtd.arrayList());

        // Задача 5 : Напишите метод, который проверяет, содержит ли ArrayList<Integer> заданное число.
        mtd.listContains(mtd.arrayList(), 5);

        // Задача 6 : Напишите метод для сортировки ArrayList<Integer> в порядке возрастания.
        mtd.listSortAscending(mtd.arrayList());

        //  Задача 7 : Напишите метод для нахождения второго наименьшего числа в ArrayList<Integer>.
        mtd.listSecondMin(mtd.arrayList());

        //  Задача 8 : Напишите метод, который объединяет два ArrayList<Integer> в один, удаляя дубликаты элементов.
        mtd.listMerge(mtd.arrayList(), mtd.arrayList());

        // Задача 9 : Напишите метод для нахождения наибольшей возрастающей подпоследовательности в ArrayList<Integer>.----опционально
        mtd.findLongestSequence(mtd.arrayList());

        // Задача 10 : Напишите метод для нахождения наибольшей убывающей подпоследовательности в ArrayList<Integer>..----опционально
        mtd.findLongestDecreaseSequence(mtd.arrayList());

        // Задача 11 : Напишите метод, который возвращает ArrayList<Integer> с уникальными элементами (удаляет дубликаты).
        mtd.listUnique(mtd.arrayList());

        // Задача 12 : Напишите метод, который удаляет все повторяющиеся элементы из ArrayList<Integer>.
        mtd.listRemoveDuplicates(mtd.arrayList());
    }
}