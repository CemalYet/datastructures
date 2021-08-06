package com.learnprogramming;

public class QuickSort {
    public static void main(String[] args) {
        int [] array={56,78,12,65,4,3,1};
        quickSort(array,0,array.length);
        for (int i:array
        ) {
            System.out.println(i);
        }
    }

    public static void quickSort(int [] array,int start,int end) {
        if (end-start < 2){
            return;
        }
        //assign the sorted position of the pivot element.
        int pivotIndex = partition(array,start,end) ;
        //sort right part of the array.Then continue
        quickSort(array,start,pivotIndex);
        //sort the left part of the array.
        quickSort(array,pivotIndex+1,end);
    }

    public static int partition(int [] array,int start,int end){
        int pivot=array[start];
        int i=start;
        int j=end;
        while (i<j){
            //decrement until find an element that is smaller than pivot,in the left partition
            while (i<j && array[--j]>=pivot);
            //then move that element to right part of the array.
                if (i < j) array[i]=array[j];
            //vice versa
            while (i<j && array[++i]<=pivot);
                if (i < j) array[j] = array[i];
        }
        array[j]=pivot;
        return j;
    }
}
