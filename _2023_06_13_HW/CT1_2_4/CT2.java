package org.example._2023_06_13_HW.CT1_2_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CT2 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3, "d", 4);
        Map<Integer, Boolean> map2 = Map.of(1, true, 2, false, 3, false, 4, true);
        System.out.println("-".repeat(50));
        System.out.println(findKeys(map, 2));
        System.out.println("-".repeat(50));
        System.out.println(hasValueAboveThreshold(map, 2));
        System.out.println("-".repeat(50));
        System.out.println(allValuesTrue(map2));
        System.out.println("-".repeat(50));
        String[] arr = {"a", "c","e"};
        System.out.println("Calculate sum");
        System.out.println(calculateSum(map,arr));
        System.out.println("-".repeat(50));
        System.out.println(findTrueKeys(map2));

    }
    /**
    1. Найти все ключи в Map<String, Integer>, соответствующие заданному значению, и вернуть их в виде списка.
    public static List<String> findKeys(Map<String, Integer> inputMap, int targetValue)
     */

    public static List<String> findKeys(Map<String, Integer> inputMap, int targetValue) {
        List<String> result = new ArrayList<>();
        for (Map.Entry <String, Integer> entry : inputMap.entrySet()) {
            if (entry.getValue() == targetValue) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    /**
     * 2. Проверить, содержит ли Map<String, Integer> хотя бы одну запись, у которой значение больше заданного порога.
     * public static boolean hasValueAboveThreshold(Map<String, Integer> inputMap, int threshold)
     */

    public static boolean hasValueAboveThreshold(Map<String, Integer> inputMap, int threshold) {
        for (Map.Entry <String, Integer> entry : inputMap.entrySet()) {
            if(entry.getValue() > threshold){
                return true;
            }
        }

        return false;
    }
    /**
     3.Проверить, все ли значения в Map<Integer, Boolean> равны true.
     public static boolean allValuesTrue(Map<Integer, Boolean> inputMap)
     */

    public static boolean allValuesTrue(Map<Integer, Boolean> inputMap){
        for (Map.Entry <Integer, Boolean> entry : inputMap.entrySet()) {
            if(!entry.getValue()){
                return false;
            }
        }
        return true;
    }
/**
     * 4. Найти сумму всех значений(int) в Map<String, Integer>, которые соответствуют заданному ключевому набору.
     * public static int calculateSum(Map<String, Integer> inputMap, String[] keys)
    */

    public static int calculateSum(Map<String, Integer> inputMap, String[] keys){
        int sum = 0;
        for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
            for (String key : keys) {
                if (Objects.equals(entry.getKey(), key)) {
                    sum += entry.getValue();
                }
            }
        }

        return sum;
    }

/**
5.Получить все ключи Map<Integer, Boolean>, у которых значение равно true, и вернуть их в виде списка.
public static List<Integer> findTrueKeys(Map<Integer, Boolean> inputMap)
*/
public static List<Integer> findTrueKeys(Map<Integer, Boolean> inputMap){
    List<Integer> result = new ArrayList<>();
    for (Map.Entry <Integer, Boolean> entry : inputMap.entrySet()) {
        if(entry.getValue()){
            result.add(entry.getKey());
        }
    }
    return result.stream().sorted().toList();


}
}