package com.learnprogramming;


import java.util.LinkedList;
import java.util.ListIterator;

public class HashTable {
    private LinkedList<StoredEmployee>[] hashTable;

    public HashTable(int capacity) {
        this.hashTable = new LinkedList[capacity];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put(String key,Employee employee) {
        int hashedKey = hash(key);
        StoredEmployee newEmployee=new StoredEmployee(employee,key);
        hashTable[hashedKey].add(newEmployee);
    }

    public Employee get(String key){
        int hashedKey=hash(key);
        ListIterator<StoredEmployee> iterator=hashTable[hashedKey].listIterator();
        StoredEmployee employee;
        while (iterator.hasNext()){
            employee=iterator.next();
            if (employee.getKey().equals(key)){
                return employee.getStoredEmployee();
            }
        }
       return null;
    }

    public Employee remove(String key){
        int hashedKey=hash(key);
        ListIterator<StoredEmployee> iterator=hashTable[hashedKey].listIterator();
        StoredEmployee employee;
        int index=-1;
        while (iterator.hasNext()){
            employee=iterator.next();
            index++;
            if (employee.getKey().equals(key)){
                hashTable[hashedKey].remove(index);
                return employee.getStoredEmployee() ;
            }
        }
        return null;
    }

    public int hash(String key){
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public void print(){
        for (int i = 0; i <hashTable.length ; i++) {
            if (hashTable[i].isEmpty()) {
                System.out.println("Index " + i+": empty");
            }else {
                System.out.print("Index " + i+": ");
                for (StoredEmployee employee : hashTable[i]) {
                    System.out.print(employee.getStoredEmployee());
                    System.out.print(" --> ");
                }
                System.out.println("null");
            }
        }
    }
}
