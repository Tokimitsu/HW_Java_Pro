package Level_2;

// 2. Найти произведение элементов в заданном одномерном массиве.


public class Task_2 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        findMult(arr);
    }

    public static void findMult(int[] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            sum *= arr[i];
        }
        System.out.println(sum);
    }

}
