package Level_1;

// 3. Подсчитать количество четных элементов в заданном одномерном массиве.

public class Task_3 {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 2, 7, 8, 9, 3, 2, 5, 8, 33,3,55};
        evenCount(arr);
    }

    public static void evenCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                count++;
            }

        }
        System.out.println(count);
    }
}
