package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class TaskUtils {

    // Input Lists
    static List<String> inputStrings1 = List.of("apple", "banana", "cat", "dog", "elephant", "banana");
    static List<String> inputStrings2 = List.of("apple", "bana1na", "ca21t", "dog", "eleph34ant", "banana");
    static List<String> inputStrings3 = List.of("preoi", "preTWOpost", "oipost", "pre", "post", "preONEpost");
    static List<String> inputStrings4 = List.of("Darad", "Equauqe");
    static List<String> inputStrings5 = List.of("Hello again", "I'm the list ", "A of wierd strings");
    static List<String> inputStrings6 = List.of("Hello again", "", "List", "", "A of wierd strings");
    static List<String> inputStrings7 = List.of("listen", "silent");
    static List<Integer> inputIntegers1 = List.of(-1, -2, -3, 0, 1, 2, 3);
    static List<Integer> inputIntegers2 = List.of(-4, -5, -6, 0, 4, 5, 6);
    static List<Integer> inputIntegers3 = List.of(1, 2, 3, 5, 3, 7, 1, 9);


    public static void main(String[] args) {
        //task1
        System.out.println("Task1");
        System.out.println(task1(inputStrings1));
        System.out.println("*".repeat(90));
        //task2
        System.out.println("Task2");
        System.out.println(task2(inputStrings1, "a"));
        System.out.println("*".repeat(90));
        //task3
        System.out.println("Task3");
        System.out.println(task3(inputStrings1));
        System.out.println("*".repeat(90));
        //task4
        System.out.println("Task4");
        System.out.println(task4(inputIntegers1));
        System.out.println("*".repeat(90));
        //task5
        System.out.println("Task5");
        System.out.println(task5(inputIntegers1));
        System.out.println("*".repeat(90));
        //task6
        System.out.println("Task6");
        System.out.println(task6(inputIntegers1, inputIntegers2));
        System.out.println("*".repeat(90));
        //task7
        System.out.println("Task7");
        System.out.println(task7(inputStrings1));
        System.out.println("*".repeat(90));
        //task8
        System.out.println("Task8");
        System.out.println(task8(inputIntegers1));
        System.out.println("*".repeat(90));
        //task9
        System.out.println("Task9");
        System.out.println(task9(inputStrings2));
        System.out.println("*".repeat(90));
        //task10
        System.out.println("Task10");
        System.out.println(task10(inputStrings6));
        System.out.println("*".repeat(90));
        //task11
        System.out.println("Task11");
        System.out.println(task11(inputStrings1));
        System.out.println("*".repeat(90));
        //task12
        System.out.println("Task12");
        System.out.println(task12(inputStrings7));
        System.out.println("*".repeat(90));
        //task13
        System.out.println("Task13");
        System.out.println(task13(inputIntegers1, inputIntegers2));
        System.out.println("*".repeat(90));
        //task14
        System.out.println("Task14");
        System.out.println(task14(inputStrings1));
        System.out.println("*".repeat(90));
        //task15
        System.out.println("Task15");
        System.out.println(task15(inputStrings3));
        System.out.println("*".repeat(90));
        //task16
        System.out.println("Task16");
        System.out.println(Arrays.toString(task16(inputStrings1)));
        System.out.println("*".repeat(90));
        //task17
        System.out.println("Task17");
        System.out.println(task17(inputIntegers3));
        System.out.println("*".repeat(90));
        //task18
        System.out.println("Task18");
        System.out.println(task18(inputStrings1));
        System.out.println("*".repeat(90));
        //task19
        System.out.println("Task19");
        System.out.println(task19(inputStrings5));
        System.out.println("*".repeat(90));
        //task20
        System.out.println("Task20");
        System.out.println(task20(inputStrings4));
        System.out.println("*".repeat(90));
        //task21
        System.out.println("Task21");
        System.out.println(task21(inputIntegers1));
        System.out.println("*".repeat(90));
        //task22
        System.out.println("Task22");
        System.out.println(task22(inputStrings1));
        System.out.println("*".repeat(90));
        //task23
        System.out.println("Task23");
        System.out.println(task23(inputStrings1));
        System.out.println("*".repeat(90));
        //task24
        System.out.println("Task24");
        System.out.println(task24(Person.getFriends()));
        System.out.println("*".repeat(90));
        //task25
        System.out.println("Task25");
        System.out.println(task25(inputIntegers3));
        System.out.println("*".repeat(90));
        //task26
        System.out.println("Task26");
        System.out.println(task26(inputIntegers3));
        System.out.println("*".repeat(90));
        //task27
        System.out.println("Task27");
        System.out.println(task27(inputStrings1));
        System.out.println("*".repeat(90));
        //task28
        System.out.println("Task28");
        System.out.println(task28(inputStrings1));
        System.out.println("*".repeat(90));
        //task29
        System.out.println("Task29");
        System.out.println(task29(inputIntegers1));
        System.out.println("*".repeat(90));
        //task30
        System.out.println("Task30");
        System.out.println(task30(inputStrings1));
        System.out.println("*".repeat(90));
    }


    // Tasks Methods
    // Task 1
    public static List<String> task1(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // Task 2
    public static OptionalDouble task2(List<String> strings, String target) {
        return strings.stream()
                .filter(s -> s.startsWith(target.toUpperCase()) || s.startsWith(target.toLowerCase()))
                .mapToInt(String::length)
                .average();
    }

    // Task 3
    public static Map<Integer, List<String>> task3(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    // Task 4
    public static OptionalInt task4(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i > 0)
                .mapToInt(Integer::intValue)
                .min();
    }

    // Task 5
    public static Integer task5(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i > 0)
                .map(i -> i * i)
                .reduce(0, Integer::sum);

    }

    // Task 6
    public static List<Integer> task6(List<Integer> integers1, List<Integer> integers2) {
        List<Integer> joinedList = new ArrayList<>(integers1);
        joinedList.addAll(integers2);
        return joinedList.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
    }

    // Task 7
    public static List<Character> task7(List<String> strings) {
        return strings.stream()
                .flatMap(str -> str.chars().mapToObj(c -> (char) c))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }

    // Task 8
    public static OptionalInt task8(List<Integer> integers) {
        return integers.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .mapToInt(Integer::intValue)
                .max();
    }

    // Task 9
    public static Map<String, Map<Boolean, List<String>>> task9(List<String> strings) {
        return strings.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.groupingBy(
                        str -> str,
                        Collectors.flatMapping(
                                str -> str.chars().mapToObj(c -> String.valueOf((char) c)),
                                Collectors.partitioningBy(c -> c.matches("[aeiouAEIOU]"))
                        )
                ));
    }

    // Task 10
    public static String task10(List<String> strings) {
        return strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.joining(","));
    }

    // Task 11
    public static String task11(List<String> strings) {
        return strings.stream()
                .collect(Collectors.joining());
    }

    // Task 12
    public static boolean task12(List<String> words) {
        return words.stream()
                .map(word -> word.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString())
                .distinct()
                .count() == 1;
    }

    // Task 13
    public static Set<Integer> task13(List<Integer> integers1, List<Integer> integers2) {
        Set<Integer> difference = new HashSet<>();

        difference.addAll(integers1.stream()
                .filter(num -> !integers2.contains(num))
                .collect(Collectors.toSet()));

        difference.addAll(integers2.stream()
                .filter(num -> !integers1.contains(num))
                .collect(Collectors.toSet()));
        return difference;
    }

    // Task 14
    public static Map<Integer, Long> task14(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    }

    // Task 15
    public static List<String> task15(List<String> strings) {
        return strings.stream()
                .filter(s -> s.startsWith("pre") && s.endsWith("post"))
                .toList();
    }

    // Task 16
    public static int[] task16(List<String> strings) {
        return strings.stream()
                .mapToInt(String::length)
                .toArray();
    }

    // Task 17
    public static OptionalDouble task17(List<Integer> integers) {
        return integers.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .average();
    }

    // Task 18
    public static Optional<String> task18(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() % 2 == 0)
                .max(Comparator.comparing(String::length));
    }

    // Task 19
    public static List<String> task19(List<String> words) {
        return words.stream()
                .map(s -> s.replace(" ", ""))
                .sorted()
                .toList();
    }

    // Task 20
    public static boolean task20(List<String> words) {
        return words.stream()
                .allMatch(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()));
    }

    // Task 21
    public static OptionalInt task21(List<Integer> integers) {
        return integers.stream()
                .mapToInt(Integer::intValue)
                .filter(i -> i % 2 == 0)
                .max();
    }

    // Task 22
    public static String task22(List<String> strings) {
        return strings.stream()
                .map(s -> ">>" + s + "<<")
                .collect(Collectors.joining());

    }

    // Task 23
    public static String task23(List<String> strings) {
        return strings.stream()
                .flatMap(s -> s.chars().mapToObj(c -> (char) c))
                .distinct()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining());

    }

    // Task 24
    public static List<Person> task24(List<Person> friends) {
        return friends.stream()
                .filter(p -> p.getAge() >= 25 && p.getAge() <= 40)
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());

    }

    // Task 25
    public static int task25(List<Integer> integers) {
        return integers.stream()
                .filter(i -> i > 0)
                .filter(i -> i % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // Task 26
    public static OptionalInt task26(List<Integer> integers) {
        return integers.stream()
                .distinct()
                .sorted()
                .mapToInt(Integer::intValue)
                .skip(1)
                .min();
    }

    // Task 27
    public static Map<Boolean, Long> task27(List<String> strings) {
        return strings.stream()
                .collect(Collectors.partitioningBy(word -> word.length() > 4, Collectors.counting()));
    }

    // Task 28
    public static String task28(List<String> strings) {
        return strings.stream()
                .map(s -> s.substring(3))
                .collect(Collectors.joining());
    }

    // Task 29
    public static List<Integer> task29(List<Integer> integers) {
        return integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
    }

    // Task 30
    public static boolean task30(List<String> strings) {
        return strings.stream()
                .anyMatch(s -> s.contains("an"));
    }

    // Additional Methods

    public static List<String> getInputStrings1() {
        return inputStrings1;
    }

    public static List<String> getInputStrings2() {
        return inputStrings2;
    }

    public static List<String> getInputStrings3() {
        return inputStrings3;
    }

    public static List<String> getInputStrings4() {
        return inputStrings4;
    }

    public static List<Integer> getInputIntegers1() {
        return inputIntegers1;

    }

    public static List<String> getInputStrings5() {
        return inputStrings5;
    }

    public static List<String> getInputStrings6() {
        return inputStrings6;
    }

    public static List<String> getInputStrings7() {
        return inputStrings7;
    }

    public static List<Integer> getInputIntegers2() {
        return inputIntegers2;

    }

    public static List<Integer> getInputIntegers3() {
        return inputIntegers3;
    }


}

