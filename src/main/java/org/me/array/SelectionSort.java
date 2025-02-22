package org.me.array;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] randomNumbers = new int[50];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }

        // Print the array
        System.out.print("Random Numbers: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }

//        int[] nums = {5, 7, 2, 11, 1};

        for (int i = 0; i < randomNumbers.length - 1; i++) {
            int min = randomNumbers[i];
            for (int j = i + 1; j < randomNumbers.length; j++) {
                int current = randomNumbers[j];
                if (min > current) {
                    randomNumbers[i] = current;
                    randomNumbers[j] = min;
                    min = current;
                }
            }
        }

        System.out.println();
        System.out.print("Random Numbers after sorted: ");
        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }
    }
}
