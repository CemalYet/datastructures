package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
       /* StackArray stack = new StackArray(10);

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));
        stack.push(new Employee("Mike", "Wilson", 3245));
        stack.push(new Employee("Bill", "End", 78));

        stack.printStack();
*/
        //System.out.println(stack.peek());
        //stack.printStack();

        //System.out.println("Popped: " + stack.pop());
        //System.out.println(stack.peek());

        //-------------Hash Table-------------------------------
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        HashTable ht = new HashTable(10);
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);

        //ht.print();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Doe");
        ht.remove("Jones");
        ht.print();
//

    }
}
