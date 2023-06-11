package org.example;

public class Main {
    static Methods mtd = new Methods();

    public static void main(String[] args) {
        System.out.println("Задача 1:\n" +
                "Напишите программу, которая принимает на вход строку и выводит все перестановки символов этой строки.");

        System.out.println();
        mtd.stringSorting("abc");
        mtd.devide();

        System.out.println("Задача 2:\n" +
                "Напишите программу, которая принимает на вход две строки и проверяет, являются ли они анаграммами " +
                "(т.е. содержат ли они одинаковые символы в разном порядке).");

        System.out.println();
        System.out.println(mtd.isAnagramm("Lirean", "Linear"));
        System.out.println(mtd.isAnagramm("Listran", "Linear"));
        mtd.devide();


        System.out.println("Задача 3: Напишите программу, которая принимает на вход строку " +
                "и выводит все подстроки этой строки.");

        System.out.println();
        mtd.stringSubstring("Java");
        mtd.devide();


        System.out.println("Задача 4:Напишите программу, которая принимает на вход две строки и проверяет, " +
                "является ли одна строка перестановкой другой строки");

        System.out.println();
        System.out.println(mtd.isReversed("Alisher", "Rehsila"));
        System.out.println(mtd.isReversed("Lirean", "Linear"));
        System.out.println(mtd.isReversed("AbBa", "aBBa"));
        mtd.devide();

        System.out.println("Задача 5:Напишите программу, которая принимает на вход строку и выводит " +
                "все возможные комбинации символов этой строки в порядке возрастания их длины.");

        System.out.println();
        mtd.stringCombinations("Java");
        mtd.devide();

        System.out.println("Задача 6:Напишите параметризированный класс \"Pair\", который принимает два различных типа данных в качестве параметров\n" +
                "(например, \"Pair\"). Реализуйте методы для получения и установки значений каждого из элементов пары.");

        System.out.println();
        Pair<String, Integer> pair = new Pair<>("First", 1);

        System.out.println("Name: " + pair.getName() + " , ID: " + pair.getId());
        System.out.println("===================================");

        pair.setName("Second");
        pair.setId(2);

        System.out.println("Name: " + pair.getName() + " , ID: " + pair.getId());
        mtd.devide();

        System.out.println("Задача 7:Реализуйте параметризированный метод \"swap\", который принимает массив элементов и два индекса внутри массива.\n" +
                "Метод должен поменять местами элементы по указанным индексам.");

        System.out.println();
        mtd.swap(new Integer[]{1, 2, 3}, 0, 1);
        System.out.println();
        mtd.swap(new Double[]{1.0, 2.0, 3.0}, 0, 1);
        System.out.println();
        mtd.swap(new String[]{"First", "Second", "Third"}, 0, 1);
        System.out.println();
        mtd.swap(new Character[]{'A', 'B', 'C'}, 0, 1);
        System.out.println();
        mtd.devide();

        System.out.println("Задача 8:Создайте параметризированный класс \"Stack\", представляющий стек элементов. Реализуйте методы \"push\", \"pop\" и\n" +
                "\"isEmpty\" для добавления элемента в стек, извлечения элемента из стека и проверки, пуст ли стек соответственно.");

        System.out.println();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack.isEmpty());

        mtd.devide();

        System.out.println("Задача 9:Напишите параметризированный метод \"printArray\", который принимает массив элементов и выводит их на консоль.\n" +
                "Метод должен работать с любыми типами данных.");

        System.out.println();
        mtd.printArray(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        mtd.printArray(new Object[]{"First", "Second", "Third"});
        mtd.devide();

        System.out.println("Задача 10:Создайте параметризированный класс \"LinkedList\", представляющий связный список элементов. Реализуйте методы \"add\",\n" +
                "\"remove\" и \"contains\" для добавления элемента в список, удаления элемента из списка и проверки, содержится ли элемент\n" +
                "в списке соответственно.");

        System.out.println();
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.contains(3));
        list.remove(3);
        System.out.println(list.contains(3));
        mtd.devide();


    }


}