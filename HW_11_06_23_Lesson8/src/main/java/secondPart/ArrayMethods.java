package secondPart;

public class ArrayMethods {
    public void printArray(int[] array) {
        System.out.println("Elements in array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of elements: " + sum);
    }

    public void findMinMaxArr(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Max element in Array: " + max);
        System.out.println("Min element in Array: " + min);
    }

    public void countElementsArr(int[] array) {
        int quantity = 0;
        for (int i = 0; i < array.length; i++) {
            quantity++;
        }
        System.out.println("Quantity of elements in Array: " + quantity);
    }

    public void findAverageArr(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Average of elements in Array: " + sum / array.length);
    }


}
