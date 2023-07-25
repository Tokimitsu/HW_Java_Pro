package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.example.Generator.*;

public class Filter {

    public static void main(String[] args) {
        System.out.println("Список developers : ");
        System.out.println("----------------------------------------------");
        generateDeveloper(7);
        for (Developer developer : developers) {
            System.out.println(developer);
        }
        System.out.println("----------------------------------------------");
        System.out.println("Метод, который будет проходиться по листу Developers и выводить всех " +
                "мужчин у которых спортивная машина");
        System.out.println("----------------------------------------------");
        findMenWithSportsCar(developers).forEach(System.out::println);
        System.out.println("----------------------------------------------");
        System.out.println("группировать по полу все машины. те у мужчин такие-то у женщин такие-то");
        System.out.println("----------------------------------------------");
        groupBySex(developers);
        System.out.println("----------------------------------------------");
        System.out.println("Переводить в мапу ключ-девелопер а значение максимальная скорость авто");
        System.out.println("----------------------------------------------");
        findDevAndMaxSpeed(developers);
        System.out.println("----------------------------------------------");
        System.out.println("записывать в текстовый файл всех девелоперов в формате : " +
                "Jonn-[auto: BMW ::: salary: 12345] в столбик");
        System.out.println("----------------------------------------------");
        writeDevelopersToFile(developers);

    }

    public static List<Developer> findMenWithSportsCar(List<Developer> developers) {
        return developers.stream()
                .filter(x -> x.getSex() == 'M')
                .filter(x -> x.getCar().isSport())
                .toList();
    }

    public static void groupBySex(List<Developer> developers) {
        Map<Character, List<Car>> map = developers.stream()
                .collect(Collectors.groupingBy(Developer::getSex,
                        Collectors.mapping(Developer::getCar, Collectors.toList())));


        for (Map.Entry<Character, List<Car>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    private static Map<Developer, Integer> findDevAndMaxSpeed(List<Developer> developers) {
        Map<Developer, Integer> map = developers.stream()
                .collect(Collectors.toMap(x -> x, x -> x.getCar().getMaxSpeed()));
        for (Map.Entry<Developer, Integer> entry : map.entrySet()) {
            System.out.println("Developer : " + entry.getKey() + ", max speed : " + entry.getValue());
        }
        return map;
    }

    private static void writeDevelopersToFile(List<Developer> developers) {
        try ( FileWriter fileWriter = new FileWriter("Devs.txt")) {
            StringBuilder sb = new StringBuilder();
            for (Developer developer : developers) {
               sb.append(developer.getName());
               sb.append("-[auto: ");
               sb.append(developer.getCar().getModel());
               sb.append(" ::: salary: ");
               sb.append(developer.getSalary());
               sb.append("] \n");

               fileWriter.write(sb.toString());
               sb.setLength(0);


            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }









    }








}
