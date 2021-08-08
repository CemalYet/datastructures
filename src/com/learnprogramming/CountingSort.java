package com.learnprogramming;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int [] array={12,20,17,17,16,13,9};
        countingSort(array,9,21);

    }
    public static void countingSort(int [] array,int min,int max){
        int [] dummyArray=new int[max-min+1];

        Arrays.stream(array).forEach(value -> dummyArray[value - min]++);
        var count = 0;
        int j=0;
        int number=min;
        for (int k : dummyArray) {
            if (k != 0) {
                count = k;
                while (count > 0) {
                    array[j] = number;
                    count--;
                    j++;
                }
            }
            number++;

        }
        Arrays.stream(array).mapToObj(i -> i + " ").forEach(System.out::print);
    }
}
