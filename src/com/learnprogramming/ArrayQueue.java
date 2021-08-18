package com.learnprogramming;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if (size() == queue.length - 1) {
            int numItems = size();
            //resize the array
            Employee[] newArray = new Employee[2 * queue.length];
            //put mike(3) and bill(4) to resized array position 0 and 1
            System.arraycopy(queue, front, newArray, 0, queue.length - front);

            //put jane(0) and john(1) to resized array position 2 and 3.
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            //points resized array
            queue = newArray;

            front = 0;
            back = numItems;
        }
        //1.circular behaviour
        // 0   jane
        // 1    john
        // 2  -   -back
        // 3  -mike - front
        // 4   -bill

        //2.resized normal behaviour
        // 0 mike
        // 1 bill
        // 2 jane
        // 3 john
        // 4 - back
        // 5
        // 9

        //adds employee
        queue[back] = employee;
        //behave as normal queue if back pointer smaller than queue length
        if (back < queue.length - 1) {
            back++;
        }
        //behave as circular queue.
        else {
            back = 0;
        }
    }

    public Employee remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        //
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        //covers the circular behaviour
        else if (front == queue.length) {
            front = 0;
        }

        return employee;
    }

    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        if (front <= back) {
            return back - front;
        }
        else {
            return back - front + queue.length;
        }

    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
        else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }

}
