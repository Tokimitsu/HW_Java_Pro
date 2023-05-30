package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Methods {
    static Random rnd = new Random();

    // Arrays and ArrayList creation methods

    public int[] array(int size, int bound) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {

            array[i] = rnd.nextInt(bound);
        }
        System.out.println("Array elements are: " + Arrays.toString(array));
        return array;
    }

    public Integer[] palindromeArray() {
        ArrayList<Integer[]> palindrome = new ArrayList<>();
        palindrome.add(new Integer[]{1, 2, 3, 2, 1});       //true
        palindrome.add(new Integer[]{1, 2, 3, 2, 2});       //false
        palindrome.add(new Integer[]{2, 3, 2, 3, 2});       //true
        palindrome.add(new Integer[]{1, 2, 3, 2, 3});       //false
        palindrome.add(new Integer[]{1, 2, 2, 2, 1});       //true

        int randomIndex = rnd.nextInt(4);

        System.out.println("Array elements are: " + Arrays.toString(palindrome.get(randomIndex)));
        return palindrome.get(randomIndex);
    }

    public ArrayList<Integer> arrayList() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arr.add(rnd.nextInt(15));
        }
        System.out.println("Array elements are: " + arr);
        return arr;
    }


    // Arrays methods

    public void arrSum(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array elements is: " + sum);
        System.out.println("============================================");
    }

    public void arrMinMax(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum element is: " + min + ", maximum element is: " + max);
        System.out.println("============================================");
    }

    public void secondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }
        System.out.println("Second maximum element is: " + array[1]);
        System.out.println("============================================");
    }

    public void mostFrequent(int[] array) {
        int max = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                max = array[i];
            }
        }
        System.out.println("Most frequent element is: " + max);
        System.out.println("============================================");
    }

    public void isPalindrome(Integer[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) {
                System.out.println("Array is not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Array is palindrome");
        System.out.println("============================================");
    }

    public void positiveSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Sum of positive elements is: " + sum);
        System.out.println("============================================");
    }

    public void contains(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Array contains " +
                        "target element " + target);
                return;
            } else {
                System.out.println("Array doesn't contain " +
                        "target element " + target);
                System.out.println("============================================");
                System.out.println(" ");
                return;
            }
        }
    }

    // List Methods

    public void listSum(ArrayList<Integer> listStart) {
        int sum = 0;
        for (Integer integer : listStart) {
            sum += integer;
        }
        System.out.println("Sum of ArrayList elements is: " + sum);
        System.out.println("============================================");
    }

    public void listMax(ArrayList<Integer> arrayList) {
        int max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }
        System.out.println("Maximum element is: " + max);
        System.out.println("============================================");
    }

    public void listRemoveEven(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }
        System.out.println("Odd arrayList elements are: " + arrayList);
        System.out.println("============================================");
    }

    public void listPositiveCount(ArrayList<Integer> arrayList) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > 0) {
                count++;
            }
        }
        System.out.println("ArrayList contains |" + count + "| positive elements");
    }

    public void listContains(ArrayList<Integer> arrayList, int target) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == target) {
                System.out.println("ArrayList contains " +
                        "target element " + target);
                return;
            } else {
                System.out.println("ArrayList doesn't contain " +
                        "target element " + target);
                System.out.println("============================================");
                return;
            }
        }
    }

    public void listSortAscending(ArrayList<Integer> arrayList) {
        int temp = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("============================================");
    }

    public void listSecondMin(ArrayList<Integer> arrayList) {
        int min = arrayList.get(0);
        int secondMin = arrayList.get(0);

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > min) {
                secondMin = min;
                min = arrayList.get(i);
            } else if (arrayList.get(i) > secondMin && arrayList.get(i) != min) {
                secondMin = arrayList.get(i);
            }
        }
        System.out.println("Second minimum element is: " + secondMin);
        System.out.println("============================================");
    }

    public void listMerge(ArrayList<Integer> arrayList, ArrayList<Integer> arrayList1) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(arrayList);
        mergedList.addAll(arrayList1);

        for (int i = 0; i < mergedList.size(); i++) {
            for (int j = i + 1; j < mergedList.size(); j++) {
                if (mergedList.get(i) == mergedList.get(j)) {
                    mergedList.remove(j);
                }
            }
        }
        System.out.println("Merged ArrayList: " + mergedList);
        System.out.println("============================================");

    }

    public void findLongestSequence(ArrayList<Integer> arrayList) {
        ArrayList<Integer> currentSequence = new ArrayList<>();
        ArrayList<Integer> longestSequence = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (currentSequence.isEmpty() || arrayList.get(i) > currentSequence.get(currentSequence.size() - 1)) {
                currentSequence.add(arrayList.get(i));
            } else {
                if (currentSequence.size() > longestSequence.size()) {
                    longestSequence = new ArrayList<>(currentSequence);
                }
                currentSequence.clear();
                currentSequence.add(arrayList.get(i));
            }
        }

        if (currentSequence.size() > longestSequence.size()) {
            longestSequence = new ArrayList<>(currentSequence);
        }
        System.out.println("Longest sequence is: " + longestSequence);
        System.out.println("============================================");
    }

    public void findLongestDecreaseSequence(ArrayList<Integer> arrayList) {
        ArrayList<Integer> currentSequence = new ArrayList<>();
        ArrayList<Integer> longestSequence = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (currentSequence.isEmpty() || arrayList.get(i) < currentSequence.get(currentSequence.size() - 1)) {
                currentSequence.add(arrayList.get(i));
            } else {
                if (currentSequence.size() > longestSequence.size()) {
                    longestSequence = new ArrayList<>(currentSequence);
                }
                currentSequence.clear();
                currentSequence.add(arrayList.get(i));
            }
        }

        if (currentSequence.size() > longestSequence.size()) {
            longestSequence = new ArrayList<>(currentSequence);
        }
        System.out.println("Longest sequence is: " + longestSequence);
        System.out.println("============================================");
    }

    public ArrayList<Integer> listUnique(ArrayList<Integer> arrayList) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (!uniqueList.contains(arrayList.get(i))) {
                uniqueList.add(arrayList.get(i));
            }
        }
        System.out.println("Unique arrayList elements are: " + uniqueList);
        System.out.println("============================================");
        return uniqueList;
    }

    public void listRemoveDuplicates(ArrayList<Integer> arrayList) {
        for (int i = 0; i <arrayList.size() ; i++) {
            for (int j = 1; j < arrayList.size()-1; j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    arrayList.remove(j);
                }
            }
        }
        System.out.println("Array without duplicates is: " + arrayList);
        System.out.println("============================================");
    }
}
