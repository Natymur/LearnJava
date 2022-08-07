package org.myproject;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        quickSort(numbers);
    }

    static void quickSort(int[] numbers) {
        long start = System.currentTimeMillis();
        Arrays.sort(numbers);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
    }

}
