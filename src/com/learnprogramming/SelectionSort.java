package com.learnprogramming;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array={20,35,-12,6,55,1,-22};
        selectionSort(array);
        for (int i:array
        ) {
            System.out.println(i);
        }
    }

    //The swap method has been called less amount of times when it is compared to BubbleSort
    public static void selectionSort(int [] array) {
        for (int unsortedIndex = array.length-1;  unsortedIndex>0 ; unsortedIndex--) {
            int largest=0;
            int i = 1;
            for (; i <unsortedIndex ; i++) {
                if (array[i]>array[largest]){
                    largest=i;
                }
            }
            swap(array,i,largest);
        }
    }
    public static void swap(int [] array,int first,int second){
        if (first==second) return;
        int dummy;
        dummy=array[first];
        array[first]=array[second];
        array[second]=dummy;
    }
}
