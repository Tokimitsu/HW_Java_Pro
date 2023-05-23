package Level_5;

// 2. Перевернуть заданный одномерный массив (элементы располагаются в обратном порядке).
public class Task_2 {
    static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {

        revertArr(arr);
    }

    private static void revertArr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
