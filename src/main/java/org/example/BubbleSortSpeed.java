package org.example;


public class BubbleSortSpeed {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = (int)(Math.random()*10);
        }
        bubbleSorter(numbers);
    }

    static void bubbleSorter(int[] numbers){
        long start = System.currentTimeMillis();
            boolean isSorted = false;
            int buffer;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < numbers.length - 1; i++) {
                    if (numbers[i] > numbers[i + 1]) {
                        isSorted = false;
                        buffer = numbers[i];
                        numbers[i] = numbers[i + 1];
                        numbers[i + 1] = buffer;
                    }
                }
            }
        System.out.println(numbers[3]);
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Time: " + elapsed);
    }


}

