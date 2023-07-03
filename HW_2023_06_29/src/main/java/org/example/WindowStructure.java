package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class WindowStructure {
    private JFrame frame;
    private JPanel contentPanel;
    private CardLayout cardLayout;

    String taskDescription1 = "Дан список строк. Необходимо отфильтровать строки, длина которых больше " +
            "3 символов, преобразовать их в верхний регистр, удалить повторяющиеся и вывести результат " +
            "в отсортированном порядке. \n \n " + "Изначальный список : \n" + TaskUtils.getInputStrings1();

    String resultText1 = ("return strings.stream()\n" +
            "                .filter(s -> s.length() > 3)\n" +
            "                .map(String::toUpperCase)\n" +
            "                .distinct()\n" +
            "                .sorted()\n" +
            "                .collect(Collectors.toList());\n \n " + "Результат работы метода : \n \n " +
            String.join(",", TaskUtils.task1(TaskUtils.getInputStrings1())));

    String taskDescription2 = "Дан список слов. Необходимо найти среднюю длину слов, начинающихся " +
            "с буквы \"A\". \n \n " + "Изначальный список : \n" + TaskUtils.getInputStrings1();
    String resultText2 = "return strings.stream()\n" +
            "                .filter(s -> s.startsWith(target.toUpperCase()) || s.startsWith(target.toLowerCase()))\n" +
            "                .mapToInt(String::length)\n" +
            "                .average();\n \n " + "Результат работы метода : \n \n " +
            TaskUtils.task2(TaskUtils.getInputStrings1(), "a");

    String taskDescription3 = "Дан список слов. Необходимо сгруппировать их по длине и вывести результат. \n \n " + "Изначальный список : \n"
            + TaskUtils.getInputStrings1();
    String resultText3 = "return strings.stream()\n" +
            "                .collect(Collectors.groupingBy(String::length)); \n \n" + "Результат работы метода : \n \n "
            + TaskUtils.task3(TaskUtils.getInputStrings1());

    String taskDescription4 = "Дан список чисел. Необходимо найти наименьшее число, больше 0. \n \n " + "Изначальный список : \n"
            + TaskUtils.getInputIntegers1();
    String resultText4 = "return integers.stream()\n" +
            "                .filter(i -> i > 0)\n" +
            "                .mapToInt(Integer::intValue)\n" +
            "                .min(); \n \n " + "Результат работы метода : \n \n "
            + TaskUtils.task4(TaskUtils.getInputIntegers1());

    String taskDescription5 = "Дан список чисел. Необходимо найти сумму квадратов всех положительных чисел. \n \n " + "Изначальный список : \n"
            + TaskUtils.getInputIntegers1();
    String resultText5 = "return integers.stream()\n" +
            "                .filter(i -> i > 0)\n" +
            "                .map(i -> i * i)\n" +
            "                .reduce(0, Integer::sum); \n \n " + "Результат работы метода : \n \n "
            + TaskUtils.task5(TaskUtils.getInputIntegers1());

    String taskDescription6 = "Даны два списка чисел. Необходимо объединить их в один список, " +
            "отсортировать по убыванию и удалить повторяющиеся элементы. \n \n " + "Изначальные списки : \n"
            + TaskUtils.getInputIntegers1() + "\n" + TaskUtils.getInputIntegers2();
    String resultText6 = "List<Integer> joinedList = new ArrayList<>(integers1);\n" +
            "        joinedList.addAll(integers2);\n" +
            "        return joinedList.stream()\n" +
            "                .sorted(Comparator.reverseOrder())\n" +
            "                .distinct()\n" +
            "                .toList(); \n \n " + "Результат работы метода : \n \n "
            + TaskUtils.task6(TaskUtils.getInputIntegers1(), TaskUtils.getInputIntegers2());

    String taskDescription7 = "Дан список строк. Необходимо оставить только уникальные символы " +
            "из всех строк и вывести их в алфавитном порядке. \n \n " + "Изначальный список : \n "
            + TaskUtils.getInputStrings1();
    String resultText7 = "return strings.stream()\n" +
            "                .flatMap(str -> str.chars().mapToObj(c -> (char) c))\n" +
            "                .distinct()\n" +
            "                .sorted()\n" +
            "                .collect(Collectors.toList()); \n \n " + "Результат работы метода : \n \n "
            + TaskUtils.task7(TaskUtils.getInputStrings1());

    String taskDescription8 = "Дан список чисел. Необходимо найти второе максимальное число. \n \n " + "Изначальный список : \n "
            + TaskUtils.getInputIntegers1();
    String resultText8 = " return integers.stream()\n" +
            "                .sorted(Comparator.reverseOrder())\n" +
            "                .skip(1)\n" +
            "                .mapToInt(Integer::intValue)\n" +
            "                .max(); \n \n " + "Результат работы метода : \n \n "
            + TaskUtils.task8(TaskUtils.getInputIntegers1());

    String taskDescription9 = "Дан список слов. Необходимо отфильтровать слова, состоящие только " +
            "из букв, разделить их на гласные и согласные, и вывести результат. \n \n " + "Изначальный список : \n"
            + TaskUtils.getInputStrings2();
    String resultText9 = "return strings.stream()\n" +
            "                .filter(s -> s.matches(\"[a-zA-Z]+\"))\n" +
            "                .collect(Collectors.groupingBy(\n" +
            "                        str -> str,\n" +
            "                        Collectors.flatMapping(\n" +
            "                                str -> str.chars().mapToObj(c -> String.valueOf((char) c)),\n" +
            "                                Collectors.partitioningBy(c -> c.matches(\"[aeiouAEIOU]\"))\n" +
            "                        )\n" +
            "                )); \n \n " + "Результат работы метода : \n \n "
            + TaskUtils.task9(TaskUtils.getInputStrings2());

    String taskDescription10 = "Дан список строк. Необходимо удалить пустые строки, " +
            "объединить оставшиеся строки в одну строку, разделенную запятой. \n\n " + "Изначальный список : \n"
            + TaskUtils.getInputStrings6();
    String resultText10 = " return strings.stream()\n" +
            "                .filter(str -> !str.isEmpty())\n" +
            "                .collect(Collectors.joining(\",\")); \n \n" + "Результат работы метода : \n \n "
            + TaskUtils.task10(TaskUtils.getInputStrings6());

    String taskDescription11 = "Дан список слов. Необходимо объединить все символы из всех слов в одну строку. \n\n " + "Изначальный список : \n"
            + TaskUtils.getInputStrings1();
    String resultText11 = "return strings.stream()\n" +
            "                .collect(Collectors.joining()); \n \n " + "Результат работы метода : \n \n "
            + TaskUtils.task11(TaskUtils.getInputStrings1());

    String taskDescription12 = "Дан список слов. Необходимо проверить, " +
            "содержат ли они одинаковые символы (являются ли анаграммами) и вывести результат. \n \n " + "Изначальный список : \n"
            + TaskUtils.getInputStrings7();
    String resultText12 = "return words.stream()\n" +
            "                .map(word -> word.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString())\n" +
            "                .distinct()\n" +
            "                .count() == 1; \n \n " + "Результат работы метода : \n \n "
            + TaskUtils.task12(TaskUtils.getInputStrings7());

    String taskDescription13 = "Даны два списка чисел. Необходимо " +
            "найти разность множеств (элементы, присутствующие только в одном из списков) и вывести результат. \n\n" + "Изначальные списки : \n"
            + TaskUtils.getInputIntegers1() + "\n" + TaskUtils.getInputIntegers2();
    String resultText13 = " Set<Integer> difference = new HashSet<>();\n" +
            "\n" +
            "        difference.addAll(integers1.stream()\n" +
            "                .filter(num -> !integers2.contains(num))\n" +
            "                .collect(Collectors.toSet()));\n" +
            "\n" +
            "        difference.addAll(integers2.stream()\n" +
            "                .filter(num -> !integers1.contains(num))\n" +
            "                .collect(Collectors.toSet()));\n" +
            "        return difference; \n \n " + "Результат работы метода : \n \n"
            + TaskUtils.task13(TaskUtils.getInputIntegers1(), TaskUtils.getInputIntegers2());

    String taskDescription14 = "Дан список слов. Необходимо подсчитать количество слов для каждой длины и вывести результат. \n\n "
            + "Изначальный список :  \n"
            + TaskUtils.getInputStrings1();
    String resultText14 = " return strings.stream()\n" +
            "                .collect(Collectors.groupingBy(String::length, Collectors.counting())); \n\n " + "Результат работы метода : \n \n"
            + TaskUtils.task14(TaskUtils.getInputStrings1());

    String taskDescription15 = "Дан список строк. Необходимо отфильтровать " +
            "строки, которые начинаются с префикса \"pre\" и заканчиваются суффиксом \"post\". \n \n"
            + "Изначальный список :  \n"
            + TaskUtils.getInputStrings3();
    String resultText15 = "return strings.stream()\n" +
            "                .filter(s -> s.startsWith(\"pre\") && s.endsWith(\"post\"))\n" +
            "                .toList(); \n\n" + "Результат работы метода : \n \n"
            + TaskUtils.task15(TaskUtils.getInputStrings3());

    String taskDescription16 = "Дан список слов. Необходимо подсчитать количество символов в каждом слове и вывести результат."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputStrings1();
    String resultText16 = " return strings.stream()\n" +
            "                .mapToInt(String::length)\n" +
            "                .toArray(); \n \n " + "Результат работы метода : \n \n"
            + Arrays.toString(TaskUtils.task16(TaskUtils.getInputStrings1()));

    String taskDescription17 = "Дан список чисел. Необходимо найти среднее значение всех уникальных чисел."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputIntegers3();
    String resultText17 = "  return integers.stream()\n" +
            "                .distinct()\n" +
            "                .mapToInt(Integer::intValue)\n" +
            "                .average(); \n\n" + "Результат работы метода : \n \n"
            + TaskUtils.task17(TaskUtils.getInputIntegers3());

    String taskDescription18 = "Дан список слов. Необходимо найти самое длинное слово с четной длиной."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputStrings1();
    String resultText18 = "return strings.stream()\n" +
            "                .filter(s -> s.length() % 2 == 0)\n" +
            "                .max(Comparator.comparing(String::length)); \n\n" + "Результат работы метода : \n \n"
            + TaskUtils.task18(TaskUtils.getInputStrings1());

    String taskDescription19 = "Дан список строк. Необходимо удалить все пробелы в каждой строке, " +
            "отсортировать их в лексикографическом порядке и вывести результат."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputStrings5();
    String resultText19 = " return words.stream()\n" +
            "                .map(s -> s.replace(\" \", \"\"))\n" +
            "                .sorted()\n" +
            "                .toList(); \n\n" + "Результат работы метода : \n \n"
            + TaskUtils.task19(TaskUtils.getInputStrings5());

    String taskDescription20 = "Дан список слов. Необходимо проверить, являются ли они палиндромами, и вывести результат."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputStrings4();
    String resultText20 = " return words.stream()\n" +
            "                .allMatch(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())); \n\n" +
            "Результат работы метода : \n \n"
            + TaskUtils.task20(TaskUtils.getInputStrings4());

    String taskDescription21 = "Дан список чисел. Необходимо найти максимальное четное число."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputIntegers1();
    String resultText21 = " return integers.stream()\n" +
            "                .mapToInt(Integer::intValue)\n" +
            "                .filter(i -> i % 2 == 0)\n" +
            "                .max(); \n\n" + "Результат работы метода : \n \n"
            + TaskUtils.task21(TaskUtils.getInputIntegers1());

    String taskDescription22 = "Дан список строк. Необходимо объединить все строки в " +
            "одну строку, добавив префикс \">>\" и суффикс \"<<\" к каждой строке."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputStrings1();
    String resultText22 = " return strings.stream()\n" +
            "                .map(s -> \">>\" + s + \"<<\")\n" +
            "                .collect(Collectors.joining()); \n\n" + "Результат работы метода : \n \n"
            + TaskUtils.task22(TaskUtils.getInputStrings1());

    String taskDescription23 = "Дан список строк. Необходимо объединить все символы из всех строк, " +
            "удалить дубликаты и отсортировать их в лексикографическом порядке."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputStrings1();
    String resultText23 = " return strings.stream()\n" +
            "                .flatMap(s -> s.chars().mapToObj(c->(char) c))\n" +
            "                .distinct()\n" +
            "                .sorted()\n" +
            "                .map(Object::toString)\n" +
            "                .collect(Collectors.joining());\n\n" + "Результат работы метода : \n \n"
            + TaskUtils.task23(TaskUtils.getInputStrings1());

    String taskDescription24 = "Дан список объектов Person с полем \"возраст\". Необходимо отфильтровать объекты, " +
            "возраст которых находится в диапазоне от 25 до 40 лет, отсортировать по имени и вывести результат."
            + " \n\n" + "Изначальный список :  \n"
            + Person.getFriends();
    String resultText24 = "return friends.stream() \n" +
            "                .filter(p -> p.getAge()>=25 && p.getAge() <= 40)\n" +
            "                .sorted(Comparator.comparing(Person::getName))\n" +
            "                .collect(Collectors.toList()); \n \n" + "Результат работы метода : \n \n"
            + TaskUtils.task24(Person.getFriends());

    String taskDescription25 = "Дан список чисел. Необходимо найти сумму всех четных чисел, которые являются положительными."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputIntegers3();
    String resultText25 = "return integers.stream()\n" +
            "                .filter(i-> i>0)\n" +
            "                .filter(i-> i%2==0)\n" +
            "                .mapToInt(Integer::intValue)\n" +
            "                .sum(); \n \n " + "Результат работы метода : \n \n"
            + TaskUtils.task25(TaskUtils.getInputIntegers3());

    String taskDescription26 = "Дан список чисел. Необходимо найти второе минимальное число среди уникальных чисел."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputIntegers3();
    String resultText26 = "return integers.stream()\n" +
            "                .sorted()\n" +
            "                .distinct()\n" +
            "                .mapToInt(Integer::intValue)\n" +
            "                .skip(1)\n" +
            "                .min(); \n \n" + "Результат работы метода : \n \n"
            + TaskUtils.task26(TaskUtils.getInputIntegers3());

    String taskDescription27 = "Дан список слов. Необходимо разделить их на две группы: одна группа - слова с длиной " +
            "менее или равной 4 символам, другая группа - слова с длиной более 4 символов. После этого " +
            "подсчитать количество слов в каждой группе и вывести результат."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputStrings1();
    String resultText27 = " return strings.stream()\n" +
            "                .collect(Collectors.partitioningBy(word -> word.length() > 4, Collectors.counting())); \n \n"
            + "Результат работы метода : \n \n"
            + TaskUtils.task27(TaskUtils.getInputStrings1());

    String taskDescription28 = "Дан список строк. Необходимо пропустить первые три символа в каждой строке и объединить " +
            "оставшиеся символы в одну строку."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputStrings1();
    String resultText28 = "return strings.stream()\n" +
            "                .map(s -> s.substring(3))\n" +
            "                .collect(Collectors.joining()); \n\n" + "Результат работы метода : \n \n"
            + TaskUtils.task28(TaskUtils.getInputStrings1());

    String taskDescription29 = "Дан список чисел. Необходимо найти три наименьших числа и вывести результат."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputIntegers1();
    String resultText29 = "return integers.stream()\n" +
            "                .sorted()\n" +
            "                .limit(3)\n" +
            "                .collect(Collectors.toList()); \n \n" + "Результат работы метода : \n \n"
            + TaskUtils.task29(TaskUtils.getInputIntegers1());

    String taskDescription30 = "Дан список строк. Необходимо проверить, содержит ли хотя бы одна строка подстроку" +
            "\"an\" и вывести результат."
            + " \n\n" + "Изначальный список :  \n"
            + TaskUtils.getInputStrings1();
    String resultText30 = " return strings.stream()\n" +
            "                .anyMatch(s->s.contains(\"an\")); \n \n" + "Результат работы метода : \n \n"
            + TaskUtils.task30(TaskUtils.getInputStrings1());


    public WindowStructure() {
        frame = new JFrame("Домашня робота");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        contentPanel = new JPanel();
        cardLayout = new CardLayout();
        contentPanel.setLayout(cardLayout);

        JPanel welcomeScreen = createWelcomeScreen();
        contentPanel.add(welcomeScreen, "welcome");


        frame.add(contentPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private JPanel createWelcomeScreen() {
        JPanel welcomePanel = new JPanel(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Вітаю в презентаційному вікні домашньої роботи!");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        ;
        welcomePanel.add(welcomeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton startButton = new JButton("Почати");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTaskScreen();
            }
        });
        buttonPanel.add(startButton);

        welcomePanel.add(buttonPanel, BorderLayout.SOUTH);

        return welcomePanel;
    }

    private void showTaskScreen() {
        JPanel taskPanel1 = createTaskScreen1(taskDescription1, resultText1);
        contentPanel.add(taskPanel1, "task");

        JPanel taskPanel2 = createTaskScreen1(taskDescription2, resultText2);
        contentPanel.add(taskPanel2, "taskScreen2");

        JPanel taskPanel3 = createTaskScreen1(taskDescription3, resultText3);
        contentPanel.add(taskPanel3, "taskScreen3");

        JPanel taskPanel4 = createTaskScreen1(taskDescription4, resultText4);
        contentPanel.add(taskPanel4, "taskScreen4");

        JPanel taskPanel5 = createTaskScreen1(taskDescription5, resultText5);
        contentPanel.add(taskPanel5, "taskScreen5");

        JPanel taskPanel6 = createTaskScreen1(taskDescription6, resultText6);
        contentPanel.add(taskPanel6, "taskScreen6");

        JPanel taskPanel7 = createTaskScreen1(taskDescription7, resultText7);
        contentPanel.add(taskPanel7, "taskScreen7");

        JPanel taskPanel8 = createTaskScreen1(taskDescription8, resultText8);
        contentPanel.add(taskPanel8, "taskScreen8");

        JPanel taskPanel9 = createTaskScreen1(taskDescription9, resultText9);
        contentPanel.add(taskPanel9, "taskScreen9");

        JPanel taskPanel10 = createTaskScreen1(taskDescription10, resultText10);
        contentPanel.add(taskPanel10, "taskScreen10");

        JPanel taskPanel11 = createTaskScreen1(taskDescription11, resultText11);
        contentPanel.add(taskPanel11, "taskScreen11");

        JPanel taskPanel12 = createTaskScreen1(taskDescription12, resultText12);
        contentPanel.add(taskPanel12, "taskScreen12");

        JPanel taskPanel13 = createTaskScreen1(taskDescription13, resultText13);
        contentPanel.add(taskPanel13, "taskScreen13");

        JPanel taskPanel14 = createTaskScreen1(taskDescription14, resultText14);
        contentPanel.add(taskPanel14, "taskScreen14");

        JPanel taskPanel15 = createTaskScreen1(taskDescription15, resultText15);
        contentPanel.add(taskPanel15, "taskScreen15");

        JPanel taskPanel16 = createTaskScreen1(taskDescription16, resultText16);
        contentPanel.add(taskPanel16, "taskScreen16");

        JPanel taskPanel17 = createTaskScreen1(taskDescription17, resultText17);
        contentPanel.add(taskPanel17, "taskScreen17");

        JPanel taskPanel18 = createTaskScreen1(taskDescription18, resultText18);
        contentPanel.add(taskPanel18, "taskScreen18");

        JPanel taskPanel19 = createTaskScreen1(taskDescription19, resultText19);
        contentPanel.add(taskPanel19, "taskScreen19");

        JPanel taskPanel20 = createTaskScreen1(taskDescription20, resultText20);
        contentPanel.add(taskPanel20, "taskScreen20");

        JPanel taskPanel21 = createTaskScreen1(taskDescription21, resultText21);
        contentPanel.add(taskPanel21, "taskScreen21");

        JPanel taskPanel22 = createTaskScreen1(taskDescription22, resultText22);
        contentPanel.add(taskPanel22, "taskScreen22");

        JPanel taskPanel23 = createTaskScreen1(taskDescription23, resultText23);
        contentPanel.add(taskPanel23, "taskScreen23");

        JPanel taskPanel24 = createTaskScreen1(taskDescription24, resultText24);
        contentPanel.add(taskPanel24, "taskScreen24");

        JPanel taskPanel25 = createTaskScreen1(taskDescription25, resultText25);
        contentPanel.add(taskPanel25, "taskScreen25");

        JPanel taskPanel26 = createTaskScreen1(taskDescription26, resultText26);
        contentPanel.add(taskPanel26, "taskScreen26");

        JPanel taskPanel27 = createTaskScreen1(taskDescription27, resultText27);
        contentPanel.add(taskPanel27, "taskScreen27");

        JPanel taskPanel28 = createTaskScreen1(taskDescription28, resultText28);
        contentPanel.add(taskPanel28, "taskScreen28");

        JPanel taskPanel29 = createTaskScreen1(taskDescription29, resultText29);
        contentPanel.add(taskPanel29, "taskScreen29");

        JPanel taskPanel30 = createTaskScreen1(taskDescription30, resultText30);
        contentPanel.add(taskPanel30, "taskScreen30");


        cardLayout.show(contentPanel, "task");
    }


    private JPanel createTaskScreen1(String taskDescription, String result) {
        JPanel taskPanel = new JPanel(new BorderLayout());

        JLabel taskLabel = new JLabel("Задача 1:");
        JTextArea taskTextArea = new JTextArea(taskDescription);
        taskTextArea.setEditable(false);
        taskTextArea.setLineWrap(true);
        taskTextArea.setWrapStyleWord(true);
        taskTextArea.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane = new JScrollPane(taskTextArea);

        JPanel taskDescriptionPanel = new JPanel(new BorderLayout());
        taskDescriptionPanel.add(taskLabel, BorderLayout.NORTH);
        taskDescriptionPanel.add(taskScrollPane, BorderLayout.CENTER);

        taskPanel.add(taskDescriptionPanel, BorderLayout.NORTH);

        JLabel resultLabel = new JLabel("Результат 1:");
        JTextArea resultTextArea = new JTextArea(result);
        resultTextArea.setEditable(false);
        resultTextArea.setLineWrap(true);
        resultTextArea.setWrapStyleWord(true);
        resultTextArea.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane = new JScrollPane(resultTextArea);

        JPanel resultPanel = new JPanel(new BorderLayout());
        resultPanel.add(resultLabel, BorderLayout.NORTH);
        resultPanel.add(resultScrollPane, BorderLayout.CENTER);

        taskPanel.add(resultPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton = new JButton("Назад");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "welcome");
            }
        });
        buttonPanel.add(backButton);

        JButton nextButton = new JButton("Далі");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen2 = createTaskScreen2(taskDescription2, resultText2);
                contentPanel.add(taskScreen2, "taskScreen2");
                cardLayout.show(contentPanel, "taskScreen2");
            }
        });
        buttonPanel.add(nextButton);

        taskPanel.add(buttonPanel, BorderLayout.SOUTH);

        return taskPanel;
    }

    private JPanel createTaskScreen2(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 2:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 2:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "task");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen3 = createTaskScreen3(taskDescription3, resultText3);
                contentPanel.add(taskScreen3, "taskScreen3");
                cardLayout.show(contentPanel, "taskScreen3");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen3(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 3:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 3:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen2");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen4 = createTaskScreen4(taskDescription4, resultText4);
                contentPanel.add(taskScreen4, "taskScreen4");
                cardLayout.show(contentPanel, "taskScreen4");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen4(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 4:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 4:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen3");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen5 = createTaskScreen5(taskDescription5, resultText5);
                contentPanel.add(taskScreen5, "taskScreen5");
                cardLayout.show(contentPanel, "taskScreen5");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen5(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 5:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 5:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen4");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen6 = createTaskScreen6(taskDescription6, resultText6);
                contentPanel.add(taskScreen6, "taskScreen6");
                cardLayout.show(contentPanel, "taskScreen6");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen6(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 6:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 6:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen5");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen7 = createTaskScreen7(taskDescription7, resultText7);
                contentPanel.add(taskScreen7, "taskScreen7");
                cardLayout.show(contentPanel, "taskScreen7");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen7(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 7:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 7:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen6");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen8 = createTaskScreen8(taskDescription8, resultText8);
                contentPanel.add(taskScreen8, "taskScreen8");
                cardLayout.show(contentPanel, "taskScreen8");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen8(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 8:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 8:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen7");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen9 = createTaskScreen9(taskDescription9, resultText9);
                contentPanel.add(taskScreen9, "taskScreen9");
                cardLayout.show(contentPanel, "taskScreen9");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen9(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 9:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 9:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen8");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen10 = createTaskScreen10(taskDescription10, resultText10);
                contentPanel.add(taskScreen10, "taskScreen10");
                cardLayout.show(contentPanel, "taskScreen10");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen10(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 10:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 10:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen9");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen11 = createTaskScreen11(taskDescription11, resultText11);
                contentPanel.add(taskScreen11, "taskScreen11");
                cardLayout.show(contentPanel, "taskScreen11");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen11(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 11:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 11:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen10");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen12 = createTaskScreen12(taskDescription12, resultText12);
                contentPanel.add(taskScreen12, "taskScreen12");
                cardLayout.show(contentPanel, "taskScreen12");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen12(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 12:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 12:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen11");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen13 = createTaskScreen13(taskDescription13, resultText13);
                contentPanel.add(taskScreen13, "taskScreen13");
                cardLayout.show(contentPanel, "taskScreen13");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen13(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 13:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 13:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen12");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen14 = createTaskScreen14(taskDescription14, resultText14);
                contentPanel.add(taskScreen14, "taskScreen14");
                cardLayout.show(contentPanel, "taskScreen14");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen14(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 14:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 14:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen13");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen15 = createTaskScreen15(taskDescription15, resultText15);
                contentPanel.add(taskScreen15, "taskScreen15");
                cardLayout.show(contentPanel, "taskScreen15");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen15(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 15:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 15:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen14");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen16 = createTaskScreen16(taskDescription16, resultText16);
                contentPanel.add(taskScreen16, "taskScreen16");
                cardLayout.show(contentPanel, "taskScreen16");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen16(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 16:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 16:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen15");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen17 = createTaskScreen17(taskDescription17, resultText17);
                contentPanel.add(taskScreen17, "taskScreen17");
                cardLayout.show(contentPanel, "taskScreen17");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen17(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 17:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 17:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen16");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen18 = createTaskScreen18(taskDescription18, resultText18);
                contentPanel.add(taskScreen18, "taskScreen18");
                cardLayout.show(contentPanel, "taskScreen18");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen18(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 18:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 18:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen17");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen19 = createTaskScreen19(taskDescription19, resultText19);
                contentPanel.add(taskScreen19, "taskScreen19");
                cardLayout.show(contentPanel, "taskScreen19");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen19(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 19:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 19:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen18");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen20 = createTaskScreen20(taskDescription20, resultText20);
                contentPanel.add(taskScreen20, "taskScreen20");
                cardLayout.show(contentPanel, "taskScreen20");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen20(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 20:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 20:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen19");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen21 = createTaskScreen21(taskDescription21, resultText21);
                contentPanel.add(taskScreen21, "taskScreen21");
                cardLayout.show(contentPanel, "taskScreen21");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen21(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 21:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 21:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen20");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen22 = createTaskScreen22(taskDescription22, resultText22);
                contentPanel.add(taskScreen22, "taskScreen22");
                cardLayout.show(contentPanel, "taskScreen22");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen22(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 22:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 22:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen21");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen23 = createTaskScreen23(taskDescription23, resultText23);
                contentPanel.add(taskScreen23, "taskScreen23");
                cardLayout.show(contentPanel, "taskScreen23");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen23(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 23:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 23:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen22");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen24 = createTaskScreen24(taskDescription24, resultText24);
                contentPanel.add(taskScreen24, "taskScreen24");
                cardLayout.show(contentPanel, "taskScreen24");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen24(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 24:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 24:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen23");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen25 = createTaskScreen25(taskDescription25, resultText25);
                contentPanel.add(taskScreen25, "taskScreen25");
                cardLayout.show(contentPanel, "taskScreen25");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen25(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 25:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 25:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen24");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen26 = createTaskScreen26(taskDescription26, resultText26);
                contentPanel.add(taskScreen26, "taskScreen26");
                cardLayout.show(contentPanel, "taskScreen26");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen26(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 26:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 26:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen25");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen27 = createTaskScreen27(taskDescription27, resultText27);
                contentPanel.add(taskScreen27, "taskScreen27");
                cardLayout.show(contentPanel, "taskScreen27");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen27(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 27:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 27:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen26");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen28 = createTaskScreen28(taskDescription28, resultText28);
                contentPanel.add(taskScreen28, "taskScreen28");
                cardLayout.show(contentPanel, "taskScreen28");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen28(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 28:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 28:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen27");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen29 = createTaskScreen29(taskDescription29, resultText29);
                contentPanel.add(taskScreen29, "taskScreen29");
                cardLayout.show(contentPanel, "taskScreen29");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen29(String taskDescription, String result) {
        JPanel taskPanel2 = new JPanel(new BorderLayout());

        JLabel taskLabel2 = new JLabel("Задача 29:");
        JTextArea taskTextArea2 = new JTextArea(taskDescription);
        taskTextArea2.setEditable(false);
        taskTextArea2.setLineWrap(true);
        taskTextArea2.setWrapStyleWord(true);
        taskTextArea2.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane2 = new JScrollPane(taskTextArea2);

        JPanel taskDescriptionPanel2 = new JPanel(new BorderLayout());
        taskDescriptionPanel2.add(taskLabel2, BorderLayout.NORTH);
        taskDescriptionPanel2.add(taskScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(taskDescriptionPanel2, BorderLayout.NORTH);

        JLabel resultLabel2 = new JLabel("Результат 29:");
        JTextArea resultTextArea2 = new JTextArea(result);
        resultTextArea2.setEditable(false);
        resultTextArea2.setLineWrap(true);
        resultTextArea2.setWrapStyleWord(true);
        resultTextArea2.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane2 = new JScrollPane(resultTextArea2);

        JPanel resultPanel2 = new JPanel(new BorderLayout());
        resultPanel2.add(resultLabel2, BorderLayout.NORTH);
        resultPanel2.add(resultScrollPane2, BorderLayout.CENTER);

        taskPanel2.add(resultPanel2, BorderLayout.CENTER);

        JPanel buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton2 = new JButton("Назад");
        backButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen28");
            }
        });
        buttonPanel2.add(backButton2);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel taskScreen30 = createTaskScreen30(taskDescription30, resultText30);
                contentPanel.add(taskScreen30, "taskScreen30");
                cardLayout.show(contentPanel, "taskScreen30");
            }
        });
        buttonPanel2.add(nextButton2);

        taskPanel2.add(buttonPanel2, BorderLayout.SOUTH);

        return taskPanel2;
    }

    private JPanel createTaskScreen30(String taskDescription, String result) {
        JPanel taskPanel30 = new JPanel(new BorderLayout());

        JLabel taskLabel30 = new JLabel("Задача 30:");
        JTextArea taskTextArea30 = new JTextArea(taskDescription);
        taskTextArea30.setEditable(false);
        taskTextArea30.setLineWrap(true);
        taskTextArea30.setWrapStyleWord(true);
        taskTextArea30.setPreferredSize(new Dimension(400, 100));
        JScrollPane taskScrollPane30 = new JScrollPane(taskTextArea30);

        JPanel taskDescriptionPanel30 = new JPanel(new BorderLayout());
        taskDescriptionPanel30.add(taskLabel30, BorderLayout.NORTH);
        taskDescriptionPanel30.add(taskScrollPane30, BorderLayout.CENTER);

        taskPanel30.add(taskDescriptionPanel30, BorderLayout.NORTH);

        JLabel resultLabel30 = new JLabel("Результат 30:");
        JTextArea resultTextArea30 = new JTextArea(result);
        resultTextArea30.setEditable(false);
        resultTextArea30.setLineWrap(true);
        resultTextArea30.setWrapStyleWord(true);
        resultTextArea30.setPreferredSize(new Dimension(400, 300));
        JScrollPane resultScrollPane30 = new JScrollPane(resultTextArea30);

        JPanel resultPanel30 = new JPanel(new BorderLayout());
        resultPanel30.add(resultLabel30, BorderLayout.NORTH);
        resultPanel30.add(resultScrollPane30, BorderLayout.CENTER);

        taskPanel30.add(resultPanel30, BorderLayout.CENTER);

        JPanel buttonPanel30 = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton30 = new JButton("Назад");
        backButton30.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen29");
            }
        });
        buttonPanel30.add(backButton30);

        JButton nextButton2 = new JButton("Далі");
        nextButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel finalScreen = createFinalScreen();
                contentPanel.add(createFinalScreen(), "createFinalScreen");
                cardLayout.show(contentPanel, "createFinalScreen");
            }
        });
        buttonPanel30.add(nextButton2);

        taskPanel30.add(buttonPanel30, BorderLayout.SOUTH);

        return taskPanel30;
    }

    private JPanel createFinalScreen() {
        JPanel finalPanel = new JPanel(new BorderLayout());

        JLabel thankYouLabel = new JLabel("Дякую за увагу!");
        thankYouLabel.setFont(new Font("Arial", Font.BOLD, 24));
        thankYouLabel.setHorizontalAlignment(SwingConstants.CENTER);
        finalPanel.add(thankYouLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton backButton = new JButton("Назад");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(contentPanel, "taskScreen30");
            }
        });
        buttonPanel.add(backButton);

        JButton exitButton = new JButton("Завершити");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(exitButton);

        finalPanel.add(buttonPanel, BorderLayout.SOUTH);

        return finalPanel;
    }
}
