package Level_4;

// 3. Проверить, является ли заданный одномерный массив упорядоченным по возрастанию.

public class Task_3 {
    static int[] arr = new int[]{1, 5, 3, 4, 3, 6, 7, 8, 9};

    public static void main(String[] args) {

        System.out.println(orderCheck(arr));
    }

    private static boolean orderCheck(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
          int first = arr[i];
          int second = arr[i+1];

          if(second - first == 1){
              return true;
          }
        }

        return false;
    }
}
