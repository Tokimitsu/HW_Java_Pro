package Level_3;

// 2. Проверить, является ли заданный одномерный массив палиндромом (читается одинаково слева направо и справа налево).

public class Task_2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"J", "o", "n", "n", "y"};
        String[] arr1 = new String[]{"A", "b", "b", "a"};
        System.out.println(palindromeCheck(arr));
        System.out.println(palindromeCheck(arr1));
    }

    private static boolean palindromeCheck(String[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            String leftStr = arr[left].toLowerCase();
            String rightStr = arr[right].toLowerCase();

            if (!leftStr.equals(rightStr)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
