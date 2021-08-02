package com.learnprogramming;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array={56,78,12,65,4,3,1};
        bubbleSort(array);
        for (int i:array
             ) {
            System.out.println(i);
        }
    }
    public static void bubbleSort(int [] array){
        for (int unsortedIndex= array.length -1; unsortedIndex >0 ;unsortedIndex--) {
            for (int i = 0; i < unsortedIndex; i++) {
                if (array[i]>array[i+1]){
                  swap(array,i,i+1 );
                }
            }
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
