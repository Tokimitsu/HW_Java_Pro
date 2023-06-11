package secondPart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
ArrayMethods arrayMethods = new ArrayMethods();
CollectionMethods collectionMethods = new CollectionMethods();

        int[] array = {5, 10, 3, 8, 2};
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(3);
        list.add(8);
        list.add(2);

//        Используя цикл for, переберите элементы массива и выведите каждый элемент на экран.
//        Используя цикл for-each, переберите элементы коллекции и выведите каждый элемент на экран.
        arrayMethods.printArray(array);
        collectionMethods.printCollection(list);

//        Найдите сумму всех элементов в массиве и выведите ее на экран.
//        Найдите сумму всех элементов в коллекции и выведите ее на экран.

        arrayMethods.sumArray(array);
        collectionMethods.sumCollection(list);

//        Найдите наименьшее и наибольшее значение в массиве и выведите их на экран.
//        Найдите наименьшее и наибольшее значение в коллекции и выведите их на экран.

        arrayMethods.findMinMaxArr(array);
        collectionMethods.findMinMaxColl(list);

//        Посчитайте количество элементов в массиве и выведите его на экран.
//        Посчитайте количество элементов в коллекции и выведите его на экран.

        arrayMethods.countElementsArr(array);
        collectionMethods.countElementsColl(list);

//        Подсчитайте среднее арифметическое всех элементов в массиве и выведите его на экран.
//        Подсчитайте среднее арифметическое всех элементов в коллекции и выведите его на экран.

        arrayMethods.findAverageArr(array);
        collectionMethods.findAverageColl(list);

    }
}
