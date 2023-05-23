package Level_3;

import java.util.Arrays;

public class Task_3 {
    static int[] arr = new int[]{-2, 4, 5, 1, -45, -4, -2, 4, 6, 1, 22, 3, -4};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        int[] newArr = removeNeg(arr);
        System.out.println(Arrays.toString(newArr));
    }

    private static int[] removeNeg(int[] arr) {
        int count = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }


        int[] newArr = new int[count];
        int newIndex = 0;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }

        return newArr;
    }
}
