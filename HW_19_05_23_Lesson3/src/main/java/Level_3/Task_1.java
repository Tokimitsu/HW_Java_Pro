package Level_3;

// 1. Отсортировать заданный одномерный массив по возрастанию.

import java.util.Arrays;

public class Task_1 {

    public static void main(String[] args) {
        int[] arr = new int[]{6,4,3,1,5,2,9,7,8};
        System.out.println(Arrays.toString(arr));
        sortarray(arr);
        System.out.println("==================");
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sortarray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp = 0;
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j] = temp;
                }
            }
        }


        return arr;
    }
}
