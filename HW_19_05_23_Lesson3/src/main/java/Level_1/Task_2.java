package Level_1;


// 2. Найти наибольший элемент в заданном одномерном массиве.


public class Task_2 {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 6, 2, 7, 8, 9, 3, 2, 5, 8, 33,3,55};
        findMax(arr);

    }

    public static void findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
