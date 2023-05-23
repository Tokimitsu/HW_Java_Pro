package Level_1;


//1. Найти сумму элементов в заданном одномерном массиве.


public class Task_1 {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 5, 7, 3, 2, 5, 7, 9, 3, 3, 5, 7, 4};

        sum(arr);
    }


    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

}
