A functional interface in Java is an interface that has only one abstract method, making it suitable for use with lambda expressions and method references (introduced in Java 8).

Runnable, callable, compareable,  consumer,  predicate, Function, supplier, actionListener. etc.....

  
Use @FunctionalInterface to ensure only one abstract method (annotation is optional).
Enable clean, concise code using lambdas and method references.

It has some predefined functional interface in java like, 
* Consumer,
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
// Java program to illustrate AND Predicate

Predicate.............................
What is a Predicate in Java?
👉 A Predicate is a functional interface used to test a condition and return true or false.
🔹 Simple definition (1 line)
Predicate takes one input and returns a boolean value.  

import java.util.function.Predicate;
import java.util.Objects;

class PredicateInterfaceExample5 {
    public static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        @Override
        public boolean test(String t)
        {
            return t.length() > 10;
        }
    };

    public static void predicate_and()
    {
        Predicate<String> nonNullPredicate = Objects::nonNull;

        String nullString = null;

        boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
        System.out.println(outcome);

        String lengthGTThan10 = "Welcome to the machine";
        boolean outcome2 = nonNullPredicate.and(hasLengthOf10).
        test(lengthGTThan10);
        System.out.println(outcome2);
    }
    public static void main(String[] args)
    {
        predicate_and();
    }
}

import java.util.*;
import java.util.function.*;
import java.io.*;
import java.util.stream.*;

class One{
    private String name;
    private String role;
    public One(String name, String role){
        this.name = name;
        this.role = role;
    }
    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public String toString(){
        return "User name : " + name + " Role : " + role;
    }
    public static void main(String[] args) {
        List<One> one = new ArrayList<One>();
        one.add(new One("John", "Admin"));
        one.add(new One("Peter", "Member"));
        List admins = one.stream().filter((ones) -> ones.getRole().equals("Member")).collect(Collectors.toList());
        System.out.println(admins);
    }
}


Function..................

What is Function interface in Java?
👉 Function is a functional interface used to take one input and return one output.
🔹 Definition (1 line)
Function takes one argument and returns a result.

Methods in Function Interface
The Function interface consists of the following 4 methods, as listed, which are later discussed as follows:

apply()
andThen()
compose()
identity()

import java.util.*;
import java.util.function.*;
import java.io.*;
import java.util.stream.*;

public class One {

    public static void main(String[] args) {
        Function<Integer, Integer> addFive = a -> a + 5;
        Function<Integer, Integer> multiplyByTwo = a -> a * 2;
        Function<Integer, Integer> result = addFive.andThen(multiplyByTwo);
        System.out.println(result.apply(3));
    }
}
  
Supplier...................
  What is Supplier in Java?
👉 Supplier is a functional interface that supplies (provides) a value and does NOT take any input.
🔹 Simple definition (1 line)
Supplier returns a value without taking any arguments.
  
