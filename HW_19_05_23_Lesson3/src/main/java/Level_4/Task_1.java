package Level_4;

// 1. Найти наименьший и наибольший элементы в заданном одномерном массиве и поменять их местами.

import java.util.Arrays;

public class Task_1 {
    static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        arrProcessing(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void arrProcessing(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            } else if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

    }
}


