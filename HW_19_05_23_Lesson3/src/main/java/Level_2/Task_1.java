package Level_2;

// 1. Проверить, является ли заданный одномерный массив симметричным (элементы симметрично расположены относительно центра).

public class Task_1 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 5, 4, 3, 2, 1};


        System.out.println(isSymmetric(arr));
        System.out.println(isSymmetric(arr1));
        System.out.println(isSymmetric(arr2));
    }

    public static boolean isSymmetric(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


}
