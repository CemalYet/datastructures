package com.learnprogramming;

public class MergeSort {

    public static void main(String[] args) {

    }
    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {
        //If the array length is less than one then the array is automatically sorted.
        //This is a breaking point if the recursive method.
        //It is important for recursive method not to go stackoverflow.
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        //Method is starting to split the array from left part.
        //Since the method is recursive it finishes the first left part { 20, 35, -15} to split.
        mergeSort(input, start, mid);
        //Then starts the right part {7, 55, 1, -22} to split.
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    // { 20, 35, -15, 7, 55, 1, -22 }
    public static void merge(int[] input, int start, int mid, int end) {

        //Optimization point.
        //The method always is merging the sorted left and right part.
        //if the [mid-1] refers to last element of the right part is smaller than
        //[mid]refers to first element of the right part then the two array can combine without needing any coding process.
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        //comparing left to right array.
        //smaller one is put to the temp array.
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        //If there is a element that is leftover.There is no need to put it to temp array.
        //This part of code put it to right place on the original array without copying it to temp array.
        //It is only changing the position of the leftover element of the right side.
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);


    }

}
