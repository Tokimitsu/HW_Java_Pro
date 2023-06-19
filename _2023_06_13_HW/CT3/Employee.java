package org.example._2023_06_13_HW.CT3;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    static Map<Integer, String> info = new HashMap<>();

    public static void main(String[] args) {
      addEmployee(1, "John Huggins");
      addEmployee(2, "Harry Potter");
      addEmployee(3, "Hermione Granger");
      addEmployee(4, "Ron Weasley");
      addEmployee(5, "Draco Malfoy");
        printEmployees(info);
    }

    private static void printEmployees(Map<Integer, String> map) {
        for(Map.Entry<Integer, String> entry : info.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void addEmployee(int id, String name){
        info.put(id, name);
    }

}
