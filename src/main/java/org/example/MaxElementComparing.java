package org.example;

public class MaxElementComparing {
    public static void main(String[] args){
        int[] numbers = null;
        findMaxElement(numbers);
    }

    static void findMaxElement(int[] numbers){
        try {
            int max = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                System.out.println("The maximum is " + max);
            }
        } catch (NullPointerException e) {
            System.out.println("There is no data in the array");
        }
    }
}
