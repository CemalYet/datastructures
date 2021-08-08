package com.learnprogramming;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array={20,35,-12,6,55,1,-22};
        recursiveInsertion(array, array.length);
        for (int i:array
        ) {
            System.out.println(i);
        }
    }

    public static void insertionSort(int [] array) {
        for ( int unsortedIndex=1; unsortedIndex <array.length ; unsortedIndex++) {
            int newElement=array[unsortedIndex];
            int i;
            //array[i-1]>newElement if this statement is not true the array has been already sorted.
            // No need for compare operation
            for (i = unsortedIndex; i >0 && array[i-1]>newElement; i--) {
                    array[i]=array[i-1];

            }
            array[i]=newElement;
        }
    }
    //recursive InsertionSort
    public static void recursiveInsertion(int [] array, int lastElementIndex){
        if (lastElementIndex==1) return;

        int newElementIndex=lastElementIndex-1;
        recursiveInsertion(array,newElementIndex);

        int i;
        int newElement=array[newElementIndex];
        for (i = newElementIndex; i > 0 && array[i-1]>newElement; i--) {
            array[i]=array[i-1];
        }
        array[i]=newElement;
    }
}
