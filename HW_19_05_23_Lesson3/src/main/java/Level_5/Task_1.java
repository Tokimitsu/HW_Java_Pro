package Level_5;

// 1. Найти второй по величине элемент в заданном одномерном массиве.

public class Task_1 {
    static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1234, 5531};

    public static void main(String[] args) {
        findSecondMin(arr);

    }

    private static void findSecondMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);

    }
}
