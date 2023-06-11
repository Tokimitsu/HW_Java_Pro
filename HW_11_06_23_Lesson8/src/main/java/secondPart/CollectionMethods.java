package secondPart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionMethods {
    public static void main(String[] args) {
    }


    public void printCollection(List<Integer> list) {
        System.out.println("Elements in collection: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void sumCollection(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("Sum of elements: " + sum);
    }


    public void findMinMaxColl(List<Integer> list) {
        int min = list.get(0);
        for (Integer i : list) {
            if (i < min) {
                min = i;
            }
        }
        int max = list.get(0);
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Max element in collection: " + max);
        System.out.println("Min element in collection: " + min);
    }

    public void countElementsColl(List<Integer> list) {
        int quantity = 0;
        for (Integer i : list) {
            quantity++;
        }
        System.out.println("Quantity of elements in collection: " + quantity);
    }

    public void findAverageColl(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("Average of elements in collection: " + sum / list.size());
    }

}

