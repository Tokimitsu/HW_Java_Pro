package Level_4;

// 2. Подсчитать количество элементов, которые больше среднего значения всех элементов в заданном одномерном массиве.

public class Task_2 {

    static int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {

        int answer = answer(arr);
        System.out.println(answer);


    }

    private static int answer(int[] arr) {
        int sum = 0;
        int count = 0;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        int avg = sum / count;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>avg){
                answer ++;
            }
        }



    return answer;
    }
}
