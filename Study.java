A functional interface in Java is an interface that has only one abstract method, making it suitable for use with lambda expressions and method references (introduced in Java 8).

Use @FunctionalInterface to ensure only one abstract method (annotation is optional).
Enable clean, concise code using lambdas and method references.

It has some predefined functional interface in java like, 
*Consumer,
* Predicate,
* Supplier. etc...
------------------------------
Consumer Code...
What is Consumer in Java?
👉 Consumer is a functional interface in Java used to accept a value and perform an action, but it does not return anything.
🔹 Simple definition (1 line)
Consumer takes input, performs an operation, and returns nothing.
  code.....
  // Java Program to demonstrate
// Consumer's andThen() method

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String args[]){ 
        Consumer<List<Integer> > modify = list ->{
            for (int i = 0; i <= list.size(); i++)
                list.set(i, 2 * list.get(i));
        };
        Consumer<List<Integer> >
            dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
        System.out.println();
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3); 
        try {
            dispList.andThen(modify).accept(list);
            ;
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}


