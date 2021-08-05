package com.learnprogramming;

public class ShellSort {
    public static void main(String[] args) {
        int [] array={20,35,-12,6,55,1,-22};
        shellSort(array);
        for (int i:array
        ) {
            System.out.println(i);
        }
    }


    public static void shellSort(int [] array) {
        for (int gap= array.length/2; gap>0 ; gap/=2) {
            for ( int i=gap; i < array.length; i++) {
                int newElement = array[i];
                int j;
                for (j = i; j >=gap && array[j - gap] > newElement; j -= gap) {
                    array[j] = array[j-gap];
                }
                array[j] = newElement;
            }
        }
    }
}
