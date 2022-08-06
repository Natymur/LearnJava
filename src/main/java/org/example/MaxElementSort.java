package org.example;

import java.util.Arrays;

public class MaxElementSort {
    public static void main(String[] args){
        int[] numbers = {};
        findMaxElement(numbers);
    }

    static void findMaxElement(int[] numbers) {
        Arrays.sort(numbers);
        try {
            System.out.println("The maximum is " + numbers[numbers.length-1]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("There is no data in the array");
        }
    }
}
