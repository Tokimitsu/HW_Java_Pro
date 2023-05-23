package Level_2;

// 3. Проверить, есть ли в заданном одномерном массиве повторяющиеся элементы.

public class Task_3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(hasDuplicates(arr));

    }

    public static boolean hasDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
