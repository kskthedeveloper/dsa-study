package org.me.array;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {20, 3, 5, 2, 1};
//        int[] array = {5, 3, 1};

        printArray(sort(array));
    }

    public static int[] sort (int[] array) {
        int min = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        return array;
    }

    public static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
