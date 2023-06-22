package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods {
    public void fillMap(Map<String, Integer> map) {
        String[] keys = {"a", "ab", "c", "d", "e", "f", "g", "h", "i", "j"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
    }

    public void fillMap2(Map<String, String> map) {
        String[] keys = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] values = {"111w", "at1te", "332", "arddd1r", "235", "ad1f", "732", "qq1we", "213", "a3bc"};
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
    }

    public void printKeys(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
        System.out.println();
    }

    public void containsTargetValue(Map<String, Integer> map, int target) {
        boolean found = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The value " + target + " is in the map");
        } else {
            System.out.println("The value " + target + " is not in the map");
        }
    }

    public void findTargetValuesKey(Map<String, Integer> map, int target) {
        String foundKey = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == target) {
                foundKey = entry.getKey();
                break;
            }
        }

        if (foundKey != null) {
            System.out.println("The key associated with the target value : " + target + " is : " + foundKey);
        } else {
            System.out.println("The key associated with the target value : " + target + " is not found");
        }
    }

    public void findKeysByStartLetter(Map<String, Integer> map, char target) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().charAt(0) == target) {
                System.out.println("The key associated with the target value : " + target + " is : " + entry.getKey());
            }
        }
    }

    public void containsTargetKey(Map<String, Integer> map, String target) {
        if (map.containsKey(target)) {
            System.out.println("The key " + target + " is in the map");
        } else {
            System.out.println("The key " + target + " is not in the map");
        }
    }

    public void findMaxValueKey(Map<String, Integer> map) {
        int maxValue = 0;
        String maxKey = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println("Max value is : " + maxValue + " the key is : " + maxKey);
    }

    public void countKeysByWord(Map<String, Integer> map, String target) {
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().contains(target)) {
                count++;
            }
        }
        System.out.println("The number of keys that contain the word : " + target + " is : " + count);
    }

    public void findKeysByOnlyNumbers(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().matches("[0-9]+")) { // Provided by ChatGPT, regex for numbers.
                System.out.println("The key associated with the target value : " + entry.getValue() + " is : " + entry.getKey());
            }
        }
    }

    public void sumValueNumbers(Map<String, String> map) {
        int sum = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().matches("[0-9]+")) { // Provided by ChatGPT, regex for numbers.
                sum += Integer.parseInt(entry.getValue());
            }
        }
        System.out.println("The sum of all number values is : " + sum);
    }

    public void countKeysByLength(Map<String, String> map, int target) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getValue().length() > target){
                System.out.println("The target length key is : " + entry.getKey() +
                        " (" + entry.getValue() + ")");
            }
        }
    }

    public void createNewMap(Map<String, Integer> map) {
        Map<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("The old map is : " + map);
        System.out.println("The new map is : " + newMap);
    }

    public void clearMap(Map<String, Integer> map) {
        map.clear();
        System.out.println("The map is cleared");
        System.out.println(map);
    }

    public void printList(List<String> list) {
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void printListReverse(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public void sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println("The sum of the array is : " + sum);
    }

    public void minMaxArray(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The min value is : " + min + " and the max value is : " + max);
    }

    public void countEvenArray(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("The count of even values is : " + count);
    }

    public void sortReverseArray(int[] array) {
        Arrays.sort(array);
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        System.out.println("The reversed array is : " + Arrays.toString(reverseArray));


    }

    public void sumSquareArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i * i;
        }
        System.out.println("The sum of squares is : " + sum);
    }

    public void sumAllArray(int[][] array2) {
        int sum = 0;
        for (int[] array : array2) {
            for (int i : array) {
                sum += i;
            }
        }
        System.out.println("The sum of all elements is : " + sum);


    }

    public void maxValueInArrayRow(int[][] array2) {
        int [] maxValues = new int[array2.length];
        for (int i = 0; i < array2.length; i++) {
            int max = array2[i][0];
            for (int j = 0; j < array2[i].length; j++) {
                if (array2[i][j] > max) {
                    max = array2[i][j];
                }
            }
            maxValues[i] = max;
            System.out.println("The max value in row " + (i+1) + " is : " + max);
        }
    }

    public void averageValueInArrayColumn(int[][] array2) {
        int [] averageValues = new int[array2[0].length];
        for (int i = 0; i < array2[0].length; i++) {
            int sum = 0;
            for (int[] array : array2) {
                sum += array[i];
            }
            averageValues[i] = sum / array2.length;
            System.out.println("The average value in column " + (i+1) + " is : " + averageValues[i]);
        }
    }

    public void countTargetElementsInArray(int[][] array2, int i) {
        int count = 0;
        for (int[] array : array2) {
            for (int j : array) {
                if (j % i == 0) {
                    count++;
                }
            }
        }
        System.out.println("The count of target elements is : " + count);
    }

    public void sumOddRowsInArray(int[][] array2) {
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 != 0) {
                for (int j : array2[i]) {
                    sum += j;
                }
            }
        }
        System.out.println("The sum of odd rows is : " + sum);
    }
}
