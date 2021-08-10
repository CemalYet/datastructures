package com.learnprogramming;

import java.util.EmptyStackException;

public class StackArray {

    private  Employee [] stack;
    private int top;

    public StackArray(int size) {
        this.stack = new Employee[size];
    }

    public void push (Employee value){
        if (stack.length==top){
            Employee [] newArray=new Employee[top*2];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack=newArray;
        }
        stack[top++]=value;
    }
     public Employee pop(){
        if (top==0){
            throw new EmptyStackException();
        }
        Employee value=stack[--top];
        stack[top]=null;
        return value;
     }
     public Employee peek(){
         if (top==0){
             throw new EmptyStackException();
         }
         return stack[top-1];
     }

     public int size(){
        return top;
     }

    public boolean isEmpty() {
        return top == 0;
    }

     public void printStack(){
         for (int i = top-1; i>=0 ; i--) {
             System.out.println(stack[i]);
         }
     }
}
